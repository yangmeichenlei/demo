package com.media.common.enums;

public enum StuffTypeEnum {

    GROUPSTUFF("集团会员", "1"), STUFF("普通会员", "0");
    private String msg;
    private String code;

    private StuffTypeEnum(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
