package com.media.common.view.Activity;

import java.util.List;

import com.media.common.view.ActivityRule.ARuleView;

/**
 * Created by zhaorong on 2018/11/12.
 */
public class ActivityRulesView {

    private List<ARuleView> bindedList;// 已经绑定的活动规则
    private List<ARuleView> toBeBindList;// 未绑定的活动规则

    public List<ARuleView> getBindedList() {
        return bindedList;
    }

    public void setBindedList(List<ARuleView> bindedList) {
        this.bindedList = bindedList;
    }

    public List<ARuleView> getToBeBindList() {
        return toBeBindList;
    }

    public void setToBeBindList(List<ARuleView> toBeBindList) {
        this.toBeBindList = toBeBindList;
    }

}
