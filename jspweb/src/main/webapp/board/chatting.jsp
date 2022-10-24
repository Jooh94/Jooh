<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	<!-- 사용자 정의 -->
	<link href="/jspweb/css/chatting.css" rel="stylesheet">
</head>
<body>

	<%@include file="../header.jsp" %>
	<!-- 로그인 회원 아이디 숨기기 -->
	<input type="hidden" class="mid" value="<%=loginid%>">
										<!-- 위에 loginid 띄어쓰기조심 공백생김 -->
											
	<div class="container"> <!-- 부트스트랩css는 미리 만들어진 class 사용 -->
		<div class="col-sm-6 offset-3  chattingbox "> <!--  채팅구역 -->
		
		<div class="row">
			<div class="col-sm-4"> <!--  접속 회원목록 -->
			
			</div>
			<div class="col-sm-8"> <!--  채팅창 -->
						
						<div class="contentbox my-3">
							
								
							
						</div> 
						
						<!-- 채팅입력창 -->
					<textarea rows="" cols="" class="form-control msgbox" onkeyup="enterkey()"></textarea> <!--  메시지 입력 구역 -->
					<!-- 이모티콘, 보내기 -->
					<div class="row">
						<div class="col-sm-2">
							<button class="dropdown-toggle" type="button" id="emobutton" data-bs-toggle ="dropdown">
							이모티콘
							</button>
							<ul style="width:400px; height: 200px; "  class="dropdown-menu">
								<!--  이모티콘 표시 구역 -->

							</ul>
						</div>
						<div class="col-sm-3 offset-7">
							<button class="form-control" type="button" onclick="send()">보내기</button> <!--  메시지 보내는 버튼 -->	
						</div>
					</div>
						
			</div>
		</div>
	
		</div> <!--  채팅 구역 end -->
	</div> <!-- 컨테이너 end -->
	

	
	
	<script type="text/javascript" src="../js/board/chatting.js"></script>


</body>
</html>