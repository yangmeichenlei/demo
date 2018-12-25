package com.media.form.video;

import java.util.List;

public class ModifyAttributeValueForm {

	private String pkVideoId;
	private String pkAttributeId;
	private List<String> pkAttributeValueIds;
	public String getPkVideoId() {
		return pkVideoId;
	}
	public void setPkVideoId(String pkVideoId) {
		this.pkVideoId = pkVideoId;
	}
	public String getPkAttributeId() {
		return pkAttributeId;
	}
	public void setPkAttributeId(String pkAttributeId) {
		this.pkAttributeId = pkAttributeId;
	}
	
	public List<String> getPkAttributeValueIds() {
		return pkAttributeValueIds;
	}
	public void setPkAttributeValueIds(List<String> pkAttributeValueIds) {
		this.pkAttributeValueIds = pkAttributeValueIds;
	}
	@Override
	public String toString() {
		return "ModifyAttributeValueForm [pkVideoId=" + pkVideoId + ", pkAttributeId=" + pkAttributeId
				+ ", pkAttributeValueIds=" + pkAttributeValueIds + "]";
	}
	
	
}
