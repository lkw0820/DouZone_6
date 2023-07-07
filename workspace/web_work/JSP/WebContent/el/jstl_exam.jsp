<%@page import="kosa.model.Person"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String hello="hello";
%>

<c:set var="msg" value="hello2"/>
<c:out value="${msg}"/>

<!-- forEach -->
<ul> 
<!-- 반복횟수가 있을때 -->
<c:forEach var="i" begin="1" end="9">
	<li>4*${i }= ${4*i }</li>
</c:forEach>
</ul>

<%
	List<Person> list = new ArrayList<Person>();
	list.add(new Person("이기원"));
	list.add(new Person("이기원2"));
	list.add(new Person("이기원3"));
	//이거를 해줘야함 ${}는 key 값을 가져오기때문에 list에 키값을 넣어준다
	request.setAttribute("list", list);
%>
<table border="1">
	<tr>
		<td>이름</td>
	</tr>
	<!-- items는 리스트를 받는다 -->
	<!-- var에는 리스트안의 값 여기서는 person 객체 -->
	<c:forEach var="p" items="${list }">
		<tr>
			<td>${p.name }</td>
		</tr>
	</c:forEach>

	
</table>
</body>
</html>