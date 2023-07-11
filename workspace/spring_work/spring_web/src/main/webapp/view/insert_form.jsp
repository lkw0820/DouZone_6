<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color:#ff0000;
	}
</style>
</head>
<body>
	<h3>글쓰기</h3>
	<hr>
	<form:form action="board_insert" method="post" commandName="boardCommand">
		작성자:<form:input type="text" path="writer"/>
				<form:errors path="writer" cssClass="error"/><br>
		제목:<form:input type="text" path="title"/>
				<form:errors path="title" cssClass="error"/><br>
		내용: <br>
		<textarea rows="6" cols="70" name="contents"></textarea>
		<br>
		<input type="submit" value="등록">
	</form:form>
</body>
</html>