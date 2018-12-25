package com.media.common.view.agency;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Created by chenlei on 2018/11/5.
 */
public class AgencyView {
    
    private String agencyId;
    private String agencyCode;
    private String agencyName;
    private String parentId;
    private Date createTime;
    private String createId;
    private String createName;
    private Date lastModifyTime;
    private String lastModifyId;
    private String lastModuifyName;
    private String memo;
    private String telPhone;
    private Integer status;
    //机构的子集机构，目的是为了装一个树形的机构菜单。
    private List<AgencyView> subAgency = new ArrayList<AgencyView>();
    
    
    
    public List<AgencyView> getSubAgency() {
        return subAgency;
    }
    public void setSubAgency(List<AgencyView> subAgency) {
        this.subAgency = subAgency;
    }
    public String getAgencyId() {
        return agencyId;
    }
    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }
    public String getAgencyCode() {
        return agencyCode;
    }
    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }
    public String getAgencyName() {
        return agencyName;
    }
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
    public String getParentId() {
        return parentId;
    }
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getCreateId() {
        return createId;
    }
    public void setCreateId(String createId) {
        this.createId = createId;
    }
    public String getCreateName() {
        return createName;
    }
    public void setCreateName(String createName) {
        this.createName = createName;
    }
    public Date getLastModifyTime() {
        return lastModifyTime;
    }
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
    public String getLastModifyId() {
        return lastModifyId;
    }
    public void setLastModifyId(String lastModifyId) {
        this.lastModifyId = lastModifyId;
    }
    public String getLastModuifyName() {
        return lastModuifyName;
    }
    public void setLastModuifyName(String lastModuifyName) {
        this.lastModuifyName = lastModuifyName;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getTelPhone() {
        return telPhone;
    }
    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    
}
