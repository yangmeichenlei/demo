package com.media.common.view;

/**
 * Created by lihaiqiang on 2018/11/01.
 */
public class OssResultView {
    private String fieldName; //上传文件字段名
    private String originalName; //上传文件原始名称
    private String newName; //云服务器上新的名称
    private String relativePath; //云服务器上相对路径
    private String absPah; //绝对路径
    private String suffix; //后缀名

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public String getAbsPah() {
        return absPah;
    }

    public void setAbsPah(String absPah) {
        this.absPah = absPah;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
