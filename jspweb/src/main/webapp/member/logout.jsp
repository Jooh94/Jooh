<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>


	<%@include file="../header.jsp" %>

	<%
		// JSP 스크립트 태그
		//session.invalidate(); : 모든 세션 제거 
		// 이게 문제가 모든세션 제거다보니 장바구니 등등 모든 게 날라갈때가 있다
		session.setAttribute("mid", null); //그러므로 특정세션 제거 하면 안전?하다 
		
		// 페이지 전환
		response.sendRedirect("/jspweb/index.jsp");
	%>
	<!--  
	<div class="webbox">
		<h3>로그아웃이 되었습니다.</h3>
		<a href="/jspweb/index.jsp">메인</a>
	</div>
-->


</body>
</html>