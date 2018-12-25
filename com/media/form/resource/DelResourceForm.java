package com.media.form.resource;


import java.util.Date;
import java.util.List;

import com.media.common.model.resource.Resource;
/**
 * Created by lihaiqiang on 2018/08/14.
 */
public class DelResourceForm {
    private Date lastModifyTime;
    private String lastModifyUserId;
    private List<Resource> resourceList;

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

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    @Override
    public String toString() {
        return "DelResourceForm{" +
                "lastModifyTime=" + lastModifyTime +
                ", lastModifyUserId='" + lastModifyUserId + '\'' +
                ", resourceList=" + resourceList +
                '}';
    }
}
