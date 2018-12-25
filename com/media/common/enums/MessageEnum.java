package com.media.common.enums;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public enum MessageEnum {
    UN_READE("未读", 1),
    READE("已读", 2),
    DELTED("删除",3),
    ORDER_MSG("订单消息", 1),
    COMMENT_MSG("评论消息", 2),
    SYSTEM_MSG("系统消息", 3),
    ORTHER_MSG("其他消息", 4);
    private String msg ;
    private Integer code ;
    private MessageEnum(String msg , Integer code ){
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
