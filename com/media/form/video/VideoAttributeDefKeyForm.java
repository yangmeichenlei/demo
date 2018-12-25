package com.media.form.video;

import io.swagger.annotations.ApiModel;
/**
 * Created by lihaiqiang on 2018/11/06.
 */
@ApiModel(value = "VideoAttributeDefKeyForm", description = "属性定义主键查询form")
public class VideoAttributeDefKeyForm{
    private String pkAttributeId;

    public String getPkAttributeId() {
        return pkAttributeId;
    }

    public void setPkAttributeId(String pkAttributeId) {
        this.pkAttributeId = pkAttributeId;
    }

    @Override
    public String toString() {
        return "VideoAttributeDefKeyForm{" +
                "pkAttributeId='" + pkAttributeId + '\'' +
                '}';
    }
}