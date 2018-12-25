package com.media.common.view.video;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.media.common.constant.Constant;
import com.media.common.model.video.VideoAttributeRef;
import com.media.common.model.video.VideoAttributeValue;
import com.media.common.model.video.VideoAttributeValueRef;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "VideoAttributeDefView", description = "视频属性定义视图")
public class VideoAttributeDefView {

    private String pkVideoAttributeId;
    
    private String pkVideoAttributeRefId;

    private String videoAttrName;

    private String videoAttrNameEn;

    private String videoAttrShowName;

    private String videoClassId;

    private String videoClassName;//分类名称

    private String pkVideoId;

    private Integer attrNo = Constant.ZERO;

    private String defaultVal;

    private Integer isEnum = Constant.ZERO;

    private Integer isInput = Constant.ZERO;

    private Integer isSearch = Constant.ZERO;

    private Integer isRequired = Constant.ZERO;

    private Integer isMutil = Constant.ZERO;

    private Integer isShow = Constant.ZERO;

    private Integer isUserDefined = Constant.ZERO;

    private Integer isContactPath = Constant.ZERO;

    private String attrDesc;

    private Integer status = 1;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    private String createUserName;//创建用户名称

    private String lastModifyUserName;//修改用户名称

    private String statusName;//状态名称
    
    private int count;//数量
    private List<OptiValueView> optiValues = new ArrayList<OptiValueView>();//属性的自定义值集合
    
    private List<AttrValueView> attrValue = new ArrayList<AttrValueView>();//属性的枚举值
    
    private List<VideoAttributeValue> attributeValueList;


    public List<OptiValueView> getOptiValues() {
        return optiValues;
    }

    public void setOptiValues(List<OptiValueView> optiValues) {
        this.optiValues = optiValues;
    }

    public List<AttrValueView> getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(List<AttrValueView> attrValue) {
        this.attrValue = attrValue;
    }

    public String getPkVideoAttributeId() {
        return pkVideoAttributeId;
    }

    public void setPkVideoAttributeId(String pkVideoAttributeId) {
        this.pkVideoAttributeId = pkVideoAttributeId;
    }

    public String getPkVideoAttributeRefId() {
        return pkVideoAttributeRefId;
    }

    public void setPkVideoAttributeRefId(String pkVideoAttributeRefId) {
        this.pkVideoAttributeRefId = pkVideoAttributeRefId;
    }

    public String getVideoAttrName() {
        return videoAttrName;
    }

    public void setVideoAttrName(String videoAttrName) {
        this.videoAttrName = videoAttrName;
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

    public String getVideoClassName() {
        return videoClassName;
    }

    public void setVideoClassName(String videoClassName) {
        this.videoClassName = videoClassName;
    }

    public String getPkVideoId() {
        return pkVideoId;
    }

    public void setPkVideoId(String pkVideoId) {
        this.pkVideoId = pkVideoId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getLastModifyUserName() {
        return lastModifyUserName;
    }

    public void setLastModifyUserName(String lastModifyUserName) {
        this.lastModifyUserName = lastModifyUserName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "VideoAttributeDefView [pkVideoAttributeId=" + pkVideoAttributeId + ", videoAttrName=" + videoAttrName
                + ", videoAttrNameEn=" + videoAttrNameEn + ", videoAttrShowName=" + videoAttrShowName
                + ", videoClassId=" + videoClassId + ", videoClassName=" + videoClassName + ", pkVideoId=" + pkVideoId
                + ", attrNo=" + attrNo + ", defaultVal=" + defaultVal + ", isEnum=" + isEnum + ", isInput=" + isInput
                + ", isSearch=" + isSearch + ", isRequired=" + isRequired + ", isMutil=" + isMutil + ", isShow="
                + isShow + ", isUserDefined=" + isUserDefined + ", isContactPath=" + isContactPath + ", attrDesc="
                + attrDesc + ", status=" + status + ", createUserId=" + createUserId + ", createTime=" + createTime
                + ", lastModifyUserId=" + lastModifyUserId + ", lastModifyTime=" + lastModifyTime + ", createUserName="
                + createUserName + ", lastModifyUserName=" + lastModifyUserName + ", statusName=" + statusName
                + ", count=" + count + ", optiValues=" + optiValues + ", attrValue=" + attrValue
                + ", attributeValueList=" + attributeValueList + "]";
    }
    
}
