package com.media.common.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 上传文件到阿里云OSS相关的配置类
 * @author zhaoRong
 *
 */
@Component
@Configuration
public class ConstantConfig {
    @Value("${aliyun.oss.endpoint}")
    private String MEDIAIMAGE_END_POINT;
    @Value("${aliyun.oss.keyid}")
    private String MEDIAIMAGE_ACCESS_KEY_ID;
    @Value("${aliyun.oss.keysecret}")
    private String MEDIAIMAGE_ACCESS_KEY_SECRET;
    @Value("${aliyun.oss.filehost}")
    private String MEDIAIMAGE_FILE_HOST;
    @Value("${aliyun.oss.bucketname1}")
    private String MEDIAIMAGE_BUCKET_NAME1;
    @Value("${aliyun.oss.accessUrl}")
    private String MEDIAIMAGE_ACCESS_URL;
    public String getMEDIAIMAGE_END_POINT() {
        return MEDIAIMAGE_END_POINT;
    }
    public void setMEDIAIMAGE_END_POINT(String mEDIAIMAGE_END_POINT) {
        MEDIAIMAGE_END_POINT = mEDIAIMAGE_END_POINT;
    }
    public String getMEDIAIMAGE_ACCESS_KEY_ID() {
        return MEDIAIMAGE_ACCESS_KEY_ID;
    }
    public void setMEDIAIMAGE_ACCESS_KEY_ID(String mEDIAIMAGE_ACCESS_KEY_ID) {
        MEDIAIMAGE_ACCESS_KEY_ID = mEDIAIMAGE_ACCESS_KEY_ID;
    }
    public String getMEDIAIMAGE_ACCESS_KEY_SECRET() {
        return MEDIAIMAGE_ACCESS_KEY_SECRET;
    }
    public void setMEDIAIMAGE_ACCESS_KEY_SECRET(String mEDIAIMAGE_ACCESS_KEY_SECRET) {
        MEDIAIMAGE_ACCESS_KEY_SECRET = mEDIAIMAGE_ACCESS_KEY_SECRET;
    }
    public String getMEDIAIMAGE_FILE_HOST() {
        return MEDIAIMAGE_FILE_HOST;
    }
    public void setMEDIAIMAGE_FILE_HOST(String mEDIAIMAGE_FILE_HOST) {
        MEDIAIMAGE_FILE_HOST = mEDIAIMAGE_FILE_HOST;
    }
    public String getMEDIAIMAGE_BUCKET_NAME1() {
        return MEDIAIMAGE_BUCKET_NAME1;
    }
    public void setMEDIAIMAGE_BUCKET_NAME1(String mEDIAIMAGE_BUCKET_NAME1) {
        MEDIAIMAGE_BUCKET_NAME1 = mEDIAIMAGE_BUCKET_NAME1;
    }
    public String getMEDIAIMAGE_ACCESS_URL() {
        return MEDIAIMAGE_ACCESS_URL;
    }
    public void setMEDIAIMAGE_ACCESS_URL(String mEDIAIMAGE_ACCESS_URL) {
        MEDIAIMAGE_ACCESS_URL = mEDIAIMAGE_ACCESS_URL;
    }

}
