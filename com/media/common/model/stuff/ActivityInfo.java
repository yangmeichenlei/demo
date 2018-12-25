package com.media.common.model.stuff;

import com.media.common.base.BaseModel;
import com.media.common.model.user.User;
import com.sun.tools.javac.util.List;

import java.util.Date;

public class ActivityInfo extends BaseModel {
    private String pkActivityId;
    
    private String activityChinaName;

    private String activityEngName;

    private Date createTime;

    private String createUserId;

    private Date updateTime;

    private String updateUserId;
    
    private Date startTime;

    private Date endTime;
    
    private Integer type;

    private Integer status;

    private String memo;
    
    private User createUser;
    
    private User updateUser;
    
    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public User getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(User updateUser) {
        this.updateUser = updateUser;
    }

    public String getPkActivityId() {
        return pkActivityId;
    }

    public void setPkActivityId(String pkActivityId) {
        this.pkActivityId = pkActivityId == null ? null : pkActivityId.trim();
    }

    public String getActivityChinaName() {
        return activityChinaName;
    }

    public void setActivityChinaName(String activityChinaName) {
        this.activityChinaName = activityChinaName == null ? null : activityChinaName.trim();
    }

    public String getActivityEngName() {
        return activityEngName;
    }

    public void setActivityEngName(String activityEngName) {
        this.activityEngName = activityEngName == null ? null : activityEngName.trim();
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
    

}