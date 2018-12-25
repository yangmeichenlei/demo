package com.media.common.model.stuff;

import com.media.common.base.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhaorong on 2018/11/27.
 */
public class StuffExpenseTotal extends BaseModel {
    private static final long serialVersionUID = 1L;

    private String pkTotalExpenseId;

    private String stuffId;

    private BigDecimal expenseCountSum;

    private String memo;

    private String stuffName;

    private Date lastExpenseTime;

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
    }

    public Date getLastExpenseTime() {
        return lastExpenseTime;
    }

    public void setLastExpenseTime(Date lastExpenseTime) {
        this.lastExpenseTime = lastExpenseTime;
    }

    public String getPkTotalExpenseId() {
        return pkTotalExpenseId;
    }

    public void setPkTotalExpenseId(String pkTotalExpenseId) {
        this.pkTotalExpenseId = pkTotalExpenseId == null ? null : pkTotalExpenseId.trim();
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId == null ? null : stuffId.trim();
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