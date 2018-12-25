package com.media.common.model.address;

import com.media.common.base.BaseModel;

/**
 * Created by lihaiqiang on 2018/12/14.
 */
public class AreaxInfo extends BaseModel{

    private static final long serialVersionUID = 3857710509580199166L;

    private Integer mId;

    private String id;

    private String name;

    private String parentId;

    private Integer status;

    private Integer isDefault;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
}
