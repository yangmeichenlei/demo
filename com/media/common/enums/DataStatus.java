package com.media.common.enums;

public enum DataStatus {
    DATA_NO("未显示", 0), DATA_YRS("已显示", 1);

    private String dataStatusName; // 数据状态名称
    private Integer dataStatusCode; // 数据状态编码

    private DataStatus(String dataStatusName, Integer dataStatusCode) {
        this.dataStatusName = dataStatusName;
        this.dataStatusCode = dataStatusCode;
    }

    public String getDataStatusName() {
        return dataStatusName;
    }

    public void setDataStatusName(String dataStatusName) {
        this.dataStatusName = dataStatusName;
    }

    public Integer getDataStatusCode() {
        return dataStatusCode;
    }

    public void setDataStatusCode(Integer dataStatusCode) {
        this.dataStatusCode = dataStatusCode;
    }

}
