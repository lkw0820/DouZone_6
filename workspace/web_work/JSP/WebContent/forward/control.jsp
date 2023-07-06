<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 경로를 dispatcher하는 역할 -->
<%
	String code = request.getParameter("page");
%>
<jsp:forward page="<%= code %>"></jsp:forward>