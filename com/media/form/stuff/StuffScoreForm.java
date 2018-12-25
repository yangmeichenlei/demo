package com.media.form.stuff;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

/**
 * Created by zhaorong on 2018/10/29.
 */
public class StuffScoreForm extends BaseForm {
    private static final long serialVersionUID = 1L;

    private String pkScoreId;

    private String stuffId;

    private String stuffName;

    private BigDecimal score;

    private Date lastScoreTime;

    private String memo;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;

    public Date getLastScoreTime() {
        return lastScoreTime;
    }

    public void setLastScoreTime(Date lastScoreTime) {
        this.lastScoreTime = lastScoreTime;
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

    public String getPkScoreId() {
        return pkScoreId;
    }

    public void setPkScoreId(String pkScoreId) {
        this.pkScoreId = pkScoreId == null ? null : pkScoreId.trim();
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId == null ? null : stuffId.trim();
    }

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName == null ? null : stuffName.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    @Override
    public String toString() {
        return "StuffScoreForm [pkScoreId=" + pkScoreId + ", stuffId=" + stuffId + ", stuffName=" + stuffName
                + ", score=" + score + ", memo=" + memo + ", startTime=" + startTime + ", endTime=" + endTime
                + ", lastScoreTime=" + lastScoreTime + "]";
    }

}
