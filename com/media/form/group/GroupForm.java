package com.media.form.group;

import java.util.Date;

import com.media.common.base.BaseForm;

public class GroupForm extends BaseForm {
	private static final long serialVersionUID = 1L;
	private String pkGroupId;
    private String groupName;
    private String mobile;
    private String contectPeople;
    private Integer status;
    private Date createTime;
    private String createUserId;
    private Date updateTime;
    private String updateUserId;
    private String memo;
    public String getPkGroupId() {
        return pkGroupId;
    }
    public void setPkGroupId(String pkGroupId) {
        this.pkGroupId = pkGroupId == null ? null : pkGroupId.trim();
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
    public String getContectPeople() {
        return contectPeople;
    }
    public void setContectPeople(String contectPeople) {
        this.contectPeople = contectPeople == null ? null : contectPeople.trim();
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
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
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public String getUpdateUserId() {
        return updateUserId;
    }
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}
