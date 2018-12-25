package com.media.form.video;

import io.swagger.annotations.ApiModel;

/**
 * Created by lihaiqiang on 2018/11/01.
 */
@ApiModel(value = "VideoClassKeyForm",description = "视频分类查询form")
public class VideoClassKeyForm {
    private String pkVideoClassId;//视频分类Id

    public String getPkVideoClassId() {
        return pkVideoClassId;
    }

    public void setPkVideoClassId(String pkVideoClassId) {
        this.pkVideoClassId = pkVideoClassId;
    }

    @Override
    public String toString() {
        return "VideoClassKeyForm{" +
                "pkVideoClassId='" + pkVideoClassId + '\'' +
                '}';
    }

}
