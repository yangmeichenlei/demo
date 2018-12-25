package com.media.common.view.video;

import java.util.List;

import com.media.common.model.video.VideoAttributeValue;

import io.swagger.annotations.ApiModel;

/**
 * Created by lihaiqinag on 2018/11/01.
 */
@ApiModel(value = "VideoAttributeRefView", description = "视频属性关联视图")
public class VideoAttributeRefView {

    private String pkVideoAttributeRefId;//视频属性关联Id
    
    private String pkVideoAttributeId;

    private String videoAttributeId;//属性Id

    private String videoAttrName;//属性显示名称

    private String attrValId;//属性值对应的可选项Id

    private String attrVal;//属性值

    private String videoAttrNameEn;

    private String videoAttrShowName;

    private String videoClassId;

    private Integer attrNo;

    private String defaultVal;//属性默认值

    private Integer isEnum;//是否枚举

    private Integer isInput;//是否文本输入

    private Integer isSearch;//是否查询

    private Integer isRequired;//是否必填

    private Integer isMutil;//是否多选

    private Integer isShow;//是否显示

    private Integer isUserDefined;//是否用户自定义字段值

    private Integer isContactPath;//是否关联视频文件路径

    private String attrDesc;

    private List<VideoAttributeOptionView> videoAttributeOptionList;//枚举:属性选项列表
    
    private List<VideoAttributeValue> videoAttributeValueList;//视频属性字段值列表
    
    public String getPkVideoAttributeRefId() {
        return pkVideoAttributeRefId;
    }

    public void setPkVideoAttributeRefId(String pkVideoAttributeRefId) {
        this.pkVideoAttributeRefId = pkVideoAttributeRefId;
    }

    public String getPkVideoAttributeId() {
        return pkVideoAttributeId;
    }

    public void setPkVideoAttributeId(String pkVideoAttributeId) {
        this.pkVideoAttributeId = pkVideoAttributeId;
    }

    public String getVideoAttributeId() {
        return videoAttributeId;
    }

    public void setVideoAttributeId(String videoAttributeId) {
        this.videoAttributeId = videoAttributeId;
    }

    public String getVideoAttrName() {
        return videoAttrName;
    }

    public void setVideoAttrName(String videoAttrName) {
        this.videoAttrName = videoAttrName;
    }

    public String getAttrValId() {
        return attrValId;
    }

    public void setAttrValId(String attrValId) {
        this.attrValId = attrValId;
    }

    public String getAttrVal() {
        return attrVal;
    }

    public void setAttrVal(String attrVal) {
        this.attrVal = attrVal;
    }

    public String getVideoAttrNameEn() {
        return videoAttrNameEn;
    }

    public void setVideoAttrNameEn(String videoAttrNameEn) {
        this.videoAttrNameEn = videoAttrNameEn;
    }

    public String getVideoAttrShowName() {
        return videoAttrShowName;
    }

    public void setVideoAttrShowName(String videoAttrShowName) {
        this.videoAttrShowName = videoAttrShowName;
    }

    public String getVideoClassId() {
        return videoClassId;
    }

    public void setVideoClassId(String videoClassId) {
        this.videoClassId = videoClassId;
    }

    public Integer getAttrNo() {
        return attrNo;
    }

    public void setAttrNo(Integer attrNo) {
        this.attrNo = attrNo;
    }

    public String getDefaultVal() {
        return defaultVal;
    }

    public void setDefaultVal(String defaultVal) {
        this.defaultVal = defaultVal;
    }

    public Integer getIsEnum() {
        return isEnum;
    }

    public void setIsEnum(Integer isEnum) {
        this.isEnum = isEnum;
    }

    public Integer getIsInput() {
        return isInput;
    }

    public void setIsInput(Integer isInput) {
        this.isInput = isInput;
    }

    public Integer getIsSearch() {
        return isSearch;
    }

    public void setIsSearch(Integer isSearch) {
        this.isSearch = isSearch;
    }

    public Integer getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
    }

    public Integer getIsMutil() {
        return isMutil;
    }

    public void setIsMutil(Integer isMutil) {
        this.isMutil = isMutil;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getIsUserDefined() {
        return isUserDefined;
    }

    public void setIsUserDefined(Integer isUserDefined) {
        this.isUserDefined = isUserDefined;
    }

    public Integer getIsContactPath() {
        return isContactPath;
    }

    public void setIsContactPath(Integer isContactPath) {
        this.isContactPath = isContactPath;
    }

    public String getAttrDesc() {
        return attrDesc;
    }

    public void setAttrDesc(String attrDesc) {
        this.attrDesc = attrDesc;
    }

    public List<VideoAttributeOptionView> getVideoAttributeOptionList() {
        return videoAttributeOptionList;
    }

    public void setVideoAttributeOptionList(List<VideoAttributeOptionView> videoAttributeOptionList) {
        this.videoAttributeOptionList = videoAttributeOptionList;
    }

    public List<VideoAttributeValue> getVideoAttributeValueList() {
        return videoAttributeValueList;
    }

    public void setVideoAttributeValueList(List<VideoAttributeValue> videoAttributeValueList) {
        this.videoAttributeValueList = videoAttributeValueList;
    }

    @Override
    public String toString() {
        return "VideoAttributeRefView{" +
                "pkVideoAttributeRefId='" + pkVideoAttributeRefId + '\'' +
                ", videoAttributeId='" + videoAttributeId + '\'' +
                ", videoAttrName='" + videoAttrName + '\'' +
                ", attrValId='" + attrValId + '\'' +
                ", attrVal='" + attrVal + '\'' +
                ", videoAttrNameEn='" + videoAttrNameEn + '\'' +
                ", videoAttrShowName='" + videoAttrShowName + '\'' +
                ", videoClassId='" + videoClassId + '\'' +
                ", attrNo='" + attrNo + '\'' +
                ", defaultVal='" + defaultVal + '\'' +
                ", isRequired=" + isRequired +
                ", isEnum=" + isEnum +
                ", isMutil=" + isMutil +
                ", isInput=" + isInput +
                ", isSearch=" + isSearch +
                ", isShow=" + isShow +
                ", isUserDefined=" + isUserDefined +
                ", isContactPath=" + isContactPath +
                ", attrDesc='" + attrDesc + '\'' +
                ", videoAttributeOptionList=" + videoAttributeOptionList +
                ", videoAttributeValueList=" + videoAttributeValueList +
                '}';
    }
}
