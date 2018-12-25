package com.media.common.model.address;

/**
 * Created by lihaiqiang on 2018/12/14.
 */
public class AreaxIdInfo {

    private Integer provinceId;
    
    private Integer cityId;

    public Integer getCityId() {
        return cityId;
    }
    public Integer getProvinceId() {
        return provinceId;
    }
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}
