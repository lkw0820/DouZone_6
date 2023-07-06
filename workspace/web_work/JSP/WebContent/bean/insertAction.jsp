<%@page import="kosa.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- form으로부터 데이터를 전달받아서 자바객체로 변환해주는 작업 -->
<% 
	request.setCharacterEncoding("utf-8");
	
%>
<jsp:useBean id="board" class="kosa.model.Board"></jsp:useBean>
<!-- *를 쓸 수 있는 이유 insert_form의 input의 name과 board의 멤버변수의 이름이 같은 경우 -->
<jsp:setProperty property="*" name="board"/>
<%
	BoardDao dao = BoardDao.getInstance();
	int re = dao.insertBoard(board);
	if(re!=-1){
		response.sendRedirect("list.jsp");
	}
	//System.out.println(dao.listBoard());
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