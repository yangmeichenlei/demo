package com.media.common.view.video;

public class ChooseAttrValueView {

	private String pkVideoAttributeRefId;
	private String pkVideoId;
	private String pkVideoAttributeId;
	private String pkVideoAttributeValue;
	private String attributeValue;
	private String videoAttrNameEn;
	
	public String getPkVideoAttributeRefId() {
		return pkVideoAttributeRefId;
	}
	public void setPkVideoAttributeRefId(String pkVideoAttributeRefId) {
		this.pkVideoAttributeRefId = pkVideoAttributeRefId;
	}
	public String getVideoAttrNameEn() {
		return videoAttrNameEn;
	}
	public void setVideoAttrNameEn(String videoAttrNameEn) {
		this.videoAttrNameEn = videoAttrNameEn;
	}
	public String getPkVideoId() {
		return pkVideoId;
	}
	public void setPkVideoId(String pkVideoId) {
		this.pkVideoId = pkVideoId;
	}
	public String getPkVideoAttributeId() {
		return pkVideoAttributeId;
	}
	public void setPkVideoAttributeId(String pkVideoAttributeId) {
		this.pkVideoAttributeId = pkVideoAttributeId;
	}
	public String getPkVideoAttributeValue() {
		return pkVideoAttributeValue;
	}
	public void setPkVideoAttributeValue(String pkVideoAttributeValue) {
		this.pkVideoAttributeValue = pkVideoAttributeValue;
	}
	public String getAttributeValue() {
		return attributeValue;
	}
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	@Override
	public String toString() {
		return "ChooseAttrValueView [pkVideoId=" + pkVideoId + ", pkVideoAttributeId=" + pkVideoAttributeId
				+ ", pkVideoAttributeValue=" + pkVideoAttributeValue + ", attributeValue=" + attributeValue
				+ ", videoAttrNameEn=" + videoAttrNameEn + "]";
	}

}
