package com.media.form.common;

import io.swagger.annotations.ApiModel;

/**
 * Created by lihaiqiang on 2018/11/01.
 */
@ApiModel(value = "FileMutilUploadForm", description = "多类型文件上传form")
public class FileMutilUploadForm {
    private String filePrefix;//文件参数前缀

    private Integer fileNum;//文件个数

    public String getFilePrefix() {
        return filePrefix;
    }

    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }

    public Integer getFileNum() {
        return fileNum;
    }

    public void setFileNum(Integer fileNum) {
        this.fileNum = fileNum;
    }

    @Override
    public String toString() {
        return "FileMutilUploadForm{" +
                "filePrefix='" + filePrefix + '\'' +
                ", fileNum=" + fileNum +
                '}';
    }
}
