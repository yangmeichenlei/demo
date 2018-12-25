package com.media.form.stuff;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.media.common.base.BaseForm;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActivityForm extends BaseForm {
    private static final long serialVersionUID = 1L;

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

    private String cruUserId;

    public String getCruUserId() {
        return cruUserId;
    }

    public void setCruUserId(String cruUserId) {
        this.cruUserId = cruUserId;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

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
