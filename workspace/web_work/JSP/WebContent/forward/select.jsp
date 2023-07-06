<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="control.jsp" method="post">
		보고싶은 페이지:
		<select name="page">
			<option value="a.jsp">a페이지</option>
			<option value="b.jsp">b페이지</option>
			<option value="c.jsp">c페이지</option>
		</select>
		<input type="submit" value="이동">
	</form>
</body>
</html>