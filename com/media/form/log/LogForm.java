package com.media.form.log;

import java.util.Date;

public class LogForm {

    private String pkLogId;
    private String content;
    private String methodName;
    private String userId;
    private String userName;
    private String params;
    private String loginIP;
    private Date requeDate;
    private Date respDate;
    private String mome;
    private Integer status;
    private Integer delStatus;
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
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
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
    public String getMome() {
        return mome;
    }
    public void setMome(String mome) {
        this.mome = mome;
    }    
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public Integer getDelStatus() {
        return delStatus;
    }
    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }
    @Override
    public String toString() {
        return "LogForm [pkLogId=" + pkLogId + ", content=" + content + ", methodName=" + methodName + ", userId="
                + userId + ", userName=" + userName + ", params=" + params + ", loginIP=" + loginIP + ", requeDate="
                + requeDate + ", respDate=" + respDate + ", mome=" + mome + ", status=" + status + ", delStatus="
                + delStatus + ", logNum=" + logNum + "]";
    }    
    
}
