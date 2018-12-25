package com.media.form.video;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

import io.swagger.annotations.ApiModel;

/**
 * @author zhaoRong
 *
 */
@ApiModel(value = "BoxOfficeTotalForm", description = "票房总记录form")
public class BoxOfficeTotalForm extends BaseForm {
    private static final long serialVersionUID = 1L;

    private String pkBoxOfficeTotalId;

    private String videoId;

    private BigDecimal boxOfficeTotal;

    private Date lastUpdateTime;

    private String memo;

    private String videoName;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;

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

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
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
        return "BoxOfficeTotalForm [pkBoxOfficeTotalId=" + pkBoxOfficeTotalId + ", videoId=" + videoId
                + ", boxOfficeTotal=" + boxOfficeTotal + ", lastUpdateTime=" + lastUpdateTime + ", memo=" + memo
                + ", videoName=" + videoName + ", startTime=" + startTime + ", endTime=" + endTime + "]";
    }


}
