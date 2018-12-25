package com.media.form.log;

import java.util.Date;

public class LogRecodForm {

    private String pkLogId;
    private String logContent;
    private String methodName;
    private String userId;
    private String userLogName;
    private String params;
    private String loginIP;
    private Date requeDate;
    private Date respDate;
    private String memo;
    private Integer status;
    private Integer delStatus;
    private String beforeData;
    private String afterData;
    private Date createTime;
    private String oprMemo;
    private String logNum;
    
    public String getLogNum() {
        return logNum;
    }
    public void setLogNum(String logNum) {
        this.logNum = logNum;
    }
    public String getPkLogId() {
        return pkLogId;
    }
    public void setPkLogId(String pkLogId) {
        this.pkLogId = pkLogId;
    }
    
    public String getLogContent() {
        return logContent;
    }
    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }
    public String getMethodName() {
        return methodName;
    }
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getUserLogName() {
        return userLogName;
    }
    public void setUserLogName(String userLogName) {
        this.userLogName = userLogName;
    }
    public String getParams() {
        return params;
    }
    public void setParams(String params) {
        this.params = params;
    }
    public String getLoginIP() {
        return loginIP;
    }
    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }
    public Date getRequeDate() {
        return requeDate;
    }
    public void setRequeDate(Date requeDate) {
        this.requeDate = requeDate;
    }
    public Date getRespDate() {
        return respDate;
    }
    public void setRespDate(Date respDate) {
        this.respDate = respDate;
    }
    
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getDelStatus() {
        return delStatus;
    }
    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }
    public String getBeforeData() {
        return beforeData;
    }
    public void setBeforeData(String beforeData) {
        this.beforeData = beforeData;
    }
    public String getAfterData() {
        return afterData;
    }
    public void setAfterData(String afterData) {
        this.afterData = afterData;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getOprMemo() {
        return oprMemo;
    }
    public void setOprMemo(String oprMemo) {
        this.oprMemo = oprMemo;
    }
    @Override
    public String toString() {
        return "LogRecodForm [pkLogId=" + pkLogId + ", logContent=" + logContent + ", methodName=" + methodName
                + ", userId=" + userId + ", userLogName=" + userLogName + ", params=" + params + ", loginIP=" + loginIP
                + ", requeDate=" + requeDate + ", respDate=" + respDate + ", memo=" + memo + ", status=" + status
                + ", delStatus=" + delStatus + ", beforeData=" + beforeData + ", afterData=" + afterData
                + ", createTime=" + createTime + ", oprMemo=" + oprMemo + ", logNum=" + logNum + "]";
    }

}
