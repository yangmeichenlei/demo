package com.media.common.enums;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public enum ArticleAuditStatus {

    FOR_AUDIT("待审核", 0),
    AUDIT_YES("审核通过", 1),
    AUDIT_NO("审核不通过",-1);

    private String msg ;
    private Integer code ;

    private ArticleAuditStatus(String msg , Integer code ){
        this.msg = msg ;
        this.code = code ;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
