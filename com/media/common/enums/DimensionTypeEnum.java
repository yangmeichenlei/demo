package com.media.common.enums;

public enum DimensionTypeEnum {
    FOR_VALUE("值", 1),
    FOR_RANGE("范围", 0);

    private String msg;
    private Integer code;

    private DimensionTypeEnum(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
