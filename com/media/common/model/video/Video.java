package com.media.common.model.video;

import com.media.common.base.BaseModel;
import java.util.Date;
/**
 * Created by lihaiqiang on 2018/11/01.
 */
public class Video extends BaseModel {

    private static final long serialVersionUID = 5329808226415636624L;

    private String pkVideoId;

    private String pkFileDirectoryId;

//    private String pkVideoClassId;

    private Integer videoType;

    private String videoNameCh;

    private String videoNameEn;
    
    private String videoDescrible;

    private String videoCode;
    
    private String videoImgPath;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    private String auditUserId;

    private Date auditTime;

    private String auditOpinion;

    private String memo;
    

    public String getVideoDescrible() {
		return videoDescrible;
	}

	public void setVideoDescrible(String videoDescrible) {
		this.videoDescrible = videoDescrible;
	}

	public String getVideoImgPath() {
		return videoImgPath;
	}

	public void setVideoImgPath(String videoImgPath) {
		this.videoImgPath = videoImgPath;
	}

	public String getPkVideoId() {
        return pkVideoId;
    }

    public void setPkVideoId(String pkVideoId) {
        this.pkVideoId = pkVideoId == null ? null : pkVideoId.trim();
    }

    public String getPkFileDirectoryId() {
        return pkFileDirectoryId;
    }

    public void setPkFileDirectoryId(String pkFileDirectoryId) {
        this.pkFileDirectoryId = pkFileDirectoryId == null ? null : pkFileDirectoryId.trim();
    }

//    public String getPkVideoClassId() {
//        return pkVideoClassId;
//    }
//
//    public void setPkVideoClassId(String pkVideoClassId) {
//        this.pkVideoClassId = pkVideoClassId == null ? null : pkVideoClassId.trim();
//    }

    public Integer getVideoType() {
        return videoType;
    }

    public void setVideoType(Integer videoType) {
        this.videoType = videoType;
    }

    public String getVideoNameCh() {
        return videoNameCh;
    }

    public void setVideoNameCh(String videoNameCh) {
        this.videoNameCh = videoNameCh == null ? null : videoNameCh.trim();
    }

    public String getVideoNameEn() {
        return videoNameEn;
    }

    public void setVideoNameEn(String videoNameEn) {
        this.videoNameEn = videoNameEn == null ? null : videoNameEn.trim();
    }

    public String getVideoCode() {
        return videoCode;
    }

    public void setVideoCode(String videoCode) {
        this.videoCode = videoCode == null ? null : videoCode.trim();
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}