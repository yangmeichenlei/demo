package com.media.form.common;

import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * Created by lihaiqiang on 2018/11/01.
 */
@ApiModel(value = "AuditForm", description = "审核form")
public class AuditForm {
    private List<String> auditList;//审核数据集合
    private Integer auditResult;//审核结果
    private String auditOpinion;//审核意见

    public List<String> getAuditList() {
        return auditList;
    }

    public void setAuditList(List<String> auditList) {
        this.auditList = auditList;
    }

    public Integer getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(Integer auditResult) {
        this.auditResult = auditResult;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    @Override
    public String toString() {
        return "AuditForm{" +
                "auditList=" + auditList +
                ", auditResult=" + auditResult +
                ", auditOpinion='" + auditOpinion + '\'' +
                '}';
    }
}
