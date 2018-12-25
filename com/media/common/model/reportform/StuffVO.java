package com.media.common.model.reportform;

import java.util.Date;

import com.media.common.utils.excel.ExcelColumn;

public class StuffVO {
    @ExcelColumn(name = "序号", column = "A")
    private String stuffId;
    @ExcelColumn(name = "会员名", column = "B", isExport = true)
    private String stuffName;
    @ExcelColumn(name = "手机号", column = "C", isExport = true)
    private String mobile;
    @ExcelColumn(name = "昵称", column = "D", isExport = true)
    private String nickName;
    @ExcelColumn(name = "兴趣", column = "E", isExport = true)
    private String interest;
    // 性别，1-男，0-女
    @ExcelColumn(name = "性别", column = "F", isExport = true)
    private String gender;
    @ExcelColumn(name = "会员级别", column = "G", isExport = true)
    private Integer stuffRank;
    @ExcelColumn(name = "会员积分", column = "H", isExport = true)
    private double score;
    // 邮箱
    @ExcelColumn(name = "邮箱", column = "I", isExport = true)
    private String email;
    // 注册时间
    @ExcelColumn(name = "注册时间", column = "J", isExport = true)
    private Date registTime;
    // 会员状态， 0-冻结，1-正常，2-异常
    @ExcelColumn(name = "会员状态", column = "K", isExport = true)
    private String status;
    // 区域_id
    @ExcelColumn(name = "区域ID", column = "L", isExport = true)
    private Integer areaId;
    // 市_id
    @ExcelColumn(name = "市ID", column = "M", isExport = true)
    private Integer cityId;
    // 省_id
    @ExcelColumn(name = "省ID", column = "N", isExport = true)
    private Integer provinceId;

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId;
    }

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getStuffRank() {
        return stuffRank;
    }

    public void setStuffRank(Integer stuffRank) {
        this.stuffRank = stuffRank;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    @Override
    public String toString() {
        return "StuffVO [stuffId=" + stuffId + ", stuffName=" + stuffName + ", mobile="
                + mobile + ", nickName=" + nickName + ", interest=" + interest + ", gender=" + gender + ", stuffRank="
                + stuffRank + ", score=" + score + ", email=" + email + ", registTime="
                + registTime + ", status=" + status + ", areaId=" + areaId + ", cityId=" + cityId + ", provinceId="
                + provinceId + "]";
    }

}
