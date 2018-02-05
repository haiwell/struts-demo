package com.struts.base.validation;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private String sex;

	public String add() {
		if (sex == null || !"admin".equals(sex)) {
			this.addFieldError(sex, "input error!");
			this.addActionError("you are sb!");
			return ERROR;
		}
		return SUCCESS;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
