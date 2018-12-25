package com.media.form.goods;

import java.util.Date;

public class GoodsClassForm {

    private String classId;

    private String classCode;

    private String className;

    private String parentClassId;

    private Integer classLevel;

    private Integer classNo;

    private String layerClassCode;

    private String classDesc;

    private Integer endNode;

    private Integer status;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getParentClassId() {
        return parentClassId;
    }

    public void setParentClassId(String parentClassId) {
        this.parentClassId = parentClassId;
    }

    public Integer getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(Integer classLevel) {
        this.classLevel = classLevel;
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    public String getLayerClassCode() {
        return layerClassCode;
    }

    public void setLayerClassCode(String layerClassCode) {
        this.layerClassCode = layerClassCode;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public Integer getEndNode() {
        return endNode;
    }

    public void setEndNode(Integer endNode) {
        this.endNode = endNode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GoodsClassForm [classId=" + classId + ", classCode=" + classCode + ", className=" + className
                + ", parentClassId=" + parentClassId + ", classLevel=" + classLevel + ", classNo=" + classNo
                + ", layerClassCode=" + layerClassCode + ", classDesc=" + classDesc + ", endNode=" + endNode
                + ", status=" + status + "]";
    }

}
