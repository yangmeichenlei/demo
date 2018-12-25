package com.media.form.stuff;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

public class StuffForm extends BaseForm {
    private static final long serialVersionUID = 1L;
    // 会员ID
    private String pkStuffId;
 // 会员ID
    private String uid;
    // 会员名
    private String stuffName;
    // 密码
    private String password;
    // 手机号
    private String mobile;
    // 昵称
    private String nickName;
  //会员类型
    private int stuffType;
    // 兴趣爱好
    private String interest;
    // 性别，1-男，0-女
    private Integer gender;
    // 会员级别
    private Integer stuffRank;
    // 积分
    private double score;
    // 头像(图片链接)
    private String imgUrl;
    // 邮箱
    private String email;
    // 注册时间
    private Date registTime;
    // 会员状态， 0-冻结，1-正常，2-异常
    private Integer status;
    // 区域_id
    private Integer areaId;
    // 市_id
    private Integer cityId;
    // 省_id
    private Integer provinceId;
    private ArrayList<String> stuffIds;
    private String curStuffId;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;

    private String keyWord;


	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getStuffType() {
		return stuffType;
	}

	public void setStuffType(int stuffType) {
		this.stuffType = stuffType;
	}

	public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public StuffForm() {

    }

    public String getPkStuffId() {
		return pkStuffId;
	}

	public void setPkStuffId(String pkStuffId) {
		this.pkStuffId = pkStuffId;
	}

	public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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

    public ArrayList<String> getStuffIds() {
        return stuffIds;
    }

    public void setStuffIds(ArrayList<String> stuffIds) {
        this.stuffIds = stuffIds;
    }

    public String getCurStuffId() {
        return curStuffId;
    }

    public void setCurStuffId(String curStuffId) {
        this.curStuffId = curStuffId;
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

    @Override
    public String toString() {
        return "StuffForm [stuffId=" + pkStuffId + ", stuffName=" + stuffName + ", password=" + password + ", mobile="
                + mobile + ", nickName=" + nickName + ", interest=" + interest + ", gender=" + gender + ", stuffRank="
                + stuffRank + ", score=" + score + ", imgUrl=" + imgUrl + ", email=" + email + ", registTime="
                + registTime + ", status=" + status + ", areaId=" + areaId + ", cityId=" + cityId + ", provinceId="
                + provinceId + ", stuffIds=" + stuffIds + ", curStuffId=" + curStuffId + ", startTime=" + startTime
                + ", endTime=" + endTime + ", keyWord=" + keyWord + "]";
    }

}
