package com.media.common.model.stuff;

import com.media.common.base.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhaorong on 2018/11/25.
 */
public class StuffExpense extends BaseModel {
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

    public String getPkExpenseId() {
        return pkExpenseId;
    }

    public void setPkExpenseId(String pkExpenseId) {
        this.pkExpenseId = pkExpenseId == null ? null : pkExpenseId.trim();
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId == null ? null : stuffId.trim();
    }

    public String getExpenseRuleId() {
        return expenseRuleId;
    }

    public void setExpenseRuleId(String expenseRuleId) {
        this.expenseRuleId = expenseRuleId == null ? null : expenseRuleId.trim();
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
        this.expenseDetail = expenseDetail == null ? null : expenseDetail.trim();
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
        this.memo = memo == null ? null : memo.trim();
    }
}