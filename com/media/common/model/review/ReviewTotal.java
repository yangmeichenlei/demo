package com.media.common.model.review;

import com.media.common.base.BaseModel;
import com.media.common.model.video.Video;

/**
 * Created by zhaorong on 2018/11/08.
 */
public class ReviewTotal extends BaseModel {
    private static final long serialVersionUID = 1L;

    private String pkTotalId;

    private String reviewObjectId;

    private Integer reviewCount;

    private Integer browseCount;

    private Video videoName;

    public Video getVideoName() {
        return videoName;
    }

    public void setVideoName(Video videoName) {
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
}