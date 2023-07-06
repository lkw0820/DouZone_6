<%@page import="kosa.model.Board"%>
<%@page import="kosa.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	int seq = Integer.parseInt(request.getParameter("seq"));
    	BoardDao dao = BoardDao.getInstance();
    	int re = dao.deleteBoard(seq);
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