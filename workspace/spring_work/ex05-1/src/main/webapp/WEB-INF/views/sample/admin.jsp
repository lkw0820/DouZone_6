<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>/sample/admin page</h1>
<p>principal : <sec:authentication property="principal"/></p>
<p>memberVO : <sec:authentication property="principal.member"/></p>
<p>userName(사용자 이름) : <sec:authentication property="principal.member.userName"/></p>
<p>사용자 아이디 : <sec:authentication property="principal.username"/></p><!-- username은 id임 -->
<p>사용자 권한 : <sec:authentication property="principal.member.authList"/></p>
<a href="/customLogout">로그아웃</a>
</body>
</html>