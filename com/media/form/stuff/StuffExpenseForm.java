package com.media.form.stuff;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

import io.swagger.annotations.ApiModel;

/**
 * Created by zhaorong on 2018/11/25.
 */
@ApiModel(value = "StuffExpenseForm", description = "会员消费纪录form")
public class StuffExpenseForm extends BaseForm {
    private static final long serialVersionUID = 1L;

    private String pkExpenseId;

    private String stuffId;

    private String expenseRuleId;

    private BigDecimal expenseCount;

    private BigDecimal expenseRealityCount;

    private Integer expenseStatus;

    private Date expenseTime;

    private String expenseDetail;

    private BigDecimal expenseCountSum;

    private String memo;

    private String stuffName;

    private String expressionTips;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;

    public String getPkExpenseId() {
        return pkExpenseId;
    }

    public void setPkExpenseId(String pkExpenseId) {
        this.pkExpenseId = pkExpenseId;
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId;
    }

    public String getExpenseRuleId() {
        return expenseRuleId;
    }

    public void setExpenseRuleId(String expenseRuleId) {
        this.expenseRuleId = expenseRuleId;
    }

    public BigDecimal getExpenseCount() {
        return expenseCount;
    }

    public void setExpenseCount(BigDecimal expenseCount) {
        this.expenseCount = expenseCount;
    }

    public BigDecimal getExpenseRealityCount() {
        return expenseRealityCount;
    }

    public void setExpenseRealityCount(BigDecimal expenseRealityCount) {
        this.expenseRealityCount = expenseRealityCount;
    }

    public Integer getExpenseStatus() {
        return expenseStatus;
    }

    public void setExpenseStatus(Integer expenseStatus) {
        this.expenseStatus = expenseStatus;
    }

    public Date getExpenseTime() {
        return expenseTime;
    }

    public void setExpenseTime(Date expenseTime) {
        this.expenseTime = expenseTime;
    }

    public String getExpenseDetail() {
        return expenseDetail;
    }

    public void setExpenseDetail(String expenseDetail) {
        this.expenseDetail = expenseDetail;
    }

    public BigDecimal getExpenseCountSum() {
        return expenseCountSum;
    }

    public void setExpenseCountSum(BigDecimal expenseCountSum) {
        this.expenseCountSum = expenseCountSum;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

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

    @Override
    public String toString() {
        return "StuffExpenseForm [pkExpenseId=" + pkExpenseId + ", stuffId=" + stuffId + ", expenseRuleId="
                + expenseRuleId + ", expenseCount=" + expenseCount + ", expenseRealityCount=" + expenseRealityCount
                + ", expenseStatus=" + expenseStatus + ", expenseTime=" + expenseTime + ", expenseDetail="
                + expenseDetail + ", expenseCountSum=" + expenseCountSum + ", memo=" + memo + ", stuffName=" + stuffName
                + ", expressionTips=" + expressionTips + ", startTime=" + startTime + ", endTime=" + endTime + "]";
    }

}
