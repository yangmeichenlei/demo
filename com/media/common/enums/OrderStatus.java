package com.media.common.enums;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public enum OrderStatus {

    CANCEL("已取消", 0),
    WAIT_PAY("待付款", 1),
    WAIT_DELIVERY("待发货",2 ),
    WAIT_RECEIVE("待收货",3),
    WAIT_COMMENT("待评价", 4),
    BACK("已退货", 5),
    COMPLETED("已完成", 6),
    DELTETED("已删除", 7);

    private String msg ;
    private Integer code ;

    private OrderStatus(String msg , Integer code ){
        this.msg = msg ;
        this.code = code ;
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
