package com.media.form.video;

import io.swagger.annotations.ApiModel;
/**
 * Created by lihaiqiang on 2018/11/06.
 */
@ApiModel(value = "VideoClassEditForm", description = "视频分类编辑form")
public class VideoClassEditForm {
    private String pkVideoClassId;

    private String videoClassCode;

    private String videoClassName;

    private String parentVideoClassId;

    private Integer videoClassNo;
    
    private String videoLayerClassCode;

    private String videoClassDesc;

    public String getPkVideoClassId() {
        return pkVideoClassId;
    }

    public void setPkVideoClassId(String pkVideoClassId) {
        this.pkVideoClassId = pkVideoClassId;
    }

    public String getVideoClassCode() {
        return videoClassCode;
    }

    public void setVideoClassCode(String videoClassCode) {
        this.videoClassCode = videoClassCode;
    }

    public String getVideoClassName() {
        return videoClassName;
    }

    public void setVideoClassName(String videoClassName) {
        this.videoClassName = videoClassName;
    }

    public String getParentVideoClassId() {
        return parentVideoClassId;
    }

    public void setParentVideoClassId(String parentVideoClassId) {
        this.parentVideoClassId = parentVideoClassId;
    }

    public Integer getVideoClassNo() {
        return videoClassNo;
    }

    public void setVideoClassNo(Integer videoClassNo) {
        this.videoClassNo = videoClassNo;
    }

    public String getVideoLayerClassCode() {
        return videoLayerClassCode;
    }

    public void setVideoLayerClassCode(String videoLayerClassCode) {
        this.videoLayerClassCode = videoLayerClassCode;
    }

    public String getVideoClassDesc() {
        return videoClassDesc;
    }

    public void setVideoClassDesc(String videoClassDesc) {
        this.videoClassDesc = videoClassDesc;
    }

    @Override
    public String toString() {
        return "VideoClassEditForm{" +
                "pkVideoClassId='" + pkVideoClassId + '\'' +
                ", videoClassCode='" + videoClassCode + '\'' +
                ", videoClassName='" + videoClassName + '\'' +
                ", parentVideoClassId='" + parentVideoClassId + '\'' +
                ", videoClassNo=" + videoClassNo +
                ", videoLayerClassCode=" + videoLayerClassCode +
                ", videoClassDesc='" + videoClassDesc + '\'' +
                '}';
    }
}