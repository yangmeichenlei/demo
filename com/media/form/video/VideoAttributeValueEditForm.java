package com.media.form.video;

import java.util.Date;

import io.swagger.annotations.ApiModel;
/**
 * Created by lihaiqiang on 2018/11/09.
 */
@ApiModel(value = "VideoAttributeValueEditForm", description = "属性定义值编辑form")
public class VideoAttributeValueEditForm {

    private String pkVideoAttributeValue;

    private String videoValue;

    private String pkFileDirectoryId;

    private String videoAttributeName;//字段名称
    
    private int valueNo;

    private String pkVideoId;
    
    private String pkVideoAttributeId;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    private String createUserName;//创建用户名称

    private String lastModifyUserName;//修改用户名称

    private int status;//状态名称

    private int dataStatus;//状态名称

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

    public String getVideoAttributeName() {
        return videoAttributeName;
    }

    public void setVideoAttributeName(String videoAttributeName) {
        this.videoAttributeName = videoAttributeName;
    }

    public int getValueNo() {
        return valueNo;
    }

    public void setValueNo(int valueNo) {
        this.valueNo = valueNo;
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

    @Override
    public String toString() {
        return "VideoAttributeValueEditForm{" +
                "pkVideoAttributeValue='" + pkVideoAttributeValue + '\'' +
                ", videoValue='" + videoValue + '\'' +
                ", pkFileDirectoryId='" + pkFileDirectoryId + '\'' +
                ", videoAttributeName='" + videoAttributeName + '\'' +
                '}';
    }
}