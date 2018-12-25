package com.media.form.video;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

public class AttributeValueForm extends BaseForm{
    private static final long serialVersionUID = 5804071415564369412L;

    private String keyWord;

    private Integer status;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;
    private String attributeId;
    private Integer isEnum;
    
    
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
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public String getAttributeId() {
        return attributeId;
    }
    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }
    
    public Integer getIsEnum() {
        return isEnum;
    }
    public void setIsEnum(Integer isEnum) {
        this.isEnum = isEnum;
    }
    @Override
    public String toString() {
        return "AttributeValueForm [keyWord=" + keyWord + ", status=" + status + ", startTime=" + startTime
                + ", endTime=" + endTime + ", attributeId=" + attributeId + ", isEnum=" + isEnum + "]";
    }

    
}
