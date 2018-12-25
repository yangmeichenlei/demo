package com.media.form.goods;

import java.util.Date;
import java.util.List;

import com.media.common.base.BaseForm;

public class GoodsBrandForm extends BaseForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String brandId;
	
	private List<String> brandIdList;
	
	private int auditStatus;

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


	public int getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(int auditStatus) {
		this.auditStatus = auditStatus;
	}

	public List<String> getBrandIdList() {
		return brandIdList;
	}

	public void setBrandIdList(List<String> brandIdList) {
		this.brandIdList = brandIdList;
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
