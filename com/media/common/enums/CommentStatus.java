package com.media.common.enums;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public enum CommentStatus {
    NO_COMMENT(null, "待评论"),
    COMMENTED(1, "已评论"),
    ADD_COMMENTED(2, "已追评");

    private Integer statusCode;//评论状态
    private String statusName;//评论名称

    private CommentStatus(Integer statusCode, String statusName) {
        this.statusCode = statusCode;
        this.statusName = statusName;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getStatusName() {
        return statusName;
    }
}
