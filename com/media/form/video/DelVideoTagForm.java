package com.media.form.video;

import java.util.List;

public class DelVideoTagForm {

	private List<String> tagList;
	private int delStatus;//删除状态（1：按状态删除；0：物理删除）
	
	
	public List<String> getTagList() {
		return tagList;
	}
	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}
	public int getDelStatus() {
		return delStatus;
	}
	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}
	@Override
	public String toString() {
		return "DelVideoTagForm [tagList=" + tagList + ", delStatus=" + delStatus + "]";
	}
	
}
