package com.media.form.user;


import java.util.List;

/**
 * Created by BiBo on 2018/1/18.
 */
public class UserRoleForm {
    List<String> userList;
    List<String> roleList;
    

    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public List<String> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<String> roleList) {
        this.roleList = roleList;
    }

    @Override
    public String toString() {
        return "UserRoleForm{" +
                "userList=" + userList +
                ", roleList=" + roleList +
                '}';
    }
}
