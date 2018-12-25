package com.media.form.stuff;

import java.util.List;

import com.media.common.base.BaseForm;

public class ExamineActivityForm extends BaseForm {
    List<String> examineList;
    private int auditStatus;
    
    public List<String> getExamineList() {
        return examineList;
    }

    public void setExamineList(List<String> examineList) {
        this.examineList = examineList;
    }

	public int getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(int auditStatus) {
		this.auditStatus = auditStatus;
	}
    
}
