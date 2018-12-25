package com.media.common.view.user;

public class AgentInfoView {

    /**
     * 代理商id
     */
    private String agentId;

    /**
     * 父ID
     * 
     */
    private String parentId;

    /**
     * 市id
     */
    private Integer cityId;
    /**
     * 代理商省id
     */
    private Integer provinceId;

    /**
     * 区域id
     */
    private Integer areaId;

    public String getParentId() {
        return parentId;
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

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

     

}
