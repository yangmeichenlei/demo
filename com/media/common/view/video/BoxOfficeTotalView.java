package com.media.common.view.video;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "BoxOfficeTotalView", description = "票房统计视图")
public class BoxOfficeTotalView {

    private String pkBoxOfficeTotalId;

    private String videoId;

    private String videoName;

    private BigDecimal boxOfficeTotal;

    private Date lastUpdateTime;

    private String memo;

    public String getPkBoxOfficeTotalId() {
        return pkBoxOfficeTotalId;
    }

    public void setPkBoxOfficeTotalId(String pkBoxOfficeTotalId) {
        this.pkBoxOfficeTotalId = pkBoxOfficeTotalId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
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
        this.memo = memo;
    }

}
