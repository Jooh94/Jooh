<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<h3>회원가입 페이지</h3>
		<table class="signuptable">
		<tr>
		
		<td>아이디	<input type="text" id ="rid" name ="rid" onkeyup= "mevent1()"> </td>
		<td class="col"></td>
		<td>비밀번호	<input type="password" id="rpassword" name ="rpassword" onkeyup="mevent2()"></td> 
		<td class="col"></td>
		<td>전화번호	<input type="text" id="rphone" name="rphone" onkeyup="mevent3()"> </td>
		<td class="col"></td>
		<td>이메일	<input type="text" id="remail" name="remail" onkeyup="mevent4()"> </td>
		<td class="col"></td>
		</tr>
		</table>
		<button type="button" onclick="rsignup()">가입하기</button>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script  type="text/javascript" src ="../js/signup.js"></script>	
</body>
</html>