package com.media.form.video;

import java.util.Date;

import com.media.common.base.BaseForm;

public class VideoTagForm  extends BaseForm{

    private String tagId;
    private Integer tagNo;
    private String tagName;
    private Integer hotFlag;
    private Integer dataStatus;
    private String createUserId;
    private String createUserName;
    private Date createTime;
    private String lastModifyUserId;
    private String lastModifyUserName;
    private Date lastModifyTime;
    private Integer tagReferenceCount;
    public String getTagId() {
        return tagId;
    }
    public void setTagId(String tagId) {
        this.tagId = tagId;
    }
    public Integer getTagNo() {
        return tagNo;
    }
    public void setTagNo(Integer tagNo) {
        this.tagNo = tagNo;
    }
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public Integer getHotFlag() {
        return hotFlag;
    }
    public void setHotFlag(Integer hotFlag) {
        this.hotFlag = hotFlag;
    }
    public Integer getDataStatus() {
        return dataStatus;
    }
    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }
    public String getCreateUserId() {
        return createUserId;
    }
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }
    public String getCreateUserName() {
        return createUserName;
    }
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
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
    public String getLastModifyUserName() {
        return lastModifyUserName;
    }
    public void setLastModifyUserName(String lastModufyUserName) {
        this.lastModifyUserName = lastModufyUserName;
    }
    public Date getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(Date date) {
		this.lastModifyTime = date;
	}
	public Integer getTagReferenceCount() {
        return tagReferenceCount;
    }
    public void setTagReferenceCount(Integer tagReferenceCount) {
        this.tagReferenceCount = tagReferenceCount;
    }
	@Override
	public String toString() {
		return "VideoTagForm [tagId=" + tagId + ", tagNo=" + tagNo + ", tagName=" + tagName + ", hotFlag=" + hotFlag
				+ ", dataStatus=" + dataStatus + ", createUserId=" + createUserId + ", createUserName=" + createUserName
				+ ", createTime=" + createTime + ", lastModifyUserId=" + lastModifyUserId + ", lastModifyUserName="
				+ lastModifyUserName + ", lastModifyTime=" + lastModifyTime + ", tagReferenceCount=" + tagReferenceCount
				+ "]";
	}
    
}
