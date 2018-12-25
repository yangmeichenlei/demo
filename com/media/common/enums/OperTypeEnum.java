package com.media.common.enums;

public enum OperTypeEnum {

    DEKETE("删除","1"),
    INSERT("新增","2"),
    MODIFY("修改","3");
    private String typeName;//操作名称
    private String typeCode;//操作编码
    private OperTypeEnum(String typeName, String typeCode) {
        this.typeName = typeName;
        this.typeCode = typeCode;
    }
    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public String getTypeCode() {
        return typeCode;
    }
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
    
}
