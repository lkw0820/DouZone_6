<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String body=request.getParameter("body");
	if(body==null){
		body="/include/main.jsp";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- header -->
	<jsp:include page="/include/module/header.jsp"/>
	<hr>
	<!-- logo -->
	<jsp:include page="/include/module/logo.jsp"/>
	<hr>
	<!-- menu -->
	<jsp:include page="/include/menu.jsp"/>
	<hr>
	<!-- body -->

	<jsp:include page="<%=body %>"/>
	<hr>
	<!-- footer -->
	<jsp:include page="/include/module/footer.jsp"/>
</body>
</html>