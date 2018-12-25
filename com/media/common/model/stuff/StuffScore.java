package com.media.common.model.stuff;

import com.media.common.base.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhaorong on 2018/10/29.
 */
public class StuffScore extends BaseModel {

    private static final long serialVersionUID = 1L;

    private String pkScoreId;

    private String stuffId;

    private String stuffName;

    private BigDecimal score;

    private String memo;

    private Date lastScoreTime;

    public Date getLastScoreTime() {
        return lastScoreTime;
    }

    public void setLastScoreTime(Date lastScoreTime) {
        this.lastScoreTime = lastScoreTime;
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
}