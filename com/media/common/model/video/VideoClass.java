package com.media.common.model.video;

import com.media.common.base.BaseModel;
import java.util.Date;
/**
 * Created by lihaiqiang on 2018/11/01.
 */
public class VideoClass extends BaseModel {

    private static final long serialVersionUID = 3509971043928710085L;

    private String pkVideoClassId;

    private String videoClassCode;

    private String videoClassName;

    private Integer videoClassLevel;

    private String parentVideoClassId;

    private Integer videoClassNo;
    
    private String videoLayerClassCode;

    private String videoClassDesc;

    private Integer endNode;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    public String getPkVideoClassId() {
        return pkVideoClassId;
    }

    public void setPkVideoClassId(String pkVideoClassId) {
        this.pkVideoClassId = pkVideoClassId == null ? null : pkVideoClassId.trim();
    }

    public String getVideoClassCode() {
        return videoClassCode;
    }

    public void setVideoClassCode(String videoClassCode) {
        this.videoClassCode = videoClassCode == null ? null : videoClassCode.trim();
    }

    public String getVideoClassName() {
        return videoClassName;
    }

    public void setVideoClassName(String videoClassName) {
        this.videoClassName = videoClassName == null ? null : videoClassName.trim();
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
        this.parentVideoClassId = parentVideoClassId == null ? null : parentVideoClassId.trim();
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
        this.videoClassDesc = videoClassDesc == null ? null : videoClassDesc.trim();
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
        this.createUserId = createUserId == null ? null : createUserId.trim();
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
        this.lastModifyUserId = lastModifyUserId == null ? null : lastModifyUserId.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}