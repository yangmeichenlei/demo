package com.media.common.view.video;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "VideoImageView", description = "视频图片视图")
public class VideoImageView {
    private Integer isPr = 0;

    private String imgName;

    private String imgPath;

    public Integer getIsPr() {
        return isPr;
    }

    public void setIsPr(Integer isPr) {
        this.isPr = isPr;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}