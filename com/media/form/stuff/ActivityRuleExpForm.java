package com.media.form.stuff;

import java.util.Date;

import com.media.common.base.BaseForm;

public class ActivityRuleExpForm extends BaseForm {
	private String pkRuleExpressionId;
	
    private String pkRuleId;

    private Integer selectGoodsType;

	private Double totalPrice;

    private Double totalDiscount;

    private Integer totalNumber;

    private Integer totalPresent;

    private Integer priceDiscount;

    private Integer stuffLevel;

    private Date createExpTime;

    private String createExpUserId;

    private Date updateExpTime;

    private String updateExpUserId;

    private Date startExpTime;

    private Date endExpTime;

    private String memo;

    public String getPkRuleExpressionId() {
        return pkRuleExpressionId;
    }

    public void setPkRuleExpressionId(String pkRuleExpressionId) {
        this.pkRuleExpressionId = pkRuleExpressionId == null ? null : pkRuleExpressionId.trim();
    }

    public Integer getSelectGoodsType() {
        return selectGoodsType;
    }

    public void setSelectGoodsType(Integer selectGoodsType) {
        this.selectGoodsType = selectGoodsType;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }


    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }
    
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getTotalPresent() {
        return totalPresent;
    }

    public void setTotalPresent(Integer totalPresent) {
        this.totalPresent = totalPresent;
    }

    public Integer getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(Integer priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public Integer getStuffLevel() {
        return stuffLevel;
    }

    public void setStuffLevel(Integer stuffLevel) {
        this.stuffLevel = stuffLevel;
    }

    public Date getCreateExpTime() {
        return createExpTime;
    }

    public void setCreateExpTime(Date createExpTime) {
        this.createExpTime = createExpTime;
    }

    public String getCreateExpUserId() {
        return createExpUserId;
    }

    public void setCreateExpUserId(String createExpUserId) {
        this.createExpUserId = createExpUserId == null ? null : createExpUserId.trim();
    }

    public Date getUpdateExpTime() {
        return updateExpTime;
    }

    public void setUpdateExpTime(Date updateExpTime) {
        this.updateExpTime = updateExpTime;
    }

    public String getUpdateExpUserId() {
        return updateExpUserId;
    }

    public void setUpdateExpUserId(String updateExpUserId) {
        this.updateExpUserId = updateExpUserId == null ? null : updateExpUserId.trim();
    }

    public Date getStartExpTime() {
        return startExpTime;
    }

    public void setStartExpTime(Date startExpTime) {
        this.startExpTime = startExpTime;
    }

    public Date getEndExpTime() {
        return endExpTime;
    }

    public void setEndTime(Date endExpTime) {
        this.endExpTime = endExpTime;
    }

    public String getmemo() {
        return memo;
    }

    public void setmemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
    public String getPkRuleId() {
		return pkRuleId;
	}

	public void setPkRuleId(String pkRuleId) {
		this.pkRuleId = pkRuleId;
	}

}
