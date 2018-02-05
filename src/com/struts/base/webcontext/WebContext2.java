package com.struts.base.webcontext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class WebContext2 extends ActionSupport {

	private HttpServletRequest request;
	private ServletContext application;
	private HttpSession session;

	public WebContext2() {
		request = ServletActionContext.getRequest();
		session = request.getSession();
		application = session.getServletContext();
	}

	@Override
	public String execute() throws Exception {
		request.setAttribute("r1", "r1");
		application.setAttribute("a1", "a1");
		session.setAttribute("s1", "s1");
		return SUCCESS;
	}
}
