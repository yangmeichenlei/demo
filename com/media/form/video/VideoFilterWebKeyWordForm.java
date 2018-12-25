package com.media.form.video;

import com.media.common.base.BaseForm;

import io.swagger.annotations.ApiModel;
/**
 * Created by lihaiqiang on 2018/12/06.
 */
@ApiModel(value = "VideoFilterWebKeyWordForm", description = "web前端关键字查询：主查询入口")
public class VideoFilterWebKeyWordForm extends BaseForm {

    private static final long serialVersionUID = 5804051415564569412L;

    private String keyWord;//可根据视频名称 视频简介 主演名称 导演名称等筛选
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    @Override
    public String toString() {
        return "AttributeDefFilterForm{" +
                "keyWord='" + keyWord + '\'' +
                '}';
    }
}