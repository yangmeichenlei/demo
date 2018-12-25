package com.media.form.video;

import java.util.Date;

import io.swagger.annotations.ApiModel;
/**
 * Created by lihaiqiang on 2018/11/06.
 */
@ApiModel(value = "VideoAttributeDefEditForm", description = "属性定义编辑form")
public class VideoAttributeDefEditForm {

    private String pkVideoAttributeId;

    private String videoAttrName;

    private String videoAttrNameEn;

    private String videoAttrShowName;

    private String videoClassId;

    private String pkVideoId;

    private Integer attrNo;

    private String defaultVal;

    private Integer isEnum;

    private Integer isInput;

    private Integer isSearch;

    private Integer isRequired;

    private Integer isMutil;

    private Integer isShow;

    private Integer isUserDefined;

    private Integer isContactPath;

    private String attrDesc;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    public String getPkVideoAttributeId() {
        return pkVideoAttributeId;
    }

    public void setPkVideoAttributeId(String pkVideoAttributeId) {
        this.pkVideoAttributeId = pkVideoAttributeId;
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

    @Override
    public String toString() {
        return "VideoAttributeDefEditForm{" +
                "pkVideoAttributeId='" + pkVideoAttributeId + '\'' +
                ", videoAttrName='" + videoAttrName + '\'' +
                ", videoAttrNameEn='" + videoAttrNameEn + '\'' +
                ", videoAttrShowName='" + videoAttrShowName + '\'' +
                ", videoClassId='" + videoClassId + '\'' +
                ", pkVideoId=" + pkVideoId +
                ", attrNo='" + attrNo + '\'' +
                ", defaultVal=" + defaultVal +
                ", isEnum=" + isEnum +
                ", isInput=" + isInput +
                ", isSearch=" + isSearch +
                ", isRequired=" + isRequired +
                ", isMutil=" + isMutil +
                ", isShow=" + isShow +
                ", isUserDefined=" + isUserDefined +
                ", isContactPath=" + isContactPath +
                ", attrDesc='" + attrDesc + '\'' +
                '}';
    }
}