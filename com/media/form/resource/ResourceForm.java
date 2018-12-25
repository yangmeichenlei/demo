package com.media.form.resource;

import java.util.Date;

import com.media.common.base.BaseForm;

/**
 * Created by lihaiqiang on 2018/08/14.
 */
public class ResourceForm extends BaseForm{
  
	private static final long serialVersionUID = 7744698682900595431L;

	private String resourceId;

    private String resourceName;

    private String url;

    private Integer seq;

    private String parentId;

    private Integer status;

    private Integer isParent;

    private Date createTime;

    private String createUserId;

    private Date lastModifyTime;

    private String lastModifyUserId;

    private Integer resourceType;

    private String roleResourceId;

    private String userId;

    private String roleId;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
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

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public String getRoleResourceId() {
        return roleResourceId;
    }

    public void setRoleResourceId(String roleResourceId) {
        this.roleResourceId = roleResourceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "ResourceForm{" +
                "resourceId='" + resourceId + '\'' +
                ", resourceName='" + resourceName + '\'' +
                ", url='" + url + '\'' +
                ", seq=" + seq +
                ", parentId='" + parentId + '\'' +
                ", status=" + status +
                ", isParent=" + isParent +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", lastModifyTime=" + lastModifyTime +
                ", lastModifyUserId='" + lastModifyUserId + '\'' +
                ", resourceType=" + resourceType +
                ", roleResourceId='" + roleResourceId + '\'' +
                ", userId='" + userId + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}
