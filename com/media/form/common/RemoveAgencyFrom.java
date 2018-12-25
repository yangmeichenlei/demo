package com.media.form.common;

import java.util.List;

public class RemoveAgencyFrom {

    private List<String> userList;
    private List<String> agencyList;
    public List<String> getUserList() {
        return userList;
    }
    public void setUserList(List<String> userList) {
        this.userList = userList;
    }
    public List<String> getAgencyList() {
        return agencyList;
    }
    public void setAgencyList(List<String> agencyList) {
        this.agencyList = agencyList;
    }
    @Override
    public String toString() {
        return "RemoveAgencyFrom [userList=" + userList + ", agencyList=" + agencyList + "]";
    }
    
}
