package com.media.form.video;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

public class WatchVideoRecordForm extends BaseForm {

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
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;

    private String keyWord;

    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getPkWatchRecordId() {
        return pkWatchRecordId;
    }

    public void setPkWatchRecordId(String pkWatchRecordId) {
        this.pkWatchRecordId = pkWatchRecordId;
    }

    public String getVodeoId() {
        return vodeoId;
    }

    public void setVodeoId(String vodeoId) {
        this.vodeoId = vodeoId;
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
        this.avgTimeWatched = avgTimeWatched;
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
        return "WatchVideoRecordForm [pkWatchRecordId=" + pkWatchRecordId + ", vodeoId=" + vodeoId + ", clickedNum="
                + clickedNum + ", payedNum=" + payedNum + ", avgTimeWatched=" + avgTimeWatched + ", reviewedNum="
                + reviewedNum + ", sharedNum=" + sharedNum + ", praisedNum=" + praisedNum + ", goodEvaluateNum="
                + goodEvaluateNum + ", generalEvaluateNum=" + generalEvaluateNum + ", negativeEvaluateNum="
                + negativeEvaluateNum + ", releaseTime=" + releaseTime + ", boxOffice=" + boxOffice + ", videoName="
                + videoName + ", startTime=" + startTime + ", endTime=" + endTime + ", keyWord=" + keyWord + ", type="
                + type + "]";
    }

}
