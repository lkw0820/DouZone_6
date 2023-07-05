<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>sum 페이지</h1>
	
	<%
		int total =0;
		for(int i=0;i<=10;i++){
			total+=i;
		}
		
	
	%>
	결과<br><%=total %>
	<h2>html footer</h2>
</body>
</html>