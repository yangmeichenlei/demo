package com.media.common.view.stuff;

import java.util.Date;

import com.media.common.view.video.VideoView;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "StuffWatchVideoRecordView", description = "会员观影记录查询视图")
public class StuffWatchVideoRecordView {

    private String pkWatchVideoRecordId;

    private String videoId;

    private String stuffId;

    private String stuffName;

    private VideoView videoView;

    private Date watchEndTime;

    private String watchDuration;

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

    public VideoView getVideoView() {
        return videoView;
    }

    public void setVideoView(VideoView videoView) {
        this.videoView = videoView;
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "StuffWatchVideoRecordView [pkWatchVideoRecordId=" + pkWatchVideoRecordId + ", videoId=" + videoId
                + ", stuffId=" + stuffId + ", stuffName=" + stuffName + ", videoView=" + videoView + ", watchEndTime="
                + watchEndTime + ", watchDuration=" + watchDuration + ", memo=" + memo + "]";
    }

}
