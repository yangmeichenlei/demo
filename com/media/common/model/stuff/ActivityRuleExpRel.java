package com.media.common.model.stuff;

import com.media.common.base.BaseModel;
import java.util.Date;

public class ActivityRuleExpRel extends BaseModel {
    private String pkRuleexpGoodsId;
    
    private String ruleExpressionId;
    
    private String productId;
    
    private String goodsId;
    
    private String classId;

    private Date createTime;

    private String createUserId;

    private Date updateTime;

    private String updateUserId;

    private Date startTime;

    private Date endTime;

    private Integer status;

    private String memo;

    public String getPkRuleexpGoodsId() {
        return pkRuleexpGoodsId;
    }

    public void setPkRuleexpGoodsId(String pkRuleexpGoodsId) {
        this.pkRuleexpGoodsId = pkRuleexpGoodsId == null ? null : pkRuleexpGoodsId.trim();
    }

    public String getRuleExpressionId() {
        return ruleExpressionId;
    }

    public void setRuleExpressionId(String ruleExpressionId) {
        this.ruleExpressionId = ruleExpressionId == null ? null : ruleExpressionId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
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
        this.memo = memo == null ? null : memo.trim();
    }
}