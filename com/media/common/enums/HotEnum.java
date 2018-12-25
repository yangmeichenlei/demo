package com.media.common.enums;

public enum HotEnum {
    HOT_NO("不设置为热评", 0),
    HOT_YES("设置为热评", 1);
    private String HotName; // 热评状态名称
    private Integer HotCode; // 热评状态编码

    private HotEnum(String hotName, Integer hotCode) {
        HotName = hotName;
        HotCode = hotCode;
    }

    public String getHotName() {
        return HotName;
    }

    public void setHotName(String hotName) {
        HotName = hotName;
    }

    public Integer getHotCode() {
        return HotCode;
    }

    public void setHotCode(Integer hotCode) {
        HotCode = hotCode;
    }

}
