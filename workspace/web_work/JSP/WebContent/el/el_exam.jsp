<%@page import="kosa.model.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("name", "kosa");

	Person p = new Person("이기원");
	request.setAttribute("person", p);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="jstl_exam2.jsp">
		<jsp:param value="apple" name="fruit"/>
	</jsp:forward>
</body>
</html>