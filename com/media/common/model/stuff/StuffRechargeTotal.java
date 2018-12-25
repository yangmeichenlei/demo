package com.media.common.model.stuff;

import com.media.common.base.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhaorong on 2018/11/27.
 */
public class StuffRechargeTotal extends BaseModel {
    private static final long serialVersionUID = 1L;

    private String pkTotalRechargeId;

    private String stuffId;

    private BigDecimal rechargeCountTotal;

    private String memo;

    private String stuffName;

    private Date lastRechargeTime;

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
    }

    public Date getLastRechargeTime() {
        return lastRechargeTime;
    }

    public void setLastRechargeTime(Date lastRechargeTime) {
        this.lastRechargeTime = lastRechargeTime;
    }

    public String getPkTotalRechargeId() {
        return pkTotalRechargeId;
    }

    public void setPkTotalRechargeId(String pkTotalRechargeId) {
        this.pkTotalRechargeId = pkTotalRechargeId == null ? null : pkTotalRechargeId.trim();
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId == null ? null : stuffId.trim();
    }

    public BigDecimal getRechargeCountTotal() {
        return rechargeCountTotal;
    }

    public void setRechargeCountTotal(BigDecimal rechargeCountTotal) {
        this.rechargeCountTotal = rechargeCountTotal;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}