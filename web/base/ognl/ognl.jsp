<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>对象图导航语言</title>
</head>
<body>
	普通对象属性<s:property value="user" />
	<br />
	普通对象属性<s:property value="user.age" />
	<br />
	属性的方法<s:property value="password.length()" />
	<br />
	对象的方法<s:property value="user.shuohua()" />
	<br />
	<h1>---------------------------------------------------</h1>
	静态属性<s:property value="@com.struts.base.entity.User@name" />
	<br />
	静态方法<s:property value="@com.struts.base.entity.User@getName()" />
	<s:debug>
	</s:debug>
</body>
</html>