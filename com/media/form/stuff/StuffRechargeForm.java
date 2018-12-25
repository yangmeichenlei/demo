package com.media.form.stuff;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

import io.swagger.annotations.ApiModel;

/**
 * Created by zhaorong on 2018/11/25.
 */
@ApiModel(value = "StuffRechargeForm", description = "会员充值纪录form")
public class StuffRechargeForm extends BaseForm {
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

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;

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

    public String getPkRechargeId() {
        return pkRechargeId;
    }

    public void setPkRechargeId(String pkRechargeId) {
        this.pkRechargeId = pkRechargeId;
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId;
    }

    public String getRechargeRuleId() {
        return rechargeRuleId;
    }

    public void setRechargeRuleId(String rechargeRuleId) {
        this.rechargeRuleId = rechargeRuleId;
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
        this.auditUserId = auditUserId;
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
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "StuffRechargeForm [pkRechargeId=" + pkRechargeId + ", stuffId=" + stuffId + ", rechargeRuleId="
                + rechargeRuleId + ", rechargeCount=" + rechargeCount + ", rechargeRealityCount=" + rechargeRealityCount
                + ", rechargeTime=" + rechargeTime + ", rechargeArriveTime=" + rechargeArriveTime + ", rechargeStatus="
                + rechargeStatus + ", rechargeType=" + rechargeType + ", auditUserId=" + auditUserId + ", auditTime="
                + auditTime + ", memo=" + memo + ", stuffName=" + stuffName + ", expressionTips=" + expressionTips
                + ", userName=" + userName + ", startTime=" + startTime + ", endTime=" + endTime + "]";
    }

}
