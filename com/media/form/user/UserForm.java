package com.media.form.user;

import java.util.ArrayList;
import java.util.Date;

import com.media.common.base.BaseForm;

/**
 * Created by lihaiqiang on 2018/08/15.
 */
public class UserForm extends BaseForm{

    private static final long serialVersionUID = -551253611621510656L;

    private String userId;
    
    private ArrayList<String> userIds;

    private String userName;

    private String mobile;

    private String password;

    private String recommendCode;

    private Integer gender;

    private String telPhone;

    private String identifyType;

    private String licenseImgUrl;

    private String identifyNo;

    private String nickName;

    private Integer userType;

    private Integer status;

    private String imgUrl;

    private String identifyImgUrl;

    private String staffImgUrl;

    private String email;

    private Date lastLoginTime;

    private Date createTime;

    private String createUserId;

    private Date lastModifyTime;

    private String lastModifyUserId;

    private Date auditTime;

    private String auditUserId;

    private String memo;

    private String thirdPartQq;

    private String thirdPartWeixin;

    private String clientId;

    private String platformType;

    private String channelId;

    private String easemobUid;

    private Integer areaId;

    private Integer cityId;

    private Integer provinceId;

    private String qrCode;
    
    private String parentId;

    private String name;

    private String findKey;

    private String validCode;

    private Integer agentLevel;

    private Integer cityParentId; //市级代理的父级ID即省级ID
    private Integer areaParentId; //区级代理的父级ID即市级ID
    private String curUserId;

    public ArrayList<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(ArrayList<String> userIds) {
        this.userIds = userIds;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getRecommendCode() {
        return recommendCode;
    }

    public void setRecommendCode(String recommendCode) {
        this.recommendCode = recommendCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public String getIdentifyNo() {
        return identifyNo;
    }

    public void setIdentifyNo(String identifyNo) {
        this.identifyNo = identifyNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getIdentifyImgUrl() {
        return identifyImgUrl;
    }

    public void setIdentifyImgUrl(String identifyImgUrl) {
        this.identifyImgUrl = identifyImgUrl;
    }

    public String getStaffImgUrl() {
        return staffImgUrl;
    }

    public void setStaffImgUrl(String staffImgUrl) {
        this.staffImgUrl = staffImgUrl;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getThirdPartQq() {
        return thirdPartQq;
    }

    public void setThirdPartQq(String thirdPartQq) {
        this.thirdPartQq = thirdPartQq;
    }

    public String getThirdPartWeixin() {
        return thirdPartWeixin;
    }

    public void setThirdPartWeixin(String thirdPartWeixin) {
        this.thirdPartWeixin = thirdPartWeixin;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getEasemobUid() {
        return easemobUid;
    }

    public void setEasemobUid(String easemobUid) {
        this.easemobUid = easemobUid;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getLicenseImgUrl() {
        return licenseImgUrl;
    }

    public void setLicenseImgUrl(String licenseImgUrl) {
        this.licenseImgUrl = licenseImgUrl;
    }

    public String getFindKey() {
        return findKey;
    }

    public void setFindKey(String findKey) {
        this.findKey = findKey;
    }

    public String getValidCode() {
        return validCode;
    }

    public void setValidCode(String validCode) {
        this.validCode = validCode;
    }

    public Integer getAgentLevel() {
        return agentLevel;
    }

    public void setAgentLevel(Integer agentLevel) {
        this.agentLevel = agentLevel;
    }

    public Integer getCityParentId() {
        return cityParentId;
    }

    public String getCurUserId() {
        return curUserId;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "userId='" + userId + '\'' +
                ", userIds=" + userIds +
                ", userName='" + userName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", recommendCode='" + recommendCode + '\'' +
                ", gender=" + gender +
                ", telPhone='" + telPhone + '\'' +
                ", identifyType='" + identifyType + '\'' +
                ", licenseImgUrl='" + licenseImgUrl + '\'' +
                ", identifyNo='" + identifyNo + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userType=" + userType +
                ", status=" + status +
                ", imgUrl='" + imgUrl + '\'' +
                ", identifyImgUrl='" + identifyImgUrl + '\'' +
                ", staffImgUrl='" + staffImgUrl + '\'' +
                ", email='" + email + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", lastModifyTime=" + lastModifyTime +
                ", lastModifyUserId='" + lastModifyUserId + '\'' +
                ", auditTime=" + auditTime +
                ", auditUserId='" + auditUserId + '\'' +
                ", memo='" + memo + '\'' +
                ", thirdPartQq='" + thirdPartQq + '\'' +
                ", thirdPartWeixin='" + thirdPartWeixin + '\'' +
                ", clientId='" + clientId + '\'' +
                ", platformType='" + platformType + '\'' +
                ", channelId='" + channelId + '\'' +
                ", easemobUid='" + easemobUid + '\'' +
                ", areaId=" + areaId +
                ", cityId=" + cityId +
                ", provinceId=" + provinceId +
                ", qrCode='" + qrCode + '\'' +
                ", parentId='" + parentId + '\'' +
                ", name='" + name + '\'' +
                ", findKey='" + findKey + '\'' +
                ", validCode='" + validCode + '\'' +
                ", agentLevel=" + agentLevel +
                ", cityParentId=" + cityParentId +
                ", areaParentId=" + areaParentId +
                ", curUserId='" + curUserId + '\'' +
                '}';
    }

    public void setCurUserId(String curUserId) {
        this.curUserId = curUserId;
    }

    public void setCityParentId(Integer cityParentId) {
        this.cityParentId = cityParentId;
    }

    public Integer getAreaParentId() {
        return areaParentId;
    }

    public void setAreaParentId(Integer areaParentId) {
        this.areaParentId = areaParentId;
    }

}
