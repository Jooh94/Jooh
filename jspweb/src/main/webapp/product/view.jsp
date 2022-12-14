<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<link href="/jspweb/css/productview.css"  rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

			<%@include file = "../header.jsp" %>
			<%
				//자바를 작성할수 있는 태그 [ 서블릿 ]
					//1.경로에 있는 pno request 요청
					int pno = Integer.parseInt(request.getParameter("pno"));	
			%>
				<input type="text" value="<%=pno%>" class="pno">
				<div class="container"> <!--  b : container -->
					<div class="row">	<!--  b : row -->
						<!--  대표 이미지 -->
						<div class="col-md-6"> <!--  b : col-md-6 12그리드중 6그리드 반이죠 -->
							<img class="pimg" alt="" src="/jspweb/img/코트.jpg">
						</div> 

						
						<!--  상품 정보 -->
						<div class="col-md-6"> <!-- b: col-md-6 애도 6 그러므로 반반이겠죠 -->
							<div class="infobox">
								<!-- 제품명 -->
								<h4 class="pname"></h4>
								<!-- 제품설명 -->
								<div class="pcomment"></div>
								<!-- 가격 -->
								<div class="pricebox">
									<span class="pdiscount"></span> <!--  할인율 -->
									<span class="pprice"></span> <!--  원가 -->
									<span class="psale"></span> <!--  할인이 적용된 가격 -->
								</div>

								
								<!--  사이즈 종류 -->
								<div class="sizebox">
									<span></span>
								</div>
								<!-- 제품 옵션 -->
								<table class="table into_t"> <!--  b: table -->
									<tr> <td>배송구분</td>	<td>2,500(70,000원 이상 구매시 무료)</td></tr>
									<tr> <td>카드혜택</td>	<td> 무이자할부</td></tr>
									<tr> <td>적립혜택</td>	<td> 3000(1%)</td></tr>
									
									<!--  색상 선택 행 -->
									<tr> <td>색상</td>		
									<td>
										<select class="cselect"> 
										
										</select>
									</td>
									</tr>
									
								<!-- 사이즈 선택 행 -->	
								<tr> <td>사이즈</td>		
									<td>
										<select class="sselect">
											<option>-[필수] 색상 우선 선택 </option>
										</select>									
									</td>
								</tr>
								</table>
								
								<!--  선택된 제품 목록 -->
								<table class="table select_t">
								
								</table>
									
								<!--  선택된 제품들의 총 가격 -->
								<div class="row">
									<div class="col-md-6"> 총 상품금액 </div>
									<div class="col-md-6 totalprice"> 40,000원 </div>
								</div>
								
								<!-- 버튼 -->
								<div class="btnbox">
									<button id="btn1">바로 구매</button>
									<button id="btn2">장바구니 담기</button>
									<button id="btn3">찜하기 ♡</button> <!--  로그인안된  회원이 찜하기전 이미지-->
								</div>
							</div>						
						</div> 
					</div>
				</div>
				<script type="text/javascript" src="/jspweb/js/product/productview.js"></script>

</body>
</html>