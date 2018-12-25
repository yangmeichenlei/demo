package com.media.common.base;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public class BaseModel implements Serializable{

    private static final long serialVersionUID = 3744572037250481570L;
    // 创建时间
    private Date createTime;
    // 创建人ID
    private String createUserId;
    // 最后修改时间
    private Date lastModifyTime;
    // 最后修改人ID
    private String lastModifyUserId;
    //审核人ID
    private String auditUserId;
    //审核时间
    private Date auditTime;
    @CreatedDate
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @LastModifiedDate
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public String getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId;
    }
    @CreatedDate
    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}
