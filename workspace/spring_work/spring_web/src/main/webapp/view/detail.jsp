<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>글 세부 보기</h2>
	<ul>
		<li>${board.seq }</li>
		<li>${board.title }</li>
		<li>${board.writer }</li>
		<li>${board.contents }</li>
	</ul>
	<br><br>
	<a href="board_update?seq=${board.seq }">글 수정</a>
	<a href="board_delete?seq=${board.seq }">글 삭제</a>
</body>
</html>