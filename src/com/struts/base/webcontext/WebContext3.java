package com.struts.base.webcontext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author haiwell
 *
 */
public class WebContext3 extends ActionSupport implements ServletRequestAware {

	private HttpServletRequest request;
	private ServletContext application;
	private HttpSession session;

	@Override
	public String execute() throws Exception {
		request.setAttribute("r1", "r1");
		application.setAttribute("a1", "a1");
		session.setAttribute("s1", "s1");
		return SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		session = request.getSession();
		application = session.getServletContext();
	}
}
