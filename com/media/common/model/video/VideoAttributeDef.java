package com.media.common.model.video;

import com.media.common.base.BaseModel;
import java.util.Date;
import java.util.List;
/**
 * Created by lihaiqiang on 2018/11/02.
 */
public class VideoAttributeDef extends BaseModel {

    private static final long serialVersionUID = -8873292843631948650L;

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

    private Integer isUserDefined;//是否用户自定义属性值

    private Integer isContactPath;//是否关联文件路径

    private String attrDesc;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;
    
    private List<VideoAttributeValue> attributeValueList;

    public String getPkVideoAttributeId() {
        return pkVideoAttributeId;
    }

    public void setPkVideoAttributeId(String pkVideoAttributeId) {
        this.pkVideoAttributeId = pkVideoAttributeId == null ? null : pkVideoAttributeId.trim();
    }

    public String getVideoAttrName() {
        return videoAttrName;
    }

    public void setVideoAttrName(String videoAttrName) {
        this.videoAttrName = videoAttrName == null ? null : videoAttrName.trim();
    }

    public String getVideoAttrNameEn() {
        return videoAttrNameEn;
    }

    public void setVideoAttrNameEn(String videoAttrNameEn) {
        this.videoAttrNameEn = videoAttrNameEn == null ? null : videoAttrNameEn.trim();
    }

    public String getVideoAttrShowName() {
        return videoAttrShowName;
    }

    public void setVideoAttrShowName(String videoAttrShowName) {
        this.videoAttrShowName = videoAttrShowName == null ? null : videoAttrShowName.trim();
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
        this.pkVideoId = pkVideoId == null ? null : pkVideoId.trim();
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
        this.defaultVal = defaultVal == null ? null : defaultVal.trim();
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
        this.attrDesc = attrDesc == null ? null : attrDesc.trim();
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
        this.createUserId = createUserId == null ? null : createUserId.trim();
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
        this.lastModifyUserId = lastModifyUserId == null ? null : lastModifyUserId.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public List<VideoAttributeValue> getAttributeValueList() {
        return attributeValueList;
    }

    public void setAttributeValueList(List<VideoAttributeValue> attributeValueList) {
        this.attributeValueList = attributeValueList;
    }
}