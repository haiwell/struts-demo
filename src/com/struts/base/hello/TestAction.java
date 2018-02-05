package com.struts.base.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.base.model.User;

@Namespace("/wangh/test")
@ParentPackage("struts-default")
@Action(value = "mytest", results = { @Result(name = "success", location = "/base/convention/test.jsp") })
public class TestAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// List<User> users = new ArrayList<User>();
		// for (int i = 0; i < 3; i++) {
		// User user = new User();
		// user.setUserName("zhanghua" + i);
		// user.setPWD("pwd" + i);
		// users.add(user);
		// }
		//
		// // 获得response
		// HttpServletResponse response = ServletActionContext.getResponse();
		// response.setContentType("text/html");
		// PrintWriter pw = null;
		// try {
		// pw = response.getWriter();
		// pw.print(JSONArray.fromObject(users).toString());
		// return "success";
		// } catch (Throwable e) {
		// e.printStackTrace();
		// } finally {
		// if (pw != null) {
		// pw.close();
		// }
		// }
		return SUCCESS;
	}

	@Action(value = "outjson")
	public void outJSON() {
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < 3; i++) {
			User user = new User();
			user.setUserName("zhanghua" + i);
			user.setPWD("pwd" + i);
			users.add(user);
		}

		// 获得response
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html");
		PrintWriter pw = null;
		try {
			Gson gson = new Gson();
			pw = response.getWriter();
			pw.print(gson.toJson(users));
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}

}
