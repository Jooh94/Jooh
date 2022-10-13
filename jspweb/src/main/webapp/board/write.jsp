<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

			<%@include file="../header.jsp" %>
			<% if(loginid == null)response.sendRedirect("http://localhost:8080/jspweb/member/login.jsp"); %>
			
			<div class="webbox">
				
				<h3>글쓰기</h3>
				
			<!-- 1.form =동기식 [페이지전환o] 2.ajax선택 =[페이지전환x]비동기/동기 선택 -->
			
			<!--  첫번째 방법 form 쓴거			
			<form method="get" action="http://localhost:8080/jspweb/board/write">	
				제목 : <input type= "text" name="btitle">
				내용 : <input type="text" name ="bcontent">
				<button type ="submit">글쓰기</button>
			</form>
			-->
			<!-- 두번째 방법 ajax 쓰는거 -->
				제목 : <input type= "text" ><br>
				내용 : <input type="text" ><br>			
				첨부파일 : <input type="file"><br>	
						<button onclick="bwrite()">쓰기</button>
			</div>

	<script type="text/javascript" src="../js/board/write.js"></script>

</body>
</html>