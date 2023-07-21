<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function(){
		$('.num').on('click',function(e){
			e.preventDefault();
/* 			$('input[name="pageNum"]').attr("value","${num}");
			$('#page').submit(); */
			$('#page').find('input[name="pageNum"]').val($(this).attr("href"));
			$('#page').submit();
		})
	})
</script>
</head>
<body>
<form method="GET" action="/board/register">
	<input type="submit" value="글작성" id="register">
</form>
<table border="1">
	<thead>
	<tr>
		<td>번호</td><td>제목</td><td>작성자</td>
	</tr>
	</thead>
	<tbody>
		<c:forEach items="${list }" var="board" >
			<tr>
				<td><a href='/board/get?bno=<c:out value="${board.bno }"/>'><c:out value='${board.bno }'/></a></td><td><c:out value="${board.title }"/></td><td><c:out value="${board.writer }"/></td>
			</tr>

		</c:forEach>
	</tbody>
</table>
<br>
<form id="page" method="GET" action="/board/list">
	<input type="hidden" name="pageNum" value='${pageMaker.cri.pageNum }'>
</form>
<c:if test="${pageMaker.prev }">
	<a class="num" href="${pageMaker.startPage-1}">prev</a>
</c:if>
	<c:forEach var="num" begin="${pageMaker.startPage }" end="${pageMaker.endPage }">
			<a class="num" href="${num }">${num }</a>
	</c:forEach>	
<c:if test="${pageMaker.next }">
	<a class="num" href="${pageMaker.endPage+1}">next</a>
</c:if>
</body>
</html>