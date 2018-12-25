package com.media.form.video;

import io.swagger.annotations.ApiModel;
/**
 * Created by lihaiqiang on 2018/11/06.
 */
@ApiModel(value = "AttributeOptionEditForm", description = "属性可选项编辑form")
public class AttributeOptionEditForm {
    private String pkVideoAttributeOptionId;

    private String optionName;

    private String pkAttributeId;

    private Integer optionNo;

   

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
        this.optionName = optionName == null ? null : optionName.trim();
    }


    public String getPkAttributeId() {
        return pkAttributeId;
    }

    public void setPkAttributeId(String pkAttributeId) {
        this.pkAttributeId = pkAttributeId;
    }

    public Integer getOptionNo() {
        return optionNo;
    }

    public void setOptionNo(Integer optionNo) {
        this.optionNo = optionNo;
    }

    @Override
    public String toString() {
        return "AttributeOptionEditForm{" +
                "pkVideoAttributeOptionId='" + pkVideoAttributeOptionId + '\'' +
                ", optionName='" + optionName + '\'' +
                ", pkAttributeId='" + pkAttributeId + '\'' +
                ", optionNo=" + optionNo +
                '}';
    }
}