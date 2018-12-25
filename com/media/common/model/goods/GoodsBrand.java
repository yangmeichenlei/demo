package com.media.common.model.goods;

import com.media.common.base.BaseModel;
import com.media.common.model.user.User;

import java.util.Date;

public class GoodsBrand extends BaseModel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String brandId;

    private String brandNameCn;

    private String brandNameEn;

    private String brandDesc;

    private String brandLogoPath;

    private String brandOfficialWebsite;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    private String auditUserId;

    private Date auditTime;

    private String auditOpinion;
    
    private User createUser;
    
    private User updateUser;
    
    private User auditUser;
    
    public User getAuditUser() {
		return auditUser;
	}

	public void setAuditUser(User auditUser) {
		this.auditUser = auditUser;
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

	public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
    }

    public String getBrandNameCn() {
        return brandNameCn;
    }

    public void setBrandNameCn(String brandNameCn) {
        this.brandNameCn = brandNameCn == null ? null : brandNameCn.trim();
    }

    public String getBrandNameEn() {
        return brandNameEn;
    }

    public void setBrandNameEn(String brandNameEn) {
        this.brandNameEn = brandNameEn == null ? null : brandNameEn.trim();
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc == null ? null : brandDesc.trim();
    }

    public String getBrandLogoPath() {
        return brandLogoPath;
    }

    public void setBrandLogoPath(String brandLogoPath) {
        this.brandLogoPath = brandLogoPath == null ? null : brandLogoPath.trim();
    }

    public String getBrandOfficialWebsite() {
        return brandOfficialWebsite;
    }

    public void setBrandOfficialWebsite(String brandOfficialWebsite) {
        this.brandOfficialWebsite = brandOfficialWebsite == null ? null : brandOfficialWebsite.trim();
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