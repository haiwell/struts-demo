package com.struts.base.hello;



public class WelcomeAction {
	private String name;
	
	public String execute(){
		//System.out.println("name : "+name);
		if ("wanghai".equals(name.trim())) {
			return "fail";
		}
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
