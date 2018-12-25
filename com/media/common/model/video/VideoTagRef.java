package com.media.common.model.video;

import com.media.common.base.BaseModel;
import java.util.Date;
/**
 * Created by lihaiqiang on 2018/11/01.
 */
public class VideoTagRef extends BaseModel {

    private static final long serialVersionUID = -7002127368863928565L;

    private String pkVideoRefId;

    private String pkVideoId;

    private String pkTagId;

    private Integer tagNo;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    public String getPkVideoRefId() {
        return pkVideoRefId;
    }

    public void setPkVideoRefId(String pkVideoRefId) {
        this.pkVideoRefId = pkVideoRefId == null ? null : pkVideoRefId.trim();
    }

    public String getPkVideoId() {
        return pkVideoId;
    }

    public void setPkVideoId(String pkVideoId) {
        this.pkVideoId = pkVideoId == null ? null : pkVideoId.trim();
    }

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

	@Override
	public String toString() {
		return "VideoTagRef [pkVideoRefId=" + pkVideoRefId + ", pkVideoId=" + pkVideoId + ", pkTagId=" + pkTagId
				+ ", tagNo=" + tagNo + ", status=" + status + ", createUserId=" + createUserId + ", createTime="
				+ createTime + ", lastModifyUserId=" + lastModifyUserId + ", lastModifyTime=" + lastModifyTime + "]";
	}
    
}