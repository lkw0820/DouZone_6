<%@page import="kosa.model.Board"%>
<%@page import="java.util.List"%>
<%@page import="kosa.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%
    	BoardDao dao = BoardDao.getInstance(); 
    	List<Board> list = dao.listBoard();
    	request.setAttribute("list", list);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>글 목록 페이지</h2>
	<a href="insert_form.jsp">글쓰기</a>
	<table border="1" width="800">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="board" items="${list }">
		<tr>
			<td>${board.seq }</td>

			<td><a href="detail.jsp?seq=${board.seq }">${board.title }</a></td>

			<td>${board.writer }</td>

			<td>
				<fmt:parseDate var="dt" value="${board.regdate }" pattern="yyyy-MM-dd"></fmt:parseDate>
				<fmt:formatDate value="${dt}" pattern="yyyy-MM-dd"/>
			</td>

			<td>${board.hitcount }</td>
		</tr>
		</c:forEach>

	</table>
</body>
</html>