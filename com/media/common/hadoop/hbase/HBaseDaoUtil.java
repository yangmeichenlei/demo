package com.media.common.hadoop.hbase;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.filter.CompareFilter;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.util.Bytes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by lihaiqiang on 2018/08/23.
 */
@Component("hBaseDaoUtil")
public class HBaseDaoUtil {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    // 关闭连接
    public static void close() {
        if (HconnectionFactory.connection != null) {
            try {
                HconnectionFactory.connection.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void createTable(String tableName, Set<String> familyColumn) {
        TableName tn = TableName.valueOf(tableName);
        try (Admin admin = HconnectionFactory.connection.getAdmin();) {
            HTableDescriptor htd = new HTableDescriptor(tn);
            for (String fc : familyColumn) {
                HColumnDescriptor hcd = new HColumnDescriptor(fc);
                htd.addFamily(hcd);
            }
            admin.createTable(htd);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("创建" + tableName + "表失败！", e);
        }
    }

    public void dropTable(String tableName) {
        TableName tn = TableName.valueOf(tableName);
        try (Admin admin = HconnectionFactory.connection.getAdmin();) {
            admin.disableTable(tn);
            admin.deleteTable(tn);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("删除" + tableName + "表失败！");
        }
    }

    public <T> List<T> queryScan(T obj, Map<String, String> param) throws Exception {
        List<T> objs = new ArrayList<T>();
        String tableName = getORMTable(obj);
        if (StringUtils.isBlank(tableName)) {
            return null;
        }
        try (Table table = HconnectionFactory.connection.getTable(TableName.valueOf(tableName));
                Admin admin = HconnectionFactory.connection.getAdmin();) {
            if (!admin.isTableAvailable(TableName.valueOf(tableName))) {
                return objs;
            }
            Scan scan = new Scan();
            for (Map.Entry<String, String> entry : param.entrySet()) {
                Class<?> clazz = obj.getClass();
                Field[] fields = clazz.getDeclaredFields();
                for (Field field : fields) {
                    if (!field.isAnnotationPresent(HbaseColumn.class)) {
                        continue;
                    }
                    field.setAccessible(true);
                    HbaseColumn orm = field.getAnnotation(HbaseColumn.class);
                    String family = orm.family();
                    String qualifier = orm.qualifier();
                    if (qualifier.equals(entry.getKey())) {
                        Filter filter = new SingleColumnValueFilter(Bytes.toBytes(family),
                                Bytes.toBytes(entry.getKey()), CompareFilter.CompareOp.EQUAL,
                                Bytes.toBytes(entry.getValue()));
                        scan.setFilter(filter);
                    }
                }
            }
            ResultScanner scanner = table.getScanner(scan);
            for (Result result : scanner) {
                @SuppressWarnings("unchecked")
                T beanClone = (T) BeanUtils.cloneBean(HBaseBeanUtil.resultToBean(result, obj));
                objs.add(beanClone);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询失败！");
            throw new Exception(e);
        }
        return objs;
    }

    public <T> List<T> get(T obj, String... rowkeys) {
        List<T> objs = new ArrayList<T>();
        String tableName = getORMTable(obj);
        if (StringUtils.isBlank(tableName)) {
            return objs;
        }
        try (Table table = HconnectionFactory.connection.getTable(TableName.valueOf(tableName));
                Admin admin = HconnectionFactory.connection.getAdmin();) {
            if (!admin.isTableAvailable(TableName.valueOf(tableName))) {
                return objs;
            }
            List<Result> results = getResults(tableName, rowkeys);
            if (results.isEmpty()) {
                return objs;
            }
            for (int i = 0; i < results.size(); i++) {
                T bean = null;
                Result result = results.get(i);
                if (result == null || result.isEmpty()) {
                    continue;
                }
                try {
                    bean = HBaseBeanUtil.resultToBean(result, obj);
                    objs.add(bean);
                } catch (Exception e) {
                    e.printStackTrace();
                    logger.error("查询异常！", e);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objs;
    }

    public <T> boolean save(@SuppressWarnings("unchecked")T... objs) {
        List<Put> puts = new ArrayList<Put>();
        String tableName = "";
        try (Admin admin = HconnectionFactory.connection.getAdmin();) {
            for (Object obj : objs) {
                if (obj == null) {
                    continue;
                }
                tableName = getORMTable(obj);
                // 表不存在，先获取family创建表
                if (!admin.isTableAvailable(TableName.valueOf(tableName))) {
                    // 获取family, 创建表
                    Class<?> clazz = obj.getClass();
                    Field[] fields = clazz.getDeclaredFields();
                    Set<String> set = new HashSet<>(10);
                    for (int i = 0; i < fields.length; i++) {
                        if (!fields[i].isAnnotationPresent(HbaseColumn.class)) {
                            continue;
                        }
                        fields[i].setAccessible(true);
                        HbaseColumn orm = fields[i].getAnnotation(HbaseColumn.class);
                        String family = orm.family();
                        if ("rowkey".equalsIgnoreCase(family)) {
                            continue;
                        }
                        set.add(family);
                    }
                    // 创建表
                    createTable(tableName, set);
                }
                Put put = HBaseBeanUtil.beanToPut(obj);
                puts.add(put);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("保存Hbase异常！");
        }
        return savePut(puts, tableName);
    }

    public <T> void save(String tableName, @SuppressWarnings("unchecked") T... objs) {
        List<Put> puts = new ArrayList<Put>();
        for (Object obj : objs) {
            if (obj == null) {
                continue;
            }
            try {
                Put put = HBaseBeanUtil.beanToPut(obj);
                puts.add(put);
            } catch (Exception e) {
                logger.warn("", e);
            }
        }
        savePut(puts, tableName);
    }

    public <T> void delete(T obj, String... rowkeys) {
        String tableName = "";
        tableName = getORMTable(obj);
        if (StringUtils.isBlank(tableName)) {
            return;
        }
        List<Delete> deletes = new ArrayList<Delete>();
        for (String rowkey : rowkeys) {
            if (StringUtils.isBlank(rowkey)) {
                continue;
            }
            deletes.add(new Delete(Bytes.toBytes(rowkey)));
        }
        delete(deletes, tableName);
    }

    private void delete(List<Delete> deletes, String tableName) {
        try (Table table = HconnectionFactory.connection.getTable(TableName.valueOf(tableName));) {
            if (StringUtils.isBlank(tableName)) {
                logger.info("tableName为空！");
                return;
            }
            table.delete(deletes);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("删除失败！", e);
        }
    }

    public List<String> familys(String tableName) {
        try (Table table = HconnectionFactory.connection.getTable(TableName.valueOf(tableName));) {
            List<String> columns = new ArrayList<String>();
            if (table == null) {
                return columns;
            }
            HTableDescriptor tableDescriptor = table.getTableDescriptor();
            HColumnDescriptor[] columnDescriptors = tableDescriptor.getColumnFamilies();
            for (HColumnDescriptor columnDescriptor : columnDescriptors) {
                String columnName = columnDescriptor.getNameAsString();
                columns.add(columnName);
            }
            return columns;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询列簇名称失败！", e);
        }
        return new ArrayList<String>();
    }

    // 保存方法
    private boolean savePut(List<Put> puts, String tableName) {
        if (StringUtils.isBlank(tableName)) {
            return false;
        }
        try (Table table = HconnectionFactory.connection.getTable(TableName.valueOf(tableName));
                Admin admin = HconnectionFactory.connection.getAdmin();) {
            table.put(puts);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 获取tableName
    private String getORMTable(Object obj) {
        HbaseTable table = obj.getClass().getAnnotation(HbaseTable.class);
        return table.tableName();
    }

    // 获取查询结果
    public List<Result> getResults(String tableName, String... rowkeys) {
        List<Result> resultList = new ArrayList<Result>();
        List<Get> gets = new ArrayList<Get>();
        for (String rowkey : rowkeys) {
            if (StringUtils.isBlank(rowkey)) {
                continue;
            }
            Get get = new Get(Bytes.toBytes(rowkey));
            gets.add(get);
        }
        try (Table table = HconnectionFactory.connection.getTable(TableName.valueOf(tableName));) {
            Result[] results = table.get(gets);
            Collections.addAll(resultList, results);
            return resultList;
        } catch (Exception e) {
            e.printStackTrace();
            return resultList;
        }
    }

    public <T> List<T> queryScanGreater(T obj, Map<String, String> param) throws Exception {
        List<T> objs = new ArrayList<T>();
        String tableName = getORMTable(obj);
        if (StringUtils.isBlank(tableName)) {
            return null;
        }
        try (Table table = HconnectionFactory.connection.getTable(TableName.valueOf(tableName));
                Admin admin = HconnectionFactory.connection.getAdmin();) {
            if (!admin.isTableAvailable(TableName.valueOf(tableName))) {
                return objs;
            }
            Scan scan = new Scan();
            for (Map.Entry<String, String> entry : param.entrySet()) {
                Class<?> clazz = obj.getClass();
                Field[] fields = clazz.getDeclaredFields();
                for (Field field : fields) {
                    if (!field.isAnnotationPresent(HbaseColumn.class)) {
                        continue;
                    }
                    field.setAccessible(true);
                    HbaseColumn orm = field.getAnnotation(HbaseColumn.class);
                    String family = orm.family();
                    String qualifier = orm.qualifier();
                    if (qualifier.equals(entry.getKey())) {
                        Filter filter = new SingleColumnValueFilter(Bytes.toBytes(family),
                                Bytes.toBytes(entry.getKey()), CompareFilter.CompareOp.GREATER_OR_EQUAL,
                                Bytes.toBytes(entry.getValue()));
                        scan.setFilter(filter);
                    }
                }
            }
            ResultScanner scanner = table.getScanner(scan);
            for (Result result : scanner) {
                @SuppressWarnings("unchecked")
                T beanClone = (T) BeanUtils.cloneBean(HBaseBeanUtil.resultToBean(result, obj));
                objs.add(beanClone);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询失败！");
            throw new Exception(e);
        }
        return objs;
    }
}
