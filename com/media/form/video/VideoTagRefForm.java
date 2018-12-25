package com.media.form.video;

import java.util.Date;

public class VideoTagRefForm {

    private String pkVideoRefId;
    private String pkVideoId;
    private String pkVideoNameCh;//中文名
    private String pkVideoNameEn;//英文名
    private String pkTagId;
    private String pkTagIName;//标签的名字
    private Integer tagNo;
    private Integer status;
    private String  createUserId;
    private String createUserName;
    private Date createTime;
    private String lastModifyUserId;
    private String lastModifyUserName;
    private Date lastModifyTime;
    
    
    public String getPkVideoNameCh() {
        return pkVideoNameCh;
    }
    public void setPkVideoNameCh(String pkVideoNameCh) {
        this.pkVideoNameCh = pkVideoNameCh;
    }
    public String getPkVideoNameEn() {
        return pkVideoNameEn;
    }
    public void setPkVideoNameEn(String pkVideoNameEn) {
        this.pkVideoNameEn = pkVideoNameEn;
    }
    public String getPkTagIName() {
        return pkTagIName;
    }
    public void setPkTagIName(String pkTagIName) {
        this.pkTagIName = pkTagIName;
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
    public String getPkVideoRefId() {
        return pkVideoRefId;
    }
    public void setPkVideoRefId(String pkVideoRefId) {
        this.pkVideoRefId = pkVideoRefId;
    }
    public String getPkVideoId() {
        return pkVideoId;
    }
    public void setPkVideoId(String pkVideoId) {
        this.pkVideoId = pkVideoId;
    }
    public String getPkTagId() {
        return pkTagId;
    }
    public void setPkTagId(String pkTagId) {
        this.pkTagId = pkTagId;
    }
    public Integer getTagNo() {
        return tagNo;
    }
    public void setTagNo(Integer tagNo) {
        this.tagNo = tagNo;
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
    @Override
    public String toString() {
        return "VideoTagRefForm [pkVideoRefId=" + pkVideoRefId + ", pkVideoId=" + pkVideoId + ", pkVideoNameCh="
                + pkVideoNameCh + ", pkVideoNameEn=" + pkVideoNameEn + ", pkTagId=" + pkTagId + ", pkTagIName="
                + pkTagIName + ", tagNo=" + tagNo + ", status=" + status + ", createUserId=" + createUserId
                + ", createUserName=" + createUserName + ", createTime=" + createTime + ", lastModifyUserId="
                + lastModifyUserId + ", lastModifyUserName=" + lastModifyUserName + ", lastModifyTime=" + lastModifyTime
                + "]";
    }
    
}
