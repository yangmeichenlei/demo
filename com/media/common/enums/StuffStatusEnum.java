package com.media.common.enums;

public enum StuffStatusEnum {

    DELETED("已删除", -1),
    FROZEN("冻结", 0),
    NORMAL("正常", 1),
    ABNORMAL("异常", 2);
    private String Msg;
    private Integer code;

    private StuffStatusEnum(String msg, Integer code) {
        Msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
