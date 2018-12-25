package com.media.form.video;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

import io.swagger.annotations.ApiModel;

import java.util.Date;
/**
 * Created by lihaiqiang on 2018/11/06.
 */
@ApiModel(value = "VideoFilterForm", description = "视频筛选form")
public class VideoFilterForm extends BaseForm {

    private static final long serialVersionUID = 970536763074058439L;

    private String keyWord;
    
    private Integer videoType;

    private Integer status;
    
    private String otherCondition;//其他查询条件

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;
    
    private String videoImgPath;

    
    public String getVideoImgPath() {
		return videoImgPath;
	}

	public void setVideoImgPath(String videoImgPath) {
		this.videoImgPath = videoImgPath;
	}

	public String getOtherCondition() {
return otherCondition;
}

public void setOtherCondition(String otherCondition) {
this.otherCondition = otherCondition;
}

public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public Integer getVideoType() {
        return videoType;
    }

    public void setVideoType(Integer videoType) {
        this.videoType = videoType;
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
        return "VideoFilterForm [keyWord=" + keyWord + ", videoType=" + videoType + ", status=" + status
                + ", startTime=" + startTime + ", endTime=" + endTime + "]";
    }


}