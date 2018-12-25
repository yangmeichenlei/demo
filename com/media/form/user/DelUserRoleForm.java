package com.media.form.user;

import java.util.List;

/**
 * Created by BiBo on 2018/1/22.
 */
public class DelUserRoleForm {
    List<String> userRoleIds;

    public List<String> getUserRoleIds() {
        return userRoleIds;
    }

    public void setUserRoleIds(List<String> userRoleIds) {
        this.userRoleIds = userRoleIds;
    }

    @Override
    public String toString() {
        return "DelUserRoleForm{" +
                "userRoleIds=" + userRoleIds +
                '}';
    }
}
