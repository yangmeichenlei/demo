package com.media.form.stuff;

import java.util.List;

/**
 * Created by zhaorong on 2018/11/14.
 */
public class ActivityARuleForm {
    List<String> activityList;
    List<String> aRuleList;

    public List<String> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<String> activityList) {
        this.activityList = activityList;
    }

    public List<String> getaRuleList() {
        return aRuleList;
    }

    public void setaRuleList(List<String> aRuleList) {
        this.aRuleList = aRuleList;
    }

    @Override
    public String toString() {
        return "ActivityARuleForm [activityList=" + activityList + ", aRuleList=" + aRuleList + "]";
    }

}
