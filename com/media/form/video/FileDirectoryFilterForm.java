package com.media.form.video;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

import io.swagger.annotations.ApiModel;

import java.util.Date;
/**
 * Created by lihaiqiang on 2018/11/16.
 */
@ApiModel(value = "FileDirectoryFilterForm", description = "目录筛选form")
public class FileDirectoryFilterForm extends BaseForm {

    private static final long serialVersionUID = 5804071415564569412L;

    private String keyWord;

    private Integer status;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;

    private Integer isEnum;//是否是枚举类型

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

    public Integer getIsEnum() {
        return isEnum;
    }

    public void setIsEnum(Integer isEnum) {
        this.isEnum = isEnum;
    }


    @Override
    public String toString() {
        return "FileDirectoryFilterForm{" +
                "keyWord='" + keyWord + '\'' +
                ", status=" + status +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", isEnum=" + isEnum +
                '}';
    }
}