package com.media.form.video;

import io.swagger.annotations.ApiModel;
/**
 * Created by lihaiqiang on 2018/11/06.
 */
@ApiModel(value = "VideoAttributeOptionKeyForm", description = "属性可选项主键查询form")
public class VideoAttributeOptionKeyForm {
    private String pkVideoAttributeOptionId;

    public String getPkVideoAttributeOptionId() {
        return pkVideoAttributeOptionId;
    }

    public void setPkVideoAttributeOptionId(String pkVideoAttributeOptionId) {
        this.pkVideoAttributeOptionId = pkVideoAttributeOptionId == null ? null : pkVideoAttributeOptionId.trim();
    }

    @Override
    public String toString() {
        return "VideoAttributeOptionKeyForm{" +
                "pkVideoAttributeOptionId='" + pkVideoAttributeOptionId + '\'' +
                '}';
    }
}