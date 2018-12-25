package com.media.form.stuff;

import java.util.Date;
import java.util.List;

import com.media.common.base.BaseForm;

public class StatusUpdateForm extends BaseForm{
    private List<String> StatusUpdateList;//需要修改状态的id串

    public List<String> getStatusUpdateList() {
        return StatusUpdateList;
    }

    public void setStatusUpdateList(List<String> statusUpdateList) {
        StatusUpdateList = statusUpdateList;
    }
    
}
