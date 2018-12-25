package com.media.form.video;

import com.media.common.base.BaseForm;
import com.sun.tools.javac.util.List;

import io.swagger.annotations.ApiModel;
/**
 * Created by lihaiqiang on 2018/11/15.
 */
@ApiModel(value = "VideoAttributeRefBindForm", description = "视频属性绑定form")
public class VideoAttributeRefBindForm extends BaseForm {

    private static final long serialVersionUID = 5804071415564369412L;

    private String videoId;

    private String[] attrIdList;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String[] getAttrIdList() {
        return attrIdList;
    }

    public void setAttrIdList(String[] attrIdList) {
        this.attrIdList = attrIdList;
    }

    @Override
    public String toString() {
        return "VideoAttributeRefBindForm{" +
                "videoId='" + videoId + '\'' +
                ", attrIdList=" + attrIdList +
                '}';
    }
}