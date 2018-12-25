package com.media.common.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.CannedAccessControlList;
import com.aliyun.oss.model.CreateBucketRequest;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import com.media.common.constant.ConstantConfig;

@Component
public class AliyunOSSUtil {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ConstantConfig constantConfig;

    /**
     * 上传文件
     * 
     * @param file文件
     * @return 可访问的路径
     */
    public String upLoad(File file) {
        logger.info("------OSS文件上传开始--------" + file.getName());
        String endpoint = constantConfig.getMEDIAIMAGE_END_POINT();
        String accessKeyId = constantConfig.getMEDIAIMAGE_ACCESS_KEY_ID();
        String accessKeySecret = constantConfig.getMEDIAIMAGE_ACCESS_KEY_SECRET();
        String bucketName = constantConfig.getMEDIAIMAGE_BUCKET_NAME1();
        String fileHost = constantConfig.getMEDIAIMAGE_FILE_HOST();
        String imgUrl = constantConfig.getMEDIAIMAGE_ACCESS_URL();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = format.format(new Date());
        OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try { // 判断容器是否存在,不存在就创建
            if (!client.doesBucketExist(bucketName)) {
                client.createBucket(bucketName);
                CreateBucketRequest createBucketRequest = new CreateBucketRequest(bucketName);
                createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
                client.createBucket(createBucketRequest);
            } // 设置文件路径和名称
            String fileUrl = fileHost + "/" + (dateStr + "/" + UUIDUtils.getUUID() + "-" + file.getName());
            // 上传文件
            PutObjectResult result = client.putObject(new PutObjectRequest(bucketName, fileUrl, file));
            // 设置权限(公开读)
            client.setBucketAcl(bucketName, CannedAccessControlList.PublicRead);
            String imgAddress = imgUrl + "/" + fileUrl;
            if (result != null) {
                logger.info("------OSS文件上传成功------" + imgAddress);
                return imgAddress;
            }
        } catch (OSSException oe) {
            logger.error(oe.getMessage());
        } catch (ClientException ce) {
            logger.error(ce.getErrorMessage());
        } finally {
            if (client != null) {
                client.shutdown();
            }
        }
        return null;
    }

    /**
     * 根据key删除OSS服务器上的文件
     * 
     * @param filePath 需要删除的文件路径
     * @return
     */
    public void deleteFile(String filePath) {
        logger.info("------OSS文件删除开始--------");
        String endpoint = constantConfig.getMEDIAIMAGE_END_POINT();
        String accessKeyId = constantConfig.getMEDIAIMAGE_ACCESS_KEY_ID();
        String accessKeySecret = constantConfig.getMEDIAIMAGE_ACCESS_KEY_SECRET();
        String bucketName = constantConfig.getMEDIAIMAGE_BUCKET_NAME1();
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        ossClient.deleteObject(bucketName, filePath);
        if (ossClient != null) {
            ossClient.shutdown();
        }
    }


    /**
     * 判断oss中是否存在文件
     * @param filePath
     * @return
     */
    public Boolean doesObjectExist(String filePath) {
        logger.info("------OSS开始判断文件是否存在--------");
        String endpoint = constantConfig.getMEDIAIMAGE_END_POINT();
        String accessKeyId = constantConfig.getMEDIAIMAGE_ACCESS_KEY_ID();
        String accessKeySecret = constantConfig.getMEDIAIMAGE_ACCESS_KEY_SECRET();
        String bucketName = constantConfig.getMEDIAIMAGE_BUCKET_NAME1();
        // 创建OSSClient实例
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        Boolean result = ossClient.doesObjectExist(bucketName, filePath);
        // 关闭OSSClient
        if (ossClient != null) {
            ossClient.shutdown();
        }
        return result;
    }
}
