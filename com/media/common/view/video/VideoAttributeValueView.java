package com.media.common.view.video;

import java.util.Date;

import com.media.common.model.video.FileDirectory;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "VideoAttributeValueView", description = "视频属性定义值视图")
public class VideoAttributeValueView {

    private String pkVideoAttributeValue;

    private String pkVideoAttributeOptionId;

    private String videoValue;

    private String pkFileDirectoryId;

    private Integer valueNo;

    private String videoAttrName;//字段名称

    private String pkVideoId;
    
    private String pkVideoAttributeId;

    private int videoType;

    private String videoNameCh;

    private String videoCode;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    private String createUserName;//创建用户名称

    private String lastModifyUserName;//修改用户名称

    private int status;//状态名称

    private int dataStatus;//状态名称

    private FileDirectory fileDirectory;
    
    private Integer isEnum;//是否枚举

    public Integer getIsEnum() {
        return isEnum;
    }

    public void setIsEnum(Integer isEnum) {
        this.isEnum = isEnum;
    }

    public String getPkVideoAttributeOptionId() {
        return pkVideoAttributeOptionId;
    }

    public void setPkVideoAttributeOptionId(String pkVideoAttributeOptionId) {
        this.pkVideoAttributeOptionId = pkVideoAttributeOptionId;
    }

    public String getPkVideoAttributeValue() {
        return pkVideoAttributeValue;
    }

    public void setPkVideoAttributeValue(String pkVideoAttributeValue) {
        this.pkVideoAttributeValue = pkVideoAttributeValue;
    }

    public String getVideoValue() {
        return videoValue;
    }

    public void setVideoValue(String videoValue) {
        this.videoValue = videoValue;
    }

    public String getPkFileDirectoryId() {
        return pkFileDirectoryId;
    }

    public void setPkFileDirectoryId(String pkFileDirectoryId) {
        this.pkFileDirectoryId = pkFileDirectoryId;
    }

    public Integer getValueNo() {
        return valueNo;
    }

    public void setValueNo(Integer valueNo) {
        this.valueNo = valueNo;
    }

    public String getVideoAttrName() {
        return videoAttrName;
    }

    public void setVideoAttrName(String videoAttrName) {
        this.videoAttrName = videoAttrName;
    }

    public String getPkVideoId() {
        return pkVideoId;
    }

    public void setPkVideoId(String pkVideoId) {
        this.pkVideoId = pkVideoId;
    }

    public String getPkVideoAttributeId() {
        return pkVideoAttributeId;
    }

    public void setPkVideoAttributeId(String pkVideoAttributeId) {
        this.pkVideoAttributeId = pkVideoAttributeId;
    }

    public int getVideoType() {
        return videoType;
    }

    public void setVideoType(int videoType) {
        this.videoType = videoType;
    }

    public String getVideoNameCh() {
        return videoNameCh;
    }

    public void setVideoNameCh(String videoNameCh) {
        this.videoNameCh = videoNameCh;
    }

    public String getVideoCode() {
        return videoCode;
    }

    public void setVideoCode(String videoCode) {
        this.videoCode = videoCode;
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

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getLastModifyUserName() {
        return lastModifyUserName;
    }

    public void setLastModifyUserName(String lastModifyUserName) {
        this.lastModifyUserName = lastModifyUserName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(int dataStatus) {
        this.dataStatus = dataStatus;
    }

    public FileDirectory getFileDirectory() {
        return fileDirectory;
    }

    public void setFileDirectory(FileDirectory fileDirectory) {
        this.fileDirectory = fileDirectory;
    }

}
