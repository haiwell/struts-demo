package com.struts.base.hello;

public class LoginAction {
	
	private String name="";
	public String execute(){
		name="wanghai";
		return "success";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
