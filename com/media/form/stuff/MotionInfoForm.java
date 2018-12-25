package com.media.form.stuff;

import java.util.Date;

import com.media.common.base.BaseForm;

/**
 * Created by zhaorong on 2018/10/31.
 */
public class MotionInfoForm extends BaseForm {
    private static final long serialVersionUID = 1L;

    private String pkStuffId;

    private String stuffName;

    private Date loginTime;

    private Integer provinceId;

    private Integer cityId;

    private String loginIp;

    private Integer loginTerminal;

    private Integer status;

    public String getPkStuffId() {
        return pkStuffId;
    }

    public void setPkStuffId(String pkStuffId) {
        this.pkStuffId = pkStuffId == null ? null : pkStuffId.trim();
    }
    
    
    
    public String getStuffName() {
        return stuffName;
    }
    
    
    public void setStuffName(String stuffName) {
        this.stuffName = stuffName == null ? null : stuffName.trim();
    }

    
    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
    
    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Integer getLoginTerminal() {
        return loginTerminal;
    }

    public void setLoginTerminal(Integer loginTerminal) {
        this.loginTerminal = loginTerminal;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StuffScoreForm{" +
                "pkScoreId='" + pkStuffId + '\'' +
                ", stuffName='" + stuffName + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", provinceId='" + provinceId + '\'' +
                ", cityId='" + cityId + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", loginTerminal='" + loginTerminal + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
