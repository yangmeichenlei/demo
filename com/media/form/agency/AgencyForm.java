package com.media.form.agency;

import java.util.Date;

import com.media.common.base.BaseForm;

public class AgencyForm extends BaseForm{

    private String agencyUserId;
    private String userId;
    private String userName;
    private String name;
    private String gender;
    private String agencyId;
    private String agencyCode;
    private String agencyName;
    private String parentId;
    private Date createTime;//都是关于user的信息。
    private String createId;
    private String createName;
    private Date lastModifyTime;
    private String lastModifyId;
    private String lastModuifyName;
    private String telPhone;
    private String mobile;
    private Integer status;
    private String keyWord;
    
    
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getKeyWord() {
        return keyWord;
    }
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
    public String getAgencyUserId() {
        return agencyUserId;
    }
    public void setAgencyUserId(String agencyUserId) {
        this.agencyUserId = agencyUserId;
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
    public String getAgencyId() {
        return agencyId;
    }
    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }
    public String getAgencyCode() {
        return agencyCode;
    }
    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }
    public String getAgencyName() {
        return agencyName;
    }
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
    public String getParentId() {
        return parentId;
    }
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getCreateId() {
        return createId;
    }
    public void setCreateId(String createId) {
        this.createId = createId;
    }
    public String getCreateName() {
        return createName;
    }
    public void setCreateName(String createName) {
        this.createName = createName;
    }
    public Date getLastModifyTime() {
        return lastModifyTime;
    }
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
    public String getLastModifyId() {
        return lastModifyId;
    }
    public void setLastModifyId(String lastModifyId) {
        this.lastModifyId = lastModifyId;
    }
    public String getLastModuifyName() {
        return lastModuifyName;
    }
    public void setLastModuifyName(String lastModuifyName) {
        this.lastModuifyName = lastModuifyName;
    }
    public String getTelPhone() {
        return telPhone;
    }
    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "AgencyForm [agencyUserId=" + agencyUserId + ", userId=" + userId + ", userName=" + userName + ", name="
                + name + ", gender=" + gender + ", agencyId=" + agencyId + ", agencyCode=" + agencyCode
                + ", agencyName=" + agencyName + ", parentId=" + parentId + ", createTime=" + createTime + ", createId="
                + createId + ", createName=" + createName + ", lastModifyTime=" + lastModifyTime + ", lastModifyId="
                + lastModifyId + ", lastModuifyName=" + lastModuifyName + ", telPhone=" + telPhone + ", mobile="
                + mobile + ", status=" + status + ", keyWord=" + keyWord + "]";
    }
  
}
