package com.media.form.log;

import com.media.common.base.BaseModel;
import java.util.Date;

public class LogView extends BaseModel {
  

    private String pkLogId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_log.content
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_log.methodName
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    private String methodname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_log.userId
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_log.params
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    private String params;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_log.loginIP
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    private String loginip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_log.requeDate
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    private Date requedate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_log.respDate
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    private Date respdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_log.memo
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    private String memo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_log.status
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_log.del_status
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    private Integer delStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_log.log_num
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    private String logNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_log.pk_log_id
     *
     * @return the value of md_log.pk_log_id
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public String getPkLogId() {
        return pkLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_log.pk_log_id
     *
     * @param pkLogId the value for md_log.pk_log_id
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setPkLogId(String pkLogId) {
        this.pkLogId = pkLogId == null ? null : pkLogId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_log.content
     *
     * @return the value of md_log.content
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_log.content
     *
     * @param content the value for md_log.content
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_log.methodName
     *
     * @return the value of md_log.methodName
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public String getMethodname() {
        return methodname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_log.methodName
     *
     * @param methodname the value for md_log.methodName
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setMethodname(String methodname) {
        this.methodname = methodname == null ? null : methodname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_log.userId
     *
     * @return the value of md_log.userId
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_log.userId
     *
     * @param userid the value for md_log.userId
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_log.params
     *
     * @return the value of md_log.params
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_log.params
     *
     * @param params the value for md_log.params
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_log.loginIP
     *
     * @return the value of md_log.loginIP
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public String getLoginip() {
        return loginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_log.loginIP
     *
     * @param loginip the value for md_log.loginIP
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_log.requeDate
     *
     * @return the value of md_log.requeDate
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public Date getRequedate() {
        return requedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_log.requeDate
     *
     * @param requedate the value for md_log.requeDate
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setRequedate(Date requedate) {
        this.requedate = requedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_log.respDate
     *
     * @return the value of md_log.respDate
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public Date getRespdate() {
        return respdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_log.respDate
     *
     * @param respdate the value for md_log.respDate
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setRespdate(Date respdate) {
        this.respdate = respdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_log.memo
     *
     * @return the value of md_log.memo
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_log.memo
     *
     * @param memo the value for md_log.memo
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_log.status
     *
     * @return the value of md_log.status
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_log.status
     *
     * @param status the value for md_log.status
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_log.del_status
     *
     * @return the value of md_log.del_status
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public Integer getDelStatus() {
        return delStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_log.del_status
     *
     * @param delStatus the value for md_log.del_status
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_log.log_num
     *
     * @return the value of md_log.log_num
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public String getLogNum() {
        return logNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_log.log_num
     *
     * @param logNum the value for md_log.log_num
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setLogNum(String logNum) {
        this.logNum = logNum == null ? null : logNum.trim();
    }
}