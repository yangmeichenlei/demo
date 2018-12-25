package com.media.form.video;

import io.swagger.annotations.ApiModel;
/**
 * Created by lihaiqinag on 2018/11/05.
 */
@ApiModel(value = "VideoKeyForm", description = "视频主键查找form")
public class VideoKeyForm {
    private String pkVideoId;

    public String getPkVideoId() {
        return pkVideoId;
    }

    public void setPkVideoId(String pkVideoId) {
        this.pkVideoId = pkVideoId;
    }

    @Override
    public String toString() {
        return "VideoKeyForm{" +
                "pkVideoId='" + pkVideoId + '\'' +
                '}';
    }
}