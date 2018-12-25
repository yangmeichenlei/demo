package com.media.common.enums;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public enum PayEnum {
    JSON("JSON", "json"),
    XML("XML", "xml"),
    WEIXIN("微信扫码API支付", "02"),
    ALIPAY("支付宝扫码API支付", "07");
    private String msg ;
    private String code ;

    private PayEnum(String msg , String code ){
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
