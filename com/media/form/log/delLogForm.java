package com.media.form.log;

import java.util.List;

public class delLogForm {

    private Integer delStatus;
    private List<String> logList;
    public Integer getDelStatus() {
        return delStatus;
    }
    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }
    public List<String> getLogList() {
        return logList;
    }
    public void setLogList(List<String> logList) {
        this.logList = logList;
    }
    @Override
    public String toString() {
        return "delLogForm [delStatus=" + delStatus + ", logList=" + logList + "]";
    }
    
}
