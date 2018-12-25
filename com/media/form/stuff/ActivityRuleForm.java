package com.media.form.stuff;

import java.util.Date;
import java.util.List;

import com.media.common.base.BaseForm;

public class ActivityRuleForm extends BaseForm {
    private String pkRuleId;
    
    private List<String> pkActivityId;

    private Double score;

    private String expressionMethodId;

    private String expressionTips;

    private Integer targetType;

    private Date startTime;

    private Date endTime;
    
    private Integer status;

    private String memo;
    
    private Integer selectGoodsType;

    private Double totalPrice;

    private Double totalDiscount;

    private Integer totalNumber;

    private Integer totalPresent;

    private Integer priceDiscount;

    private Integer stuffLevel;

    private String expMemo;
    
    

	public String getExpMemo() {
		return expMemo;
	}

	public void setExpMemo(String expMemo) {
		this.expMemo = expMemo;
	}

	public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getExpressionMethodId() {
        return expressionMethodId;
    }

    public void setExpressionMethodId(String expressionMethodId) {
        this.expressionMethodId = expressionMethodId;
    }

    public String getExpressionTips() {
        return expressionTips;
    }

    public void setExpressionTips(String expressionTips) {
        this.expressionTips = expressionTips;
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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

    public String getPkRuleId() {
        return pkRuleId;
    }

    public void setPkRuleId(String pkRuleId) {
        this.pkRuleId = pkRuleId;
    }

    public Integer getStuffLevel() {
        return stuffLevel;
    }

    public void setStuffLevel(Integer stuffLevel) {
        this.stuffLevel = stuffLevel;
    }

    public List<String> getPkActivityId() {
        return pkActivityId;
    }

    public void setPkActivityId(List<String> pkActivityId) {
        this.pkActivityId = pkActivityId;
    }


}
