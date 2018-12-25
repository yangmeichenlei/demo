package com.media.form.video;

import java.util.List;

public class VideoAttrValueForm {

    private String pkId;
    private List<String> ValueIds;
    private Integer isEnum;//判断应该存入那张表（枚举表，自定义value表）
    private List<VideoAttrValueForm> subForm;//解决层级关系
    
    
    public Integer getIsEnum() {
        return isEnum;
    }
    public void setIsEnum(Integer isEnum) {
        this.isEnum = isEnum;
    }
    public List<VideoAttrValueForm> getSubForm() {
        return subForm;
    }
    public void setSubForm(List<VideoAttrValueForm> subForm) {
        this.subForm = subForm;
    }
    public String getPkId() {
        return pkId;
    }
    public void setPkId(String pkId) {
        this.pkId = pkId;
    }
    public List<String> getValueIds() {
        return ValueIds;
    }
    public void setValueIds(List<String> valueIds) {
        ValueIds = valueIds;
    }
    @Override
    public String toString() {
        return "VideoAttrValueForm [pkId=" + pkId + ", ValueIds=" + ValueIds + ", isEnum=" + isEnum + ", subForm="
                + subForm + "]";
    }
    
    
}
