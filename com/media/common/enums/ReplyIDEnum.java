package com.media.common.enums;

/**
 * Created by zhaorong on 2018/11/05.
 */
public enum ReplyIDEnum {
    ORDINARY_REPLY("普通会员回复", 0),
    ADMIN_REPLY("管理员回复", 1);

    private String ReplyName;// 回复身份类型名称
    private Integer ReplyCode; // 回复身份类型编码

    private ReplyIDEnum(String replyName, Integer replyCode) {
        ReplyName = replyName;
        ReplyCode = replyCode;
    }

    public String getReplyName() {
        return ReplyName;
    }

    public void setReplyName(String replyName) {
        ReplyName = replyName;
    }

    public Integer getReplyCode() {
        return ReplyCode;
    }

    public void setReplyCode(Integer replyCode) {
        ReplyCode = replyCode;
    }

}
