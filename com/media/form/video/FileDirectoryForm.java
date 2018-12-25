package com.media.form.video;

import java.util.Date;

import com.media.common.base.BaseForm;

/**
 * Created by lihaiqiang on 2018/10/13.
 */
public class FileDirectoryForm  extends BaseForm{

    private static final long serialVersionUID = 6447656632731904140L;

    private String pkFileDirectory;

    private String directoryCode;

    private String directoryName;

    private String parentFileDirectory;

    private Integer directoryLevel;

    private Integer directoryNo;

    private String directoryPath;

    private String layerDirectoryCode;

    private String directoryDesc;

    private Integer isParent;

    private Integer fileType;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    public String getPkFileDirectory() {
        return pkFileDirectory;
    }

    public void setPkFileDirectory(String pkFileDirectory) {
        this.pkFileDirectory = pkFileDirectory;
    }

    public String getDirectoryCode() {
        return directoryCode;
    }

    public void setDirectoryCode(String directoryCode) {
        this.directoryCode = directoryCode;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getParentFileDirectory() {
        return parentFileDirectory;
    }

    public void setParentFileDirectory(String parentFileDirectory) {
        this.parentFileDirectory = parentFileDirectory;
    }

    public Integer getDirectoryLevel() {
        return directoryLevel;
    }

    public void setDirectoryLevel(Integer directoryLevel) {
        this.directoryLevel = directoryLevel;
    }

    public Integer getDirectoryNo() {
        return directoryNo;
    }

    public void setDirectoryNo(Integer directoryNo) {
        this.directoryNo = directoryNo;
    }

    public String getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public String getLayerDirectoryCode() {
        return layerDirectoryCode;
    }

    public void setLayerDirectoryCode(String layerDirectoryCode) {
        this.layerDirectoryCode = layerDirectoryCode;
    }

    public String getDirectoryDesc() {
        return directoryDesc;
    }

    public void setDirectoryDesc(String directoryDesc) {
        this.directoryDesc = directoryDesc;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    
    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
