<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>converter</head>
<body>
<h1></h1>
<s:form action="/converter2.action" method="post">
<s:textfield name="name" label="名字"/>
<s:textfield name="age" label="年龄" value=""/>
<s:submit value="注册"></s:submit>
</s:form>
</body>
</html>