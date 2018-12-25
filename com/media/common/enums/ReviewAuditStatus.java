package com.media.common.enums;

/**
 * Created by zhaorong on 2018/11/05.
 */
public enum ReviewAuditStatus {

    DELETED("已删除", -1),
    FOR_AUDIT("待审核", 0),
    AUDIT_YES("审核通过", 1),
    AUDIT_NO("审核未通过", 2);

    private String AuditName; // 评论审核状态名称
    private Integer Auditcode; // 评论审核状态编码

    private ReviewAuditStatus(String AuditName, Integer Auditcode) {
        this.AuditName = AuditName;
        this.Auditcode = Auditcode;
    }

    public String getAuditName() {
        return AuditName;
    }

    public void setAuditName(String auditName) {
        AuditName = auditName;
    }

    public Integer getAuditcode() {
        return Auditcode;
    }

    public void setAuditcode(Integer auditcode) {
        Auditcode = auditcode;
    }

}
