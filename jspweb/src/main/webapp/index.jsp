<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/jspweb/css/main.css" rel="stylesheet">

</head>
<body>
		<%@include file="header.jsp" %>	
		<!--   <img alt="" src="img/mainimg.jpg" width = "100%" > -->
				
				<!-- 대문 [ 이미지 슬라이드 - 캐러셀 -->
			<div id="carouselExampleControls" class="carousel slide carousel-fade" data-bs-ride="carousel" data-bs-interval="1000">
			
			  <div class="carousel-inner"> <!--  이미지 삽입되는 구역 -->
			    <div class="carousel-item active"> <!--  이미지 active : 현재 보이는 이미지 -->
			      <img src="/jspweb/img/mainimg1.jpg" class="d-block w-100" alt="...">
			    </div>
			    <div class="carousel-item">
			      <img src="/jspweb/img/mainimg2.jpg" class="d-block w-100" alt="...">
			    </div>
			    <div class="carousel-item">
			      <img src="/jspweb/img/mainimg3.jpg" class="d-block w-100" alt="...">
			    </div>
			  </div>
			  
			  <!-- 왼쪽버튼 -->
			  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
			    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Previous</span>
			  </button>
			  <!-- 오른쪽 버튼ㄴ -->
			  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
			    <span class="carousel-control-next-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Next</span>
			  </button>
			</div>		
				
		<!-- 광고/이벤트 -->
				
				
		<!-- 제품 출력 -->
		<div class="container"> <!-- b: 전체박스권 -->
			<h6 class="box_title" >따숩따숩</h6>
			
			<div class="itemlist"><!-- 일정 구역 -->
				
			</div>
		</div>
		
		<script src="/jspweb/js/index.js" type="text/javascript"></script>
				
</body>
</html>