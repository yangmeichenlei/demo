package com.media.form.stuff;

import java.util.List;

import com.media.common.base.BaseForm;

public class DelActivityForm extends BaseForm{
    
    private List<String> deleteList;//需要删除id串

    public List<String> getDeleteList() {
        return deleteList;
    }

    public void setDeleteList(List<String> deleteList) {
        this.deleteList = deleteList;
    }


}
