package com.media.form.video;

import io.swagger.annotations.ApiModel;

/**
 * Created by lihaiqiang on 2018/11/09.
 */
@ApiModel(value = "VideoAttributeValueKeyForm",description = "视频属性值查询form")
public class VideoAttributeValueKeyForm {
    private String pkVideoAttributeValue;//视频属性值Id

    public String getPkVideoAttributeValue() {
        return pkVideoAttributeValue;
    }

    public void setPkVideoAttributeValue(String pkVideoAttributeValue) {
        this.pkVideoAttributeValue = pkVideoAttributeValue;
    }

    @Override
    public String toString() {
        return "VideoAttributeValueKeyForm{" +
                "pkVideoAttributeValue='" + pkVideoAttributeValue + '\'' +
                '}';
    }

}
