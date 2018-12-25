package com.media.common.view;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public class SelectTreeResultView  implements Serializable {

    private static final long serialVersionUID = -1397607791664085221L;
    private String id;//id
    private String pId;//父级id
    private String name;//显示名称
    private Boolean isParent = Boolean.TRUE;//是否父节点
    private Integer isEnable;//是否可选
    private Integer isSelect;//是否选中
    private List<SelectTreeResultView> childSelectTreeList;//下级节点

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public Integer getIsSelect() {
        return isSelect;
    }

    public void setIsSelect(Integer isSelect) {
        this.isSelect = isSelect;
    }

    public List<SelectTreeResultView> getChildSelectTreeList() {
        return childSelectTreeList;
    }

    public void setChildSelectTreeList(List<SelectTreeResultView> childSelectTreeList) {
        this.childSelectTreeList = childSelectTreeList;
    }
}
