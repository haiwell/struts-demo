package com.struts.base.hello;

import freemarker.template.utility.Execute;

public class TestHtmlAction {
	private String username="";
	public String execute(){
		username="wanghai";
		return "success";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
