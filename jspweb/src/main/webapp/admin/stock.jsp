<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			
			<div class="container"> <!--  b : container 박스권 -->
				<h3>재고관리</h3>
				<div class="row"> <!--  b : row 하위태그 가로배치 -->
					<div class=" col-md-4">
						<select class="cselect form-select ">
							<option> 카테고리 선택</option>
						
						</select>
					</div>
					<div class="col-md-4"> <!--  b: col-md-숫자 12그리드 중 숫자만큼 사이즈 -->
						<select class="pselect form-select ">
							<option>제품명 선택 </option>
						</select>
					</div>	
				</div>
				<div class="row">
						<div class="col-md-6">
						
							<h3> 재고 등록</h3>
							<table class="table"> <!--  b table 테이블형식 -->
								<tr> <td style="width: 20%;"> 카테고리번호 </td> <td class="rows"></td> </tr>
								<tr> <td style="width: 20%;"> 제품번호 </td> <td class="rows"></td> </tr>
								<tr> <td style="width: 20%;"> 제품명 </td> <td class="rows"></td> </tr>
								<tr> <td style="width: 20%;"> 사이즈 </td> <td class="rows"><input type="text" class="psize  form-control"> </td> </tr>
								<tr> <td style="width: 20%;"> 색상 </td> <td class="rows"><input type="text" class="pcolor  form-control"></td> </tr>
								<tr> <td style="width: 20%;"> 재고수량 </td> <td class="rows"><input type="text" class="pstock  form-control"></td> </tr>
								<tr> <td colspan="2"> <button onclick="setstock()" type="button" class="form-control">등록</button> </td> </tr>
							</table>
						</div>
						<div class="col-md-6">
							<h3> 재고 출력</h3>
							<table class="table2">
								<tr>
									<th> 사이즈 </th>
									<th> 색상 </th>
									<th> 재고</th>
								</tr>
							</table>
						
						</div>
				
				</div>
			</div>
			
			<script type="text/javascript" src="/jspweb/js/admin/stock.js"></script>
</body>
</html>