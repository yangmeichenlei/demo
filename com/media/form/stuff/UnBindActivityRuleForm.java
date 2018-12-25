package com.media.form.stuff;

import java.util.List;

import com.media.common.base.BaseForm;

public class UnBindActivityRuleForm extends BaseForm {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> UnbindActivityIdsList;

    public List<String> getUnbindActivityIdsList() {
        return UnbindActivityIdsList;
    }

    public void setUnbindActivityIdsList(List<String> unbindActivityIdsList) {
        UnbindActivityIdsList = unbindActivityIdsList;
    }

    
}
