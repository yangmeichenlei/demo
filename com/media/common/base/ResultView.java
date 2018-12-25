package com.media.common.base;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public class ResultView {
    private String code ="0";
    private String msg="操作成功";
    private Object data;
    
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }
}
