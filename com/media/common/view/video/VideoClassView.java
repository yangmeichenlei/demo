package com.media.common.view.video;

import java.util.Date;

import com.media.common.model.user.User;

import io.swagger.annotations.ApiModel;

/**
 * Created by lihaiqiang on 2018/11/01.
 */
@ApiModel(value = "VideoClassView", description = "视频分类视图")
public class VideoClassView {

    private String pkVideoClassId;

    private String videoClassCode;

    private String videoClassName;

    private Integer videoClassLevel;

    private String parentVideoClassId;
    
    private String parentVideoClassName;

    private Integer videoClassNo;

    private String videoLayerClassCode;

    private String videoClassDesc;

    private Integer endNode;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;
    
    private User createUser;
    
    private User updateUser;

    public String getPkVideoClassId() {
        return pkVideoClassId;
    }
    
    public void setPkVideoClassId(String pkVideoClassId) {
        this.pkVideoClassId = pkVideoClassId;
    }
    
    public String getVideoClassCode() {
        return videoClassCode;
    }
    
    public void setVideoClassCode(String videoClassCode) {
        this.videoClassCode = videoClassCode;
    }
    
    public String getVideoClassName() {
        return videoClassName;
    }
    
    public void setVideoClassName(String videoClassName) {
        this.videoClassName = videoClassName;
    }
    
    public Integer getVideoClassLevel() {
        return videoClassLevel;
    }
    
    public void setVideoClassLevel(Integer videoClassLevel) {
        this.videoClassLevel = videoClassLevel;
    }
    
    public String getParentVideoClassId() {
        return parentVideoClassId;
    }
    
    public void setParentVideoClassId(String parentVideoClassId) {
        this.parentVideoClassId = parentVideoClassId;
    }
    
    public String getParentVideoClassName() {
        return parentVideoClassName;
    }

    public void setParentVideoClassName(String parentVideoClassName) {
        this.parentVideoClassName = parentVideoClassName;
    }

    public Integer getVideoClassNo() {
        return videoClassNo;
    }
    
    public void setVideoClassNo(Integer videoClassNo) {
        this.videoClassNo = videoClassNo;
    }
    
    public String getVideoLayerClassCode() {
        return videoLayerClassCode;
    }

    public void setVideoLayerClassCode(String videoLayerClassCode) {
        this.videoLayerClassCode = videoLayerClassCode;
    }

    public String getVideoClassDesc() {
        return videoClassDesc;
    }
    
    public void setVideoClassDesc(String videoClassDesc) {
        this.videoClassDesc = videoClassDesc;
    }
    
    public Integer getEndNode() {
        return endNode;
    }
    
    public void setEndNode(Integer endNode) {
        this.endNode = endNode;
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
    
    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public User getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(User updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        return "UpdateVideoClassView{" +
                "pkVideoClassId='" + pkVideoClassId + '\'' +
                ", videoClassCode='" + videoClassCode + '\'' +
                ", videoClassName='" + videoClassName + '\'' +
                ", videoClassLevel='" + videoClassLevel + '\'' +
                ", videoClassNo='" + videoClassNo + '\'' +
                ", videoLayerClassCode='" + videoLayerClassCode + '\'' +
                ", videoClassDesc=" + videoClassDesc +
                ", endNode=" + endNode +
                ", status=" + status +
                ", createUserId='" + createUserId + '\'' +
                ", createTime=" + createTime +
                ", lastModifyUserId='" + lastModifyUserId + '\'' +
                ", lastModifyTime=" + lastModifyTime +
                '}';
    }
}
