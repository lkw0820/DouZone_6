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
		
		$('#update').on("click",function(){
			console.log("수정완료");
			$('#form').attr("action","/board/modify").submit();
		})
	})
</script>
</head>
<body>
	<form method="POST" id="form">
		<input type="text" name="bno" value='<c:out value="${board.bno }"/>' readonly><br>
		<input type="text" name="title" value='<c:out value="${board.title }"/>' ><br>
		<input type="text" name="writer" value='<c:out value="${board.writer }"/>' readonly><br>
		<input type="text" name="content" value='<c:out value="${board.content }"/>' ><br>
	</form>
	<input type="button" value="리스트로" id="list">
	<input type="button" value="취소" id="cancel">
	<input type="button" value="수정 완료" id="update">
</body>
</html>