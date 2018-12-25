package com.media.common.view.video;

public class AttrValueView {

    private String pkAttributeId;
    private String pkAttributeValueId;
    private String attrValueName;
    private String attrValueNo;
	public String getPkAttributeId() {
		return pkAttributeId;
	}
	public void setPkAttributeId(String pkAttributeId) {
		this.pkAttributeId = pkAttributeId;
	}
	public String getPkAttributeValueId() {
		return pkAttributeValueId;
	}
	public void setPkAttributeValueId(String pkAttributeValueId) {
		this.pkAttributeValueId = pkAttributeValueId;
	}
	public String getAttrValueName() {
		return attrValueName;
	}
	public void setAttrValueName(String attrValueName) {
		this.attrValueName = attrValueName;
	}
	public String getAttrValueNo() {
		return attrValueNo;
	}
	public void setAttrValueNo(String attrValueNo) {
		this.attrValueNo = attrValueNo;
	}
	@Override
	public String toString() {
		return "AttrValueView [pkAttributeId=" + pkAttributeId + ", pkAttributeValueId=" + pkAttributeValueId
				+ ", attrValueName=" + attrValueName + ", attrValueNo=" + attrValueNo + "]";
	}
    
}
