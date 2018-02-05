package com.struts.base.ognl;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.base.entity.User;

public class OgnlAction extends ActionSupport {

	private String username;

	private String password;

	private User user = new User(15);

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
