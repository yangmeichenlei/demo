package com.media.common.config;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by lihaiqiang on 2018/08/23.
 */
@EnableAspectJAutoProxy
@Component
public class HadoopConfiguration  implements InitializingBean{
protected final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Value("${hbase.zookeeper.quorum}")
    private String zkQuorum;
    
    @Value("${fs.defaultFS}")
    private String hBaseMaster;
    
    @Value("${hbase.zookeeper.property.clientPort}")
    private String zkPort;
    
    @Value("${zookeeper.znode.parent}")
    private String znode;
    @Value("${hbase.root.path}")
    private String rootPath;
    
    private static Configuration conf = HBaseConfiguration.create();
    
    @Override
    public void afterPropertiesSet(){
        conf.set("hbase.zookeeper.quorum", zkQuorum);
        conf.set("hbase.zookeeper.property.clientPort", zkPort);
        conf.set("zookeeper.znode.parent", znode);
        conf.set("hbase.master", hBaseMaster);
        conf.set("hbase.root.path", rootPath);
    }

    /**
     * 获取hadoop文件配置实例
     * 
     * @return org.apache.hadoop.conf.Configuration
     */
    public static Configuration getConf() {
        return conf;
    }
}
