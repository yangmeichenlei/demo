package com.media.form.role;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lihaiqiang on 2018/08/17.
 */
public class RoleResourceForm implements Serializable{
    private static final long serialVersionUID = -4852550271157848392L;
    private String roleId;
    private List<String> resourceIds;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    @Override
    public String toString() {
        return "RoleResourceForm{" +
                "roleId='" + roleId + '\'' +
                ", resourceIds=" + resourceIds +
                '}';
    }
}
