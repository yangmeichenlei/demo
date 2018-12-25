package com.media.common.model.goods;

import com.media.common.base.BaseModel;
import java.util.Date;

public class GoodsClass extends BaseModel {
   

	private static final long serialVersionUID = 1L;

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

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode == null ? null : classCode.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getParentClassId() {
        return parentClassId;
    }

    public void setParentClassId(String parentClassId) {
        this.parentClassId = parentClassId == null ? null : parentClassId.trim();
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
        this.layerClassCode = layerClassCode == null ? null : layerClassCode.trim();
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc == null ? null : classDesc.trim();
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
        this.createUserId = createUserId == null ? null : createUserId.trim();
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
        this.lastModifyUserId = lastModifyUserId == null ? null : lastModifyUserId.trim();
    }


    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

	@Override
	public String toString() {
		return "GoodsClass [classId=" + classId + ", classCode=" + classCode + ", className=" + className
				+ ", parentClassId=" + parentClassId + ", classLevel=" + classLevel + ", classNo=" + classNo
				+ ", layerClassCode=" + layerClassCode + ", classDesc=" + classDesc + ", endNode=" + endNode
				+ ", status=" + status + ", createUserId=" + createUserId + ", createTime=" + createTime
				+ ", lastModifyUserId=" + lastModifyUserId + ", lastModifyTime=" + lastModifyTime + "]";
	}
    
}