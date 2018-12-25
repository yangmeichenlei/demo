package com.media.common.hadoop.job;

import java.io.IOException;

import org.apache.hadoop.mapreduce.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.media.common.config.HadoopConfiguration;

/**
 * Created by lihaiqiang on 2018/08/23.
 */
@Component
public class HJobFactory implements InitializingBean{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static Job job;
    public static Job getJob() {
        return job;
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        try {
            job = Job.getInstance(HadoopConfiguration.getConf(),this.getClass().getSimpleName());
            logger.info("获取job成功！");
        } catch (IOException e) {
            e.printStackTrace ();
            logger.error("获取job失败！" + e);
        }
    }

}
