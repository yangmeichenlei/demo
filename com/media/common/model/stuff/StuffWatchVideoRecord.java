package com.media.common.model.stuff;

import com.media.common.base.BaseModel;
import java.util.Date;

/**
 * @author zhaoRong
 *
 */
public class StuffWatchVideoRecord extends BaseModel {
    private static final long serialVersionUID = 1L;

    private String pkWatchVideoRecordId;

    private String videoId;

    private String stuffId;

    private Date watchEndTime;

    private String watchDuration;

    private String memo;

    public String getPkWatchVideoRecordId() {
        return pkWatchVideoRecordId;
    }

    public void setPkWatchVideoRecordId(String pkWatchVideoRecordId) {
        this.pkWatchVideoRecordId = pkWatchVideoRecordId == null ? null : pkWatchVideoRecordId.trim();
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId == null ? null : stuffId.trim();
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
        this.watchDuration = watchDuration == null ? null : watchDuration.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}