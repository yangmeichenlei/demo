package com.media.common.view.user;

import java.util.List;

import com.media.common.view.role.RoleView;

/**
 * Created by BiBo on 2018/2/9.
 */
public class UserRolesView {
    private List<RoleView> addedList;
    private List<RoleView> ToBeAddList;
    private List<RoleView> agencyRoleList;

    public List<RoleView> getAgencyRoleList() {
        return agencyRoleList;
    }

    public void setAgencyRoleList(List<RoleView> agencyRoleList) {
        this.agencyRoleList = agencyRoleList;
    }

    public List<RoleView> getAddedList() {
        return addedList;
    }

    public void setAddedList(List<RoleView> addedList) {
        this.addedList = addedList;
    }

    public List<RoleView> getToBeAddList() {
        return ToBeAddList;
    }

    public void setToBeAddList(List<RoleView> toBeAddList) {
        ToBeAddList = toBeAddList;
    }

    @Override
    public String toString() {
        return "UserRolesView [addedList=" + addedList + ", ToBeAddList=" + ToBeAddList + ", agencyRoleList="
                + agencyRoleList + "]";
    }
    
}
