package com.media.common.enums;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public class EnumType {

    private Integer code;
    private String label;

    public EnumType(Integer code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public Integer getCode() {
        return code;
    }
}
