package com.media.common.base;

import java.io.Serializable;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public class BaseForm implements Serializable{

    private static final long serialVersionUID = 3187744347898446490L;

    private Integer pageNum = 1;

    private Integer pageSize = 20;

    private String startDate;

    private String endDate;
    

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "BaseForm{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
