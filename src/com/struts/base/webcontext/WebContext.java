package com.struts.base.webcontext;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class WebContext extends ActionSupport {
	
	private Map request;
	private Map application;
	private Map session;
	
	public WebContext() {
		ActionContext actionContext = ActionContext.getContext();
		request = (Map) actionContext.get("request");
		application = actionContext.getApplication();
		session = actionContext.getSession();
	}
	
	@Override
	public String execute() throws Exception {
		request.put("r1", "s1");
		application.put("a1", "a1");
		session.put("s1", "s1");
		return SUCCESS;
	}
}
