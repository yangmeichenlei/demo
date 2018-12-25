package com.media.common.model.user;

import java.util.Date;

import com.media.common.base.BaseModel;

public class User extends BaseModel {
    private String userId;

    private String parentId;

    private String mobile;

    private String password;

    private String recommendCode;

    private String userName;

    private String name;

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

    private Integer agentLevel;

    private Integer officeAreaId;

    private Integer officeCityId;

    private Integer officeProvinceId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRecommendCode() {
        return recommendCode;
    }

    public void setRecommendCode(String recommendCode) {
        this.recommendCode = recommendCode == null ? null : recommendCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone == null ? null : telPhone.trim();
    }

    public String getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType == null ? null : identifyType.trim();
    }

    public String getLicenseImgUrl() {
        return licenseImgUrl;
    }

    public void setLicenseImgUrl(String licenseImgUrl) {
        this.licenseImgUrl = licenseImgUrl == null ? null : licenseImgUrl.trim();
    }

    public String getIdentifyNo() {
        return identifyNo;
    }

    public void setIdentifyNo(String identifyNo) {
        this.identifyNo = identifyNo == null ? null : identifyNo.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
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
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getIdentifyImgUrl() {
        return identifyImgUrl;
    }

    public void setIdentifyImgUrl(String identifyImgUrl) {
        this.identifyImgUrl = identifyImgUrl == null ? null : identifyImgUrl.trim();
    }

    public String getStaffImgUrl() {
        return staffImgUrl;
    }

    public void setStaffImgUrl(String staffImgUrl) {
        this.staffImgUrl = staffImgUrl == null ? null : staffImgUrl.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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
        this.createUserId = createUserId == null ? null : createUserId.trim();
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
        this.lastModifyUserId = lastModifyUserId == null ? null : lastModifyUserId.trim();
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
        this.auditUserId = auditUserId == null ? null : auditUserId.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getThirdPartQq() {
        return thirdPartQq;
    }

    public void setThirdPartQq(String thirdPartQq) {
        this.thirdPartQq = thirdPartQq == null ? null : thirdPartQq.trim();
    }

    public String getThirdPartWeixin() {
        return thirdPartWeixin;
    }

    public void setThirdPartWeixin(String thirdPartWeixin) {
        this.thirdPartWeixin = thirdPartWeixin == null ? null : thirdPartWeixin.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType == null ? null : platformType.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getEasemobUid() {
        return easemobUid;
    }

    public void setEasemobUid(String easemobUid) {
        this.easemobUid = easemobUid == null ? null : easemobUid.trim();
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
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public Integer getAgentLevel() {
        return agentLevel;
    }

    public void setAgentLevel(Integer agentLevel) {
        this.agentLevel = agentLevel;
    }

    public Integer getOfficeAreaId() {
        return officeAreaId;
    }

    public void setOfficeAreaId(Integer officeAreaId) {
        this.officeAreaId = officeAreaId;
    }

    public Integer getOfficeCityId() {
        return officeCityId;
    }

    public void setOfficeCityId(Integer officeCityId) {
        this.officeCityId = officeCityId;
    }

    public Integer getOfficeProvinceId() {
        return officeProvinceId;
    }

    public void setOfficeProvinceId(Integer officeProvinceId) {
        this.officeProvinceId = officeProvinceId;
    }
}