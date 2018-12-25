package com.media.form.video;

import io.swagger.annotations.ApiModel;

import java.util.List;
/**
 * Created by lihaiqinag on 2018/11/05.
 */
@ApiModel(value = "VideoImageAuditForm", description = "视频图片审核form")
public class VideoImageAuditForm {
    private List<String> auditList;//审核数据集合
    private Integer auditResult;//审核结果
    private String auditOpinion;//审核意见
    private Integer imgType;

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

    public Integer getImgType() {
        return imgType;
    }

    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    @Override
    public String toString() {
        return "VideoImageAuditForm{" +
                "auditList=" + auditList +
                ", auditResult=" + auditResult +
                ", auditOpinion='" + auditOpinion + '\'' +
                ", imgType=" + imgType +
                '}';
    }
}