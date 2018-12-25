package com.media.common.hadoop.hbase;

import java.io.IOException;

import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.media.common.config.HadoopConfiguration;

/**
 * Created by lihaiqiang on 2018/08/23.
 */
@Component
public class HconnectionFactory implements InitializingBean {

    protected final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    public static Connection connection;

    @Override
    public void afterPropertiesSet() {
        try {
            connection = ConnectionFactory.createConnection(HadoopConfiguration.getConf());
            logger.info("获取connectiont连接成功！");
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("获取connectiont连接失败！");
        }
    }
}
