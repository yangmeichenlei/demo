package com.media.common.model.review;

import com.media.common.base.BaseModel;
import com.media.common.model.stuff.Stuff;
import com.media.common.model.user.User;
import com.media.common.model.video.Video;

import java.util.Date;

/**
 * Created by zhaorong on 2018/11/08.
 */
public class Review extends BaseModel {
    private static final long serialVersionUID = 1L;

    private String pkReviewId;

    private String parentReviewId;

    private String reviewObjectId;

    private String reviewContent;

    private String stuffId;

    private Integer praisedNum;

    private Integer repliedNum;

    private Integer isTop;

    private Integer isHot;

    private Integer dataStatus;

    private Integer reviewStatus;

    private Date createTime;

    private String deleteUserId;

    private Date deleteTime;

    private String auditorUserId;

    private Date auditorTime;

    private Integer isAuthor;

    private String memo;

    private Video videoName;

    private Stuff stuffName;

    private User auditorName;

    private User deleteName;

    private String parentName;

    private String imgUrl;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Video getVideoName() {
        return videoName;
    }

    public void setVideoName(Video videoName) {
        this.videoName = videoName;
    }

    public Stuff getStuffName() {
        return stuffName;
    }

    public void setStuffName(Stuff stuffName) {
        this.stuffName = stuffName;
    }

    public User getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(User auditorName) {
        this.auditorName = auditorName;
    }

    public User getDeleteName() {
        return deleteName;
    }

    public void setDeleteName(User deleteName) {
        this.deleteName = deleteName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getPkReviewId() {
        return pkReviewId;
    }

    public void setPkReviewId(String pkReviewId) {
        this.pkReviewId = pkReviewId == null ? null : pkReviewId.trim();
    }

    public String getParentReviewId() {
        return parentReviewId;
    }

    public void setParentReviewId(String parentReviewId) {
        this.parentReviewId = parentReviewId == null ? null : parentReviewId.trim();
    }

    public String getReviewObjectId() {
        return reviewObjectId;
    }

    public void setReviewObjectId(String reviewObjectId) {
        this.reviewObjectId = reviewObjectId == null ? null : reviewObjectId.trim();
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent == null ? null : reviewContent.trim();
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId == null ? null : stuffId.trim();
    }

    public Integer getPraisedNum() {
        return praisedNum;
    }

    public void setPraisedNum(Integer praisedNum) {
        this.praisedNum = praisedNum;
    }

    public Integer getRepliedNum() {
        return repliedNum;
    }

    public void setRepliedNum(Integer repliedNum) {
        this.repliedNum = repliedNum;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDeleteUserId() {
        return deleteUserId;
    }

    public void setDeleteUserId(String deleteUserId) {
        this.deleteUserId = deleteUserId == null ? null : deleteUserId.trim();
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getAuditorUserId() {
        return auditorUserId;
    }

    public void setAuditorUserId(String auditorUserId) {
        this.auditorUserId = auditorUserId == null ? null : auditorUserId.trim();
    }

    public Date getAuditorTime() {
        return auditorTime;
    }

    public void setAuditorTime(Date auditorTime) {
        this.auditorTime = auditorTime;
    }

    public Integer getIsAuthor() {
        return isAuthor;
    }

    public void setIsAuthor(Integer isAuthor) {
        this.isAuthor = isAuthor;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}