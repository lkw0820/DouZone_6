<%@page import="kosa.model.RegisterDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="register" class="kosa.model.Register"></jsp:useBean>
<jsp:setProperty property="*" name="register"/>
    
<%
	RegisterDao dao=RegisterDao.getInstance();
	dao.insertRegister(register);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>