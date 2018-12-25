package com.media.common.view.resource;

/**
 * Created by lihaiqiang on 2018/08/14.
 */
public class ResourceTreeView {
    private String id;
    private String name;
    private String url;
    private boolean isParent;
    private String pId;
    private boolean open;
    private boolean zAsync;
    private boolean isSelected;
    private Integer resourceType;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isParent() {
        return isParent;
    }

    public void setParent(boolean parent) {
        isParent = parent;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean iszAsync() {
        return zAsync;
    }

    public void setzAsync(boolean zAsync) {
        this.zAsync = zAsync;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }
}
