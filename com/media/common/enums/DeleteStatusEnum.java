package com.media.common.enums;

public enum DeleteStatusEnum {
    FALSE_DELETED("状态删除", 1), // 假删
    TRUE_DELETED("物理删除", 0);// 真删
    private String Msg;
    private Integer code;

    private DeleteStatusEnum(String msg, Integer code) {
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
