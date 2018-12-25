package com.media.common.view.video;

import java.util.List;

public class VideoSeriesView {

	private String pkVideoClassId;
	private String videoClassName;
	private String videoClassCode;
	private String parentVideoClassId;

    private Integer videoClassNo;
    
    private String videoLayerClassCode;

    private String videoClassDesc;
    private List<VideoView> videoViewList;
	public String getPkVideoClassId() {
		return pkVideoClassId;
	}
	public void setPkVideoClassId(String pkVideoClassId) {
		this.pkVideoClassId = pkVideoClassId;
	}
	public String getVideoClassName() {
		return videoClassName;
	}
	public void setVideoClassName(String videoClassName) {
		this.videoClassName = videoClassName;
	}
	public String getVideoClassCode() {
		return videoClassCode;
	}
	public void setVideoClassCode(String videoClassCode) {
		this.videoClassCode = videoClassCode;
	}
	public String getParentVideoClassId() {
		return parentVideoClassId;
	}
	public void setParentVideoClassId(String parentVideoClassId) {
		this.parentVideoClassId = parentVideoClassId;
	}
	public Integer getVideoClassNo() {
		return videoClassNo;
	}
	public void setVideoClassNo(Integer videoClassNo) {
		this.videoClassNo = videoClassNo;
	}
	public String getVideoLayerClassCode() {
		return videoLayerClassCode;
	}
	public void setVideoLayerClassCode(String videoLayerClassCode) {
		this.videoLayerClassCode = videoLayerClassCode;
	}
	public String getVideoClassDesc() {
		return videoClassDesc;
	}
	public void setVideoClassDesc(String videoClassDesc) {
		this.videoClassDesc = videoClassDesc;
	}
	public List<VideoView> getVideoViewList() {
		return videoViewList;
	}
	public void setVideoViewList(List<VideoView> videoViewList) {
		this.videoViewList = videoViewList;
	}
    
}
