package com.media.form.video;

import io.swagger.annotations.ApiModel;

import java.util.List;
/**
 * Created by lihaiqinag on 2018/11/05.
 */
@ApiModel(value = "VideoImageDeleteForm", description = "视频图片删除form")
public class VideoImageDeleteForm {
    private List<String> deleteList;//需要删除id串
    private Integer imgType;//1:电影图片 2：电视图片 3：其他
    private Integer deleteType;//0:所有图片,1:审核中图片，2：当前展示中的图片，3：已失效的图片

    public List<String> getDeleteList() {
        return deleteList;
    }

    public void setDeleteList(List<String> deleteList) {
        this.deleteList = deleteList;
    }

    public Integer getImgType() {
        return imgType;
    }

    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    public Integer getDeleteType() {
        return deleteType;
    }

    public void setDeleteType(Integer deleteType) {
        this.deleteType = deleteType;
    }

    @Override
    public String toString() {
        return "VideoImageDeleteForm{" +
                "deleteList=" + deleteList +
                ", imgType=" + imgType +
                ", deleteType=" + deleteType +
                '}';
    }
}