package com.media.common.model.video;

import com.media.common.base.BaseModel;
import java.util.Date;
/**
 * Created by lihaiqiang on 2018/11/02.
 */
public class VideoAttributeRef extends BaseModel {

    private static final long serialVersionUID = -614960169489440803L;

    private String pkVideoAttributeRefId;

    private String pkVideoId;

    private String videoAttributeId;

    private String attrValId;

    private String attrVal;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    private String auditUserId;

    private Date auditTime;

    private String auditOpinion;

    public String getPkVideoAttributeRefId() {
        return pkVideoAttributeRefId;
    }

    public void setPkVideoAttributeRefId(String pkVideoAttributeRefId) {
        this.pkVideoAttributeRefId = pkVideoAttributeRefId == null ? null : pkVideoAttributeRefId.trim();
    }

    public String getPkVideoId() {
        return pkVideoId;
    }

    public void setPkVideoId(String pkVideoId) {
        this.pkVideoId = pkVideoId == null ? null : pkVideoId.trim();
    }

    public String getVideoAttributeId() {
        return videoAttributeId;
    }

    public void setVideoAttributeId(String videoAttributeId) {
        this.videoAttributeId = videoAttributeId == null ? null : videoAttributeId.trim();
    }

    public String getAttrValId() {
        return attrValId;
    }

    public void setAttrValId(String attrValId) {
        this.attrValId = attrValId;
    }

    public String getAttrVal() {
        return attrVal;
    }

    public void setAttrVal(String attrVal) {
        this.attrVal = attrVal == null ? null : attrVal.trim();
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

    public String getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId == null ? null : auditUserId.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion == null ? null : auditOpinion.trim();
    }
}