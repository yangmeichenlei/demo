package com.media.form.common;

import io.swagger.annotations.ApiModel;

import java.util.List;

import com.media.common.enums.CodeEnum;

/**
 * Created by lihaiqiang on 2018/01/17.
 */
@ApiModel(value = "DeleteFrom", description = "删除form")
public class DeleteFrom {

    private List<String> deleteList;//需要删除id串
    private Integer byStatus = CodeEnum.YES.getCode();//是否做状态删除

    public List<String> getDeleteList() {
        return deleteList;
    }

    public void setDeleteList(List<String> deleteList) {
        this.deleteList = deleteList;
    }

    public Integer getByStatus() {
        return byStatus;
    }

    public void setByStatus(Integer byStatus) {
        this.byStatus = byStatus;
    }

    @Override
    public String toString() {
        return "DeleteFrom{" +
                "deleteList=" + deleteList +
                ", byStatus=" + byStatus +
                '}';
    }
}
