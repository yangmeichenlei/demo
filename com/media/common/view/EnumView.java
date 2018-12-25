package com.media.common.view;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
@ApiModel(value = "EnumView", description = "枚举类型视图")
public class EnumView implements Serializable {

    private static final long serialVersionUID = -4612179013151236993L;
    private Object code;//编码
    private String name;//名称

    public EnumView(Object code, String name) {
        this.code = code;
        this.name = name;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EnumView{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
