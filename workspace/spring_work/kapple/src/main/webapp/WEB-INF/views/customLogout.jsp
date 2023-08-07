<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	console.log("asd");
	$('#logout').submit();
})
</script>
<body>
<form action="/customLogout" method="post" id="logout">
	<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }"/>
	<button>로그아웃</button>
</form>
</body>
</html>