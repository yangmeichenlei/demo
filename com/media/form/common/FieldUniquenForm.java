package com.media.form.common;

import com.media.common.enums.ResultEnum;
import com.media.common.utils.StringUtils;

import io.swagger.annotations.ApiModel;

/**
 * Created by lihaiqiang on 2018/11/07.
 */
@ApiModel(value = "FieldUniquenForm", description = "唯一性校验form")
public class FieldUniquenForm {

    private String tableName;//表名
    private String fieldStr;//字段名称字符（多个用逗号隔开）
    private String valStr;//字段值字符（多个用逗号隔开）
    private String idWhere;//where 条件限制
    private String code = ResultEnum.SUCCESS.getCode();//结果编码
    private String msg;//信息

    public FieldUniquenForm(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getFieldStr() {
        return fieldStr;
    }

    public void setFieldStr(String fieldStr) {
        this.fieldStr = fieldStr;
    }

    public String getValStr() {
        return valStr;
    }

    public void setValStr(String valStr) {
        this.valStr = valStr;
    }

    public String getIdWhere() {
        return idWhere;
    }

    public void setIdWhere(String idName, String id) {
        if (StringUtils.isNotBlank(idName) && StringUtils.isNotBlank(id)) {
            this.idWhere = " AND " + idName + " <> '" + id + "'";
        } else {
            this.idWhere = null;
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
