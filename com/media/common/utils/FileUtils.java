package com.media.common.utils;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author zhaoRong
 *
 * 文件上传工具包
 */
public class FileUtils {

    /**
     * 
     * @param file 文件
     * @param path 文件存放路径
     * @param fileName 文件名
     * @return realPath 文件的真实路径
     */
    public static String upload(MultipartFile file, String path, String fileName) {
        // 生成新的文件名
        String realPath = path + "/" + FileNameUtils.getFileName(fileName);
        File dest = new File(realPath);
        // 判断父级目录是否存在
        if (!dest.getParentFile().exists()) {
            //创建多层级目录
            dest.getParentFile().mkdirs();
        }
        try {
            // 保存文件
            file.transferTo(dest);
            return realPath;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
