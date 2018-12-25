package com.media.common.view.goods;

import java.util.Date;

import com.media.common.model.user.User;

public class GoodsClassView {

	private static final long serialVersionUID = 1L;

	private String classId;

    private String classCode;

    private String className;

    private String parentClassId;
    
    private String parentClassName;

    private Integer classLevel;

    private Integer classNo;

    private String layerClassCode;

    private String classDesc;

    private Integer endNode;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;
    
    private String createName;
    
    private String lastModifyName;

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

	public String getParentClassName() {
		return parentClassName;
	}

	public void setParentClassName(String parentClassName) {
		this.parentClassName = parentClassName;
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

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getLastModifyUserId() {
		return lastModifyUserId;
	}

	public void setLastModifyUserId(String lastModifyUserId) {
		this.lastModifyUserId = lastModifyUserId;
	}

	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getLastModifyName() {
		return lastModifyName;
	}

	public void setLastModifyName(String lastModifyName) {
		this.lastModifyName = lastModifyName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "GoodsClassView [classId=" + classId + ", classCode=" + classCode + ", className=" + className
				+ ", parentClassId=" + parentClassId + ", parentClassName=" + parentClassName + ", classLevel="
				+ classLevel + ", classNo=" + classNo + ", layerClassCode=" + layerClassCode + ", classDesc="
				+ classDesc + ", endNode=" + endNode + ", status=" + status + ", createUserId=" + createUserId
				+ ", createTime=" + createTime + ", lastModifyUserId=" + lastModifyUserId + ", lastModifyTime="
				+ lastModifyTime + ", createName=" + createName + ", lastModifyName=" + lastModifyName + "]";
	}
    
}
