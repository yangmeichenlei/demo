package com.media.form.stuff;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "StuffWatchVideoRecordForm", description = "会员观影纪录form")
public class StuffWatchVideoRecordForm extends BaseForm {

    private static final long serialVersionUID = 1L;

    private String pkWatchVideoRecordId;

    private String videoId;

    private String stuffId;

    private String stuffName;

    private Date watchEndTime;

    private String watchDuration;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;

    private String memo;

    public String getPkWatchVideoRecordId() {
        return pkWatchVideoRecordId;
    }

    public void setPkWatchVideoRecordId(String pkWatchVideoRecordId) {
        this.pkWatchVideoRecordId = pkWatchVideoRecordId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId;
    }

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
    }

    public Date getWatchEndTime() {
        return watchEndTime;
    }

    public void setWatchEndTime(Date watchEndTime) {
        this.watchEndTime = watchEndTime;
    }

    public String getWatchDuration() {
        return watchDuration;
    }

    public void setWatchDuration(String watchDuration) {
        this.watchDuration = watchDuration;
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "StuffWatchVideoRecordForm [pkWatchVideoRecordId=" + pkWatchVideoRecordId + ", videoId=" + videoId
                + ", stuffId=" + stuffId + ", stuffName=" + stuffName + ", watchEndTime=" + watchEndTime
                + ", watchDuration=" + watchDuration + ", startTime=" + startTime + ", endTime=" + endTime + ", memo="
                + memo + "]";
    }

}
