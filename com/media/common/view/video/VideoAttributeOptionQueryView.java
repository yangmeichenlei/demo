package com.media.common.view.video;

import io.swagger.annotations.ApiModel;

/**
 * Created by lihaiqiang on 2018/11/01.
 */
@ApiModel(value = "VideoAttributeOptionQueryView", description = "视频属性可选项视图")
public class VideoAttributeOptionQueryView {

    private String pkVideoAttributeOptionId;//可选项Id
    private String optionName;//可选项名称
    private Integer isSelect;//是否选中



    public String getPkVideoAttributeOptionId() {
        return pkVideoAttributeOptionId;
    }

    public void setPkVideoAttributeOptionId(String pkVideoAttributeOptionId) {
        this.pkVideoAttributeOptionId = pkVideoAttributeOptionId;
    }

    public String getOptionName() {
        return optionName;
    }
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public Integer getIsSelect() {
        return isSelect;
    }

    public void setIsSelect(Integer isSelect) {
        this.isSelect = isSelect;
    }

    @Override
    public String toString() {
        return "VideoAttributeOptionView{" +
                "pkVideoAttributeOptionId='" + pkVideoAttributeOptionId + '\'' +
                ", optionName='" + optionName + '\'' +
                ", isSelect=" + isSelect +
                '}';
    }
}
