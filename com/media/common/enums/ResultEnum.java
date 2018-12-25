package com.media.common.enums;

/**
 * Created by lihaiqinag on 2018/08/13.
 */
public enum ResultEnum {
    SUCCESS("成功", "0"),
    TIME_OUT("登录过期，请重新登录", "1"),
    FAIL("失败", "-1"),
    OTHER_LOGIN("用户在其他设备登录", "2");
    private String msg ;
    private String code ;

    private ResultEnum(String msg , String code ){
        this.msg = msg ;
        this.code = code ;
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
