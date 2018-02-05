package com.struts.base.webcontext;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author haiwell
 *
 */
public class WebContext1 extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware {

	private Map<String, Object> request;
	private Map<String, Object> application;
	private Map<String, Object> session;

	/**
	 * DI dependency inject 依赖注入 IoC inverse of control 控制反转
	 */
	@Override
	public String execute() throws Exception {
		request.put("r1", "s1");
		application.put("a1", "a1");
		session.put("s1", "s1");
		return SUCCESS;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
}
