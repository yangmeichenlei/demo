package com.media.form.video;

import java.util.List;

import com.media.common.base.BaseForm;

import io.swagger.annotations.ApiModel;
/**
 * Created by lihaiqiang on 2018/12/06.
 */
@ApiModel(value = "VideoFilterWebForm", description = "前端条件筛选查询form")
public class VideoFilterWebForm extends BaseForm {

    private static final long serialVersionUID = 5804071415564569412L;

    private String hotTag;//热搜标签 默认综合排序:可选项 热门,更新时间,评分,票房
    
    private List<String> tagIdList;//标签筛选
    
    private List<String> classIdList;//分类筛选
    
    private List<String> videoAttributeList;//属性筛选

    public String getHotTag() {
        return hotTag;
    }

    public void setHotTag(String hotTag) {
        this.hotTag = hotTag;
    }

    public List<String> getTagIdList() {
        return tagIdList;
    }

    public void setTagIdList(List<String> tagIdList) {
        this.tagIdList = tagIdList;
    }

    public List<String> getClassIdList() {
        return classIdList;
    }

    public void setClassIdList(List<String> classIdList) {
        this.classIdList = classIdList;
    }

    public List<String> getVideoAttributeList() {
        return videoAttributeList;
    }

    public void setVideoAttributeList(List<String> videoAttributeList) {
        this.videoAttributeList = videoAttributeList;
    }

    @Override
    public String toString() {
        return "AttributeDefFilterForm{" +
                ", hotTag=" + hotTag +
                ", tagIdList=" + tagIdList +
                ", classIdList=" + classIdList +
                ", videoAttributeList=" + videoAttributeList +
                '}';
    }
}