package com.media.common.reviewTree;

import java.util.Date;
import java.util.List;

/**
 * 评论树形结构
 * 
 * @author zhaoRong
 *
 */
public class ReviewTreeView {

    private String pkReviewId;

    private String reviewObjectId;

    private String reviewContent;

    private String stuffId;

    private Integer praisedNum;

    private Integer repliedNum;
    
    private Integer isTop;

    private Integer isHot;
    
    private Date createTime;
    
    private String stuffName;
    
    private String imgUrl;
    
    private List<ReviewTreeView> childReviewList;

    public String getPkReviewId() {
        return pkReviewId;
    }

    public void setPkReviewId(String pkReviewId) {
        this.pkReviewId = pkReviewId;
    }

    public String getReviewObjectId() {
        return reviewObjectId;
    }

    public void setReviewObjectId(String reviewObjectId) {
        this.reviewObjectId = reviewObjectId;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<ReviewTreeView> getChildReviewList() {
        return childReviewList;
    }

    public void setChildReviewList(List<ReviewTreeView> childReviewList) {
        this.childReviewList = childReviewList;
    }

}
