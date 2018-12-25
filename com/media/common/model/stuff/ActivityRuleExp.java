package com.media.common.model.stuff;

import com.media.common.base.BaseModel;
import java.util.Date;

public class ActivityRuleExp extends BaseModel {

    private String pkRuleExpressionId;

    private Integer selectGoodsType;

    private Double totalPrice;

    private Double totalDiscount;

    private Integer totalNumber;

    private Integer totalPresent;

    private Integer priceDiscount;

    private Integer stuffLevel;

    private Date createTime;

    private String createUserId;

    private Date updateTime;

    private String updateUserId;

    private Date startTime;

    private Date endTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}