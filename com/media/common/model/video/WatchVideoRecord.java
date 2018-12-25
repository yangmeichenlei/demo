package com.media.common.model.video;

import com.media.common.base.BaseModel;
import java.util.Date;

public class WatchVideoRecord extends BaseModel {
    private static final long serialVersionUID = 1L;

    private String pkWatchRecordId;

    private String vodeoId;

    private Integer clickedNum;

    private Integer payedNum;

    private String avgTimeWatched;

    private Integer reviewedNum;

    private Integer sharedNum;

    private Integer praisedNum;

    private Integer goodEvaluateNum;

    private Integer generalEvaluateNum;

    private Integer negativeEvaluateNum;

    private Date releaseTime;

    private Double boxOffice;

    private String videoName;

    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getPkWatchRecordId() {
        return pkWatchRecordId;
    }

    public void setPkWatchRecordId(String pkWatchRecordId) {
        this.pkWatchRecordId = pkWatchRecordId == null ? null : pkWatchRecordId.trim();
    }

    public String getVodeoId() {
        return vodeoId;
    }

    public void setVodeoId(String vodeoId) {
        this.vodeoId = vodeoId == null ? null : vodeoId.trim();
    }

    public Integer getClickedNum() {
        return clickedNum;
    }

    public void setClickedNum(Integer clickedNum) {
        this.clickedNum = clickedNum;
    }

    public Integer getPayedNum() {
        return payedNum;
    }

    public void setPayedNum(Integer payedNum) {
        this.payedNum = payedNum;
    }

    public String getAvgTimeWatched() {
        return avgTimeWatched;
    }

    public void setAvgTimeWatched(String avgTimeWatched) {
        this.avgTimeWatched = avgTimeWatched == null ? null : avgTimeWatched.trim();
    }

    public Integer getReviewedNum() {
        return reviewedNum;
    }

    public void setReviewedNum(Integer reviewedNum) {
        this.reviewedNum = reviewedNum;
    }

    public Integer getSharedNum() {
        return sharedNum;
    }

    public void setSharedNum(Integer sharedNum) {
        this.sharedNum = sharedNum;
    }

    public Integer getPraisedNum() {
        return praisedNum;
    }

    public void setPraisedNum(Integer praisedNum) {
        this.praisedNum = praisedNum;
    }

    public Integer getGoodEvaluateNum() {
        return goodEvaluateNum;
    }

    public void setGoodEvaluateNum(Integer goodEvaluateNum) {
        this.goodEvaluateNum = goodEvaluateNum;
    }

    public Integer getGeneralEvaluateNum() {
        return generalEvaluateNum;
    }

    public void setGeneralEvaluateNum(Integer generalEvaluateNum) {
        this.generalEvaluateNum = generalEvaluateNum;
    }

    public Integer getNegativeEvaluateNum() {
        return negativeEvaluateNum;
    }

    public void setNegativeEvaluateNum(Integer negativeEvaluateNum) {
        this.negativeEvaluateNum = negativeEvaluateNum;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Double getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(Double boxOffice) {
        this.boxOffice = boxOffice;
    }
}