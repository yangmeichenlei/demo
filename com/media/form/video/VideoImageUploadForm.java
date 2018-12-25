package com.media.form.video;

import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * Created by lihaiqinag on 2018/11/05.
 */
@ApiModel(value = "VideoImageUploadForm", description = "图片上传form")
public class VideoImageUploadForm {
    private String refId;
    private Integer imgType;
    private List<VideoImageEditForm> videoImageEditFormList;

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public Integer getImgType() {
        return imgType;
    }

    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    public List<VideoImageEditForm> getVideoImageEditFormList() {
        return videoImageEditFormList;
    }

    public void setVideoImageEditFormList(List<VideoImageEditForm> videoImageEditFormList) {
        this.videoImageEditFormList = videoImageEditFormList;
    }
}
