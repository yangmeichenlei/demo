package com.media.form.agency;

import java.util.List;

import com.media.common.base.BaseForm;

public class AgencyRoleForm extends BaseForm{
    
    private String agencyId;
    private List<String> roleList;
    public String getAgencyId() {
        return agencyId;
    }
    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }
    public List<String> getRoleList() {
        return roleList;
    }
    public void setRoleList(List<String> roleList) {
        this.roleList = roleList;
    }
    @Override
    public String toString() {
        return "AgencyRoleForm [agencyId=" + agencyId + ", roleList=" + roleList + "]";
    }
    
}
