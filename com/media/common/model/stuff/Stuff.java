package com.media.common.model.stuff;
/**
 * 
* @ClassName: Stuff 
* @Description:  会员实体类
* @author AWG
* @date 2018年10月11日 上午11:38:20 
*
 */

import java.util.Date;
import com.media.common.base.BaseModel;

public class Stuff extends BaseModel{
    private static final long serialVersionUID = 1L;
    //会员ID
    private String pkStuffId;
  //uid
    private String uid;
    //会员名
    private String stuffName;
    //密码
    private String password;
    //手机号
    private String mobile;
    //会员类型
    private int stuffType;
    //昵称
    private String nickName;
    //兴趣爱好
    private String interest;
    //性别，1-男，0-女
    private Integer gender;
    //会员级别
    private Integer stuffRank;
    //积分
    private double score;
    //头像(图片链接)
    private String imgUrl;
    //邮箱
    private String email;
    //注册时间
    private Date registTime;
    //会员状态， 0-冻结，1-正常，2-异常
    private Integer status;
    //区域_id
    private Integer areaId;
    //市_id
    private Integer cityId;
    //省_id
    private Integer provinceId;

    private String areaName;

    private String cityName;

    private String provinceName;
    

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

	public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Stuff() {
        
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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
