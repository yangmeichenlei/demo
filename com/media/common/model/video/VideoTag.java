package com.media.common.model.video;

import com.media.common.base.BaseModel;
import java.util.Date;
/**
 * Created by lihaiqiang on 2018/11/01.
 */
public class VideoTag extends BaseModel {

    private static final long serialVersionUID = 4831953371677406730L;

    private String pkTagId;

    private Integer tagNo;

    private String tagName;

    private Integer hotFlag;

    private Integer dataStatus;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    private Integer tagReferenceCount;

    public String getPkTagId() {
        return pkTagId;
    }

    public void setPkTagId(String pkTagId) {
        this.pkTagId = pkTagId == null ? null : pkTagId.trim();
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
        this.tagName = tagName == null ? null : tagName.trim();
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

    public Integer getTagReferenceCount() {
        return tagReferenceCount;
    }

    public void setTagReferenceCount(Integer tagReferenceCount) {
        this.tagReferenceCount = tagReferenceCount;
    }

	@Override
	public String toString() {
		return "VideoTag [pkTagId=" + pkTagId + ", tagNo=" + tagNo + ", tagName=" + tagName + ", hotFlag=" + hotFlag
				+ ", dataStatus=" + dataStatus + ", createUserId=" + createUserId + ", createTime=" + createTime
				+ ", lastModifyUserId=" + lastModifyUserId + ", lastModifyTime=" + lastModifyTime
				+ ", tagReferenceCount=" + tagReferenceCount + "]";
	}
    
}