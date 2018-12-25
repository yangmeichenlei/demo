package com.media.common.model.video;

import com.media.common.base.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhaoRong
 *
 */
public class BoxOfficeTotal extends BaseModel {
    private static final long serialVersionUID = 1L;

    private String pkBoxOfficeTotalId;

    private String videoId;

    private BigDecimal boxOfficeTotal;

    private Date lastUpdateTime;

    private String memo;

    public String getPkBoxOfficeTotalId() {
        return pkBoxOfficeTotalId;
    }

    public void setPkBoxOfficeTotalId(String pkBoxOfficeTotalId) {
        this.pkBoxOfficeTotalId = pkBoxOfficeTotalId == null ? null : pkBoxOfficeTotalId.trim();
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public BigDecimal getBoxOfficeTotal() {
        return boxOfficeTotal;
    }

    public void setBoxOfficeTotal(BigDecimal boxOfficeTotal) {
        this.boxOfficeTotal = boxOfficeTotal;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}