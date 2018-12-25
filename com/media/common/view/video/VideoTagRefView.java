package com.media.common.view.video;

public class VideoTagRefView {
    

    private String pkVideoClassId;
    
    private String pkVideoRefId;

    private String pkVideoId;

    private String videoNameCh;

    private String videoNameEn;
    
    private String videoClassName;

    private Integer videoType;

    private String pkTagId;
    
    private String pkTagName;

    private Integer tagNo;
    
    
    public String getPkTagName() {
        return pkTagName;
    }

    public void setPkTagName(String pkTagName) {
        this.pkTagName = pkTagName;
    }
    public String getPkVideoClassId() {
        return pkVideoClassId;
    }

    public void setPkVideoClassId(String pkVideoClassId) {
        this.pkVideoClassId = pkVideoClassId;
    }

    
    public String getPkVideoRefId() {
        return pkVideoRefId;
    }

    public void setPkVideoRefId(String pkVideoRefId) {
        this.pkVideoRefId = pkVideoRefId;
    }

    public String getPkVideoId() {
        return pkVideoId;
    }

    public void setPkVideoId(String pkVideoId) {
        this.pkVideoId = pkVideoId;
    }

    public String getVideoNameCh() {
        return videoNameCh;
    }

    public void setVideoNameCh(String videoNameCh) {
        this.videoNameCh = videoNameCh;
    }

    public String getVideoNameEn() {
        return videoNameEn;
    }

    public void setVideoNameEn(String videoNameEn) {
        this.videoNameEn = videoNameEn;
    }

    public String getVideoClassName() {
        return videoClassName;
    }

    public void setVideoClassName(String videoClassName) {
        this.videoClassName = videoClassName;
    }

    public Integer getVideoType() {
        return videoType;
    }

    public void setVideoType(Integer videoType) {
        this.videoType = videoType;
    }

    public String getPkTagId() {
        return pkTagId;
    }

    public void setPkTagId(String pkTagId) {
        this.pkTagId = pkTagId;
    }

    public Integer getTagNo() {
        return tagNo;
    }

    public void setTagNo(Integer tagNo) {
        this.tagNo = tagNo;
    }

    @Override
    public String toString() {
        return "VideoTagRefView [pkVideoClassId=" + pkVideoClassId + ", pkVideoRefId=" + pkVideoRefId + ", pkVideoId="
                + pkVideoId + ", videoNameCh=" + videoNameCh + ", videoNameEn=" + videoNameEn + ", videoClassName="
                + videoClassName + ", videoType=" + videoType + ", pkTagId=" + pkTagId + ", pkTagName=" + pkTagName
                + ", tagNo=" + tagNo + "]";
    }
    
}
