<%@page import="kosa.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
	request.setCharacterEncoding("utf-8");
    int seq = Integer.parseInt(request.getParameter("seq"));
	
	%>
	<jsp:useBean id="board" class="kosa.model.Board"></jsp:useBean>
	<!-- *를 쓸 수 있는 이유 insert_form의 input의 name과 board의 멤버변수의 이름이 같은 경우 -->
	<jsp:setProperty property="*" name="board"/>
    <%
    	BoardDao dao = BoardDao.getInstance();
		int re = dao.updateBoard(board);
		if(re!=-1){
			response.sendRedirect("list.jsp");
		}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>