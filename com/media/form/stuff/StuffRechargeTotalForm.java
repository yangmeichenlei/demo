package com.media.form.stuff;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

/**
 * Created by zhaorong on 2018/11/27.
 */
public class StuffRechargeTotalForm extends BaseForm {

    private static final long serialVersionUID = 1L;
    private String pkTotalRechargeId;

    private String stuffId;

    private BigDecimal rechargeCountTotal;

    private String memo;

    private String stuffName;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;

    public String getPkTotalRechargeId() {
        return pkTotalRechargeId;
    }

    public void setPkTotalRechargeId(String pkTotalRechargeId) {
        this.pkTotalRechargeId = pkTotalRechargeId;
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId;
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
        this.memo = memo;
    }

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
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
        return "StuffRechargeTotalForm [pkTotalRechargeId=" + pkTotalRechargeId + ", stuffId=" + stuffId
                + ", rechargeCountTotal=" + rechargeCountTotal + ", memo=" + memo + ", stuffName=" + stuffName
                + ", startTime=" + startTime + ", endTime=" + endTime + "]";
    }

}
