package com.media.form.reportform;

import java.util.List;

import com.media.common.model.reportform.StuffVO;

public class StuffVOForm {
    List<StuffVO> list;

    public List<StuffVO> getList() {
        return list;
    }

    public void setList(List<StuffVO> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "StuffVOForm [list=" + list + "]";
    }
    
}
