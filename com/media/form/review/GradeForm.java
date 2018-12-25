package com.media.form.review;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

public class GradeForm extends BaseForm {
	private static final long serialVersionUID = 1L;
	private String pkGradeId;
    private String videoId;
    private String stuffId;
    private Integer gradeValue;
    private Date gradeTime;
    private Double gradeAverageValue;
    private String memo;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;
    private String videoNameCh;
    private String stuffName;
    
	public String getVideoNameCh() {
		return videoNameCh;
	}
	public void setVideoNameCh(String videoNameCh) {
		this.videoNameCh = videoNameCh;
	}
	public String getStuffName() {
		return stuffName;
	}
	public void setStuffName(String stuffName) {
		this.stuffName = stuffName;
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
	public String getPkGradeId() {
        return pkGradeId;
    }
    public void setPkGradeId(String pkGradeId) {
        this.pkGradeId = pkGradeId == null ? null : pkGradeId.trim();
    }
    public String getVideoId() {
        return videoId;
    }
    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }
    public String getStuffId() {
        return stuffId;
    }
    public void setStuffId(String stuffId) {
        this.stuffId = stuffId == null ? null : stuffId.trim();
    }
    public Integer getGradeValue() {
        return gradeValue;
    }
    public void setGradeValue(Integer gradeValue) {
        this.gradeValue = gradeValue;
    }
    public Date getGradeTime() {
        return gradeTime;
    }
    public void setGradeTime(Date gradeTime) {
        this.gradeTime = gradeTime;
    }
    public Double getGradeAverageValue() {
        return gradeAverageValue;
    }
    public void setGradeAverageValue(Double gradeAverageValue) {
        this.gradeAverageValue = gradeAverageValue;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}
