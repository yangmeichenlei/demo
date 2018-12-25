package com.media.form.agency;

import java.util.List;

import com.media.common.view.role.RoleView;

public class AgencyRoleRefForm {

	private List<RoleView> addedList;
    private List<RoleView> ToBeAddList;
	public List<RoleView> getAddedList() {
		return addedList;
	}
	public void setAddedList(List<RoleView> addedList) {
		this.addedList = addedList;
	}
	public List<RoleView> getToBeAddList() {
		return ToBeAddList;
	}
	public void setToBeAddList(List<RoleView> toBeAddList) {
		ToBeAddList = toBeAddList;
	}
	@Override
	public String toString() {
		return "AgencyRoleRefForm [addedList=" + addedList + ", ToBeAddList=" + ToBeAddList + "]";
	}
    
}
