package com.media.form.review;

import com.media.common.base.BaseForm;

/**
 * Created by zhaorong on 2018/11/08.
 */
public class ReviewTotalForm extends BaseForm {

    private static final long serialVersionUID = 1L;
    private String pkTotalId;

    private String reviewObjectId;

    private Integer reviewCount;

    private Integer browseCount;

    private String videoName;

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getPkTotalId() {
        return pkTotalId;
    }

    public void setPkTotalId(String pkTotalId) {
        this.pkTotalId = pkTotalId == null ? null : pkTotalId.trim();
    }

    public String getReviewObjectId() {
        return reviewObjectId;
    }

    public void setReviewObjectId(String reviewObjectId) {
        this.reviewObjectId = reviewObjectId == null ? null : reviewObjectId.trim();
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Integer getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }

    @Override
    public String toString() {
        return "ReviewTotalForm [pkTotalId=" + pkTotalId + ", reviewObjectId=" + reviewObjectId + ", reviewCount="
                + reviewCount + ", browseCount=" + browseCount + ", videoName=" + videoName + "]";
    }

}
