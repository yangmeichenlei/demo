package com.media.common.model.stuff;

import com.media.common.base.BaseModel;
import com.media.common.model.user.User;

import java.util.Date;
import java.util.List;

/**
 * Created by zhaorong on 2018/10/29.
 */
public class StuffScoreRule extends BaseModel {

    private static final long serialVersionUID = 1L;

    private String pkScoreRuleId;

    private String scoreRuleName;

    private String scoreRuleExplain;

    private Date createTime;

    private String createUserId;

    private Date updateTime;

    private String updateUserId;

    private Date startTime;

    private Date endTime;

    private Integer status;

    private String memo;

    private User createUser;

    private User updateUser;

    private List<StuffScoreRuleDetail> scoreRuleDetails;

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

    public List<StuffScoreRuleDetail> getScoreRuleDetails() {
        return scoreRuleDetails;
    }

    public void setScoreRuleDetails(List<StuffScoreRuleDetail> scoreRuleDetails) {
        this.scoreRuleDetails = scoreRuleDetails;
    }

    public String getPkScoreRuleId() {
        return pkScoreRuleId;
    }

    public void setPkScoreRuleId(String pkScoreRuleId) {
        this.pkScoreRuleId = pkScoreRuleId == null ? null : pkScoreRuleId.trim();
    }

    public String getScoreRuleName() {
        return scoreRuleName;
    }

    public void setScoreRuleName(String scoreRuleName) {
        this.scoreRuleName = scoreRuleName == null ? null : scoreRuleName.trim();
    }

    public String getScoreRuleExplain() {
        return scoreRuleExplain;
    }

    public void setScoreRuleExplain(String scoreRuleExplain) {
        this.scoreRuleExplain = scoreRuleExplain == null ? null : scoreRuleExplain.trim();
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