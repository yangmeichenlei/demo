package com.media.common.view.ActivityRule;

import java.util.Date;

import com.media.common.model.stuff.ActivityRule;
import com.media.common.model.user.User;

public class ARuleView {
    private String pkRuleId;

    private Double score;

    private String expressionMethodId;

    private String expressionTips;

    private Integer targetType;

    private Date createTime;

    private String createUserId;

    private Date updateTime;

    private String updateUserId;

    private Date startTime;

    private Date endTime;

    private Integer status;

    private User createUser;

    private User updateUser;

    private String memo;

    private ActivityRule activityRule;

    private String pkActivityRule;

    public String getPkActivityRule() {
        return pkActivityRule;
    }

    public void setPkActivityRule(String pkActivityRule) {
        this.pkActivityRule = pkActivityRule;
    }

    public ActivityRule getActivityRule() {
        return activityRule;
    }

    public void setActivityRule(ActivityRule activityRule) {
        this.activityRule = activityRule;
    }

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

    public String getPkRuleId() {
        return pkRuleId;
    }

    public void setPkRuleId(String pkRuleId) {
        this.pkRuleId = pkRuleId == null ? null : pkRuleId.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getExpressionMethodId() {
        return expressionMethodId;
    }

    public void setExpressionMethodId(String expressionMethodId) {
        this.expressionMethodId = expressionMethodId == null ? null : expressionMethodId.trim();
    }

    public String getExpressionTips() {
        return expressionTips;
    }

    public void setExpressionTips(String expressionTips) {
        this.expressionTips = expressionTips == null ? null : expressionTips.trim();
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
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
