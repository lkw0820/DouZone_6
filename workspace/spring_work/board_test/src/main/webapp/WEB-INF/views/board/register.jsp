<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function(){
		$("#list").on("click",function(){
			console.log("돌아가기");
			$('#form').attr("action","/board/list");
			$("#form").attr("method","GET").submit();
		})
		
		$('#register').on("click",function(){
			console.log("수정완료");
			$('#form').attr("action","/board/register").submit();
		})
	})
</script>
</head>
<body>
	<form method="POST" id="form">
		글제목<br>
		<input type="text" name="title"><br>
		글쓴이<br>
		<input type="text" name="writer"><br>
		내용<br>
		<input type="text" name="content"><br>
	</form>
	<input type="button" value="리스트로" id="list">
	<input type="button" value="작성완료" id="register">
</body>
</html>