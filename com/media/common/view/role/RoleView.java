package com.media.common.view.role;

import java.util.Date;

/**
 * Created by lihaiqiang on 2018/08/11.
 */
public class RoleView {
    private String roleId;

    private String roleName;

    private String roleDesc;

    private Integer status;

    private Date createTime;

    private String createUserId;
    
    private Date lastModifyTime;

    private String lastModifyUserId;

    private String userRoleId;
    
    private String agencyId;


    public String getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}

	public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public String getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(String userRoleId) {
        this.userRoleId = userRoleId;
    }

	@Override
	public String toString() {
		return "RoleView [roleId=" + roleId + ", roleName=" + roleName + ", roleDesc=" + roleDesc + ", status=" + status
				+ ", createTime=" + createTime + ", createUserId=" + createUserId + ", lastModifyTime=" + lastModifyTime
				+ ", lastModifyUserId=" + lastModifyUserId + ", userRoleId=" + userRoleId + ", agencyId=" + agencyId
				+ "]";
	}

	
}
