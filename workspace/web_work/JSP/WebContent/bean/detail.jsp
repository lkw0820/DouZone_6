<%@page import="kosa.model.Board"%>
<%@page import="kosa.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int seq = Integer.parseInt(request.getParameter("seq"));
	 BoardDao dao = BoardDao.getInstance();
	 Board board = dao.detailBoard(seq);
	 request.setAttribute("board", board);
%>
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
	<a href="updateForm.jsp?seq=${board.seq }">글 수정</a>
	<a href="deleteForm.jsp?seq=${board.seq }">글 삭제</a>
</body>
</html>