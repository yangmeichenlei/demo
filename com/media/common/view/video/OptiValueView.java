package com.media.common.view.video;

public class OptiValueView {

    private String pkVideoAttrOptionId;
    private String optionName;
    private String pkAttrId;
    private Integer optionNo;
    private Integer status;
    public String getPkVideoAttrOptionId() {
        return pkVideoAttrOptionId;
    }
    public void setPkVideoAttrOptionId(String pkVideoAttrOptionId) {
        this.pkVideoAttrOptionId = pkVideoAttrOptionId;
    }
    public String getOptionName() {
        return optionName;
    }
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
    public String getPkAttrId() {
        return pkAttrId;
    }
    public void setPkAttrId(String pkAttrId) {
        this.pkAttrId = pkAttrId;
    }
    public Integer getOptionNo() {
        return optionNo;
    }
    public void setOptionNo(Integer optionNo) {
        this.optionNo = optionNo;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "OptiValueView [pkVideoAttrOptionId=" + pkVideoAttrOptionId + ", optionName=" + optionName
                + ", pkAttrId=" + pkAttrId + ", optionNo=" + optionNo + ", status=" + status + "]";
    }
    
}
