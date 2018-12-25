package com.media.form.video;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

import io.swagger.annotations.ApiModel;

import java.util.Date;
/**
 * Created by lihaiqiang on 2018/11/06.
 */
@ApiModel(value = "AttributeOptionFilterForm", description = "属性可选项筛选form")
public class VideoAttributeOptionFilterForm extends BaseForm {
    private static final long serialVersionUID = 4370512489744122366L;

    private String keyWord;

    private Integer status;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "AttributeDefFilterForm{" +
                "keyWord='" + keyWord + '\'' +
                ", status=" + status +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}