package com.media.common.model.stuff;

import com.media.common.base.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhaorong on 2018/11/25.
 */
public class StuffRecharge extends BaseModel {
    private static final long serialVersionUID = 1L;

    private String pkRechargeId;

    private String stuffId;

    private String rechargeRuleId;

    private BigDecimal rechargeCount;

    private BigDecimal rechargeRealityCount;

    private Date rechargeTime;

    private Date rechargeArriveTime;

    private Integer rechargeStatus;

    private Integer rechargeType;

    private String auditUserId;

    private Date auditTime;

    private String memo;

    private String stuffName;

    private String expressionTips;

    private String userName;

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
    }

    public String getExpressionTips() {
        return expressionTips;
    }

    public void setExpressionTips(String expressionTips) {
        this.expressionTips = expressionTips;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPkRechargeId() {
        return pkRechargeId;
    }

    public void setPkRechargeId(String pkRechargeId) {
        this.pkRechargeId = pkRechargeId == null ? null : pkRechargeId.trim();
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId == null ? null : stuffId.trim();
    }

    public String getRechargeRuleId() {
        return rechargeRuleId;
    }

    public void setRechargeRuleId(String rechargeRuleId) {
        this.rechargeRuleId = rechargeRuleId == null ? null : rechargeRuleId.trim();
    }

    public BigDecimal getRechargeCount() {
        return rechargeCount;
    }

    public void setRechargeCount(BigDecimal rechargeCount) {
        this.rechargeCount = rechargeCount;
    }

    public BigDecimal getRechargeRealityCount() {
        return rechargeRealityCount;
    }

    public void setRechargeRealityCount(BigDecimal rechargeRealityCount) {
        this.rechargeRealityCount = rechargeRealityCount;
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public Date getRechargeArriveTime() {
        return rechargeArriveTime;
    }

    public void setRechargeArriveTime(Date rechargeArriveTime) {
        this.rechargeArriveTime = rechargeArriveTime;
    }

    public Integer getRechargeStatus() {
        return rechargeStatus;
    }

    public void setRechargeStatus(Integer rechargeStatus) {
        this.rechargeStatus = rechargeStatus;
    }

    public Integer getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(Integer rechargeType) {
        this.rechargeType = rechargeType;
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}