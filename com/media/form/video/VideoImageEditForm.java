package com.media.form.video;

import io.swagger.annotations.ApiModel;
/**
 * Created by lihaiqinag on 2018/11/05.
 */
@ApiModel(value = "VideoImageEditForm", description = "图片编辑form")
public class VideoImageEditForm {
    private Integer isPri;

    private String imgName;

    private String imgPath;

    public Integer getIsPri() {
        return isPri;
    }

    public void setIsPri(Integer isPri) {
        this.isPri = isPri;
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