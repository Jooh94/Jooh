<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이젠 쇼핑몰</title>
		<!--  뷰 포트 -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!--  사용자 정의 css호출 -->
		<link rel="stylesheet" href="/jspweb/css/header.css">
		<!-- 폰트어썸[아이콘] -->
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
		
</head>
<body>

	<div class="webbox"> <!--  웹 페이지 박스권 -->
		<div class="hd_top">
			<div> <!-- 로고 -->
				<span class="hd_title">
					<a href="/jspweb/index.jsp">Ezen Shop</a>
				 </span>
			</div>
			
			<!-- 세션 호출 [jsp방식 = 템플릿마다 다름,(JSP VS 리액트 랑 다르다] -->
			
			<%
				// JSP 스크립트 태그 (태그안에 JAVA 문법 작성 가능)
				// jsp 세션객체 제공
				String loginid = (String)session.getAttribute("mid");
								//형변환 : 세션자료형 = object 기본 객체로 세션 제공
			%>
		
			<ul class="hd_sub"> <!--  상단메뉴 -->
				
				
				<!--  비로그인 메뉴 // 세션이 없다 로그인 안했네 -->
				<%  if(loginid == null){ %> 
				<li> <a href="/jspweb/member/login.jsp">로그인</a> 	</li>
				<li> <a href="/jspweb/member/signup.jsp">회원가입</a> </li>				
				<!-- 로그인 메뉴 // 세션이 존재한다 로그인 했네 -->
				<% 	}else{ %>
						<li><%=loginid %>님 안녕하세요</li>		
						<li><a href="/jspweb/member/logout.jsp" > 로그아웃</a></li>
				<%}	%> 				
				<!-- 공통 메뉴 -->
				<li> <a href="/jspweb/member/info.jsp">마이쇼핑</a> </li>
				<li> <a href="/jspweb/board/list.jsp">고객센터</a> </li>
			</ul> <!--  상단메뉴 end -->
		</div>
		<ul class="hd_menu"> <!--  하단 헤더 -->
			<li><a href="#"> BIG SIZE!</a></li>
			<li><a href="#"> 1+1 이벤트</a></li>
			<li><a href="#"> 아우터 </a></li>
			<li><a href="#"> 상의 </a></li>
			<li><a href="#"> 바지 </a></li>
			<li><a href="#"> 슈즈 </a></li>
			<li><a href="#"> 악세사리 </a></li>
			<li><a href="#"> BEST </a></li>
			<li><a href="#"> 트레이닝 </a></li>
			<li><a href="/jspweb/board/api.jsp"> 공공데이터 </a></li>
			<li><a href="/jspweb/board/chatting.jsp"> 채팅방 </a></li>
			<li class="serchbox">
				<span>
				<input>
				<i class="fas fa-search"></i>
				</span>
				<i class="fas fa-shopping-cart"></i>
				
			</li>
		</ul>
	</div>
	<!--  부트스트랩 js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>	
	
	<!--  JQUERY 라이브러리 -->
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
</body>
</html>

<!-- 
	<div> : block[한줄자치]레이아웃, 박스권 , 구역
	vs
	<span> : inline
	<ul> : 글머리 리스트
 		<li> : 리스트 아이템[값/항목]
 
 -->