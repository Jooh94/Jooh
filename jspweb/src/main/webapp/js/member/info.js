
//alert('al') 오류확인용
getmember()
/*-------------------회원정보 호출 ----------------------*/
function getmember(){
$.ajax({
	url : "/jspweb/member/info" , //이거 헷갈리면 서블릿 켜봐 혁아 그대로 주소복사하면된다
	success: function(result){
		//alert('al2') 오류확인용
	// HTTP 스트림 (바이트단위) json형식의 문자타입을 JSON 타입으로 형변환
	let member = JSON.parse(result)
	
	document.querySelector("#mno").innerHTML  = member.mno
	document.querySelector("#mid").innerHTML  = member.mid
	document.querySelector("#mdate").innerHTML  = member.mdate
	document.querySelector("#mpoint").innerHTML  = member.mpoint
	
	document.querySelector("#mname").value = member.mname
	document.querySelector("#mphone").value = member.mphone
	document.querySelector("#memail").value = member.memail
		
	document.querySelector("#sample4_postcode").value = member.maddress.split(",")[0]
	document.querySelector("#sample4_roadAddress").value = member.maddress.split(",")[1]
	document.querySelector("#sample4_jibunAddress").value = member.maddress.split(",")[2]
	document.querySelector("#sample4_detailAddress").value = member.maddress.split(",")[3]
	
	
	//getmemberlist();
	
	
		}
	});
}
/* -------------모든 회원 호출-----------------*/
function getmemberlist(){

$.ajax({
	url : "/jspweb/member/infolist", // 서블릿 통신
	success : function(result){
	let memberlist = JSON.parse(result)
	
	//1. tag 가져오기
	let table = document.querySelector("#memeberlisttable")
//	alert(table) // 오류확인용 습관이되자
	//2. table 에 넣을 html 문자열
	let tag = 
				'<tr>'+
					'<th> 번호 </th>	<th> 아이디 </th><th> 이름 </th>'+
					'<th> 연락처 </th><th> 이메일 </th><th> 주소 </th>'+
					'<th> 날짜 </th>	<th> 포인트 </th>'+
				'</tr>';
	
	
	//2. tag 값넣기
	for ( let i =0 ; i < memberlist.length ; i++){
		//3. 해당 인덱스의 객체호출
		let m = memberlist[i]
		//5. 해당 객체의 정보를 html 출력
		tag += 	 
					'<tr>'+
						'<td> '+m.mno+' </td> 		<td> '+m.mid+' </td>'+
						'<td> '+m.mname+' </td> 	<td> '+m.mphone+' </td>'+
						'<td> '+m.memail+' </td>	<td> '+m.maddress+' </td>'+
						'<td> '+m.mdate+' </td> 	<td> '+m.mpoint+' </td>'+
					'</tr>';	
	}
	//6.html 문자열을 
	table.innerHTML = tag
	
	}
})
}

/* ------------------------회원 탈퇴 ------------*/

function viewdelete(){
	// 1. tag 가져온다
	let deletebox = document.querySelector("#deletebox")
	// 2. tag에 넣을 html 문자열 구성
	let tag = 
			'<span> ! 정말 탈퇴 하시겠습니까? </span>' + 
			'<input type="password" id="mpassword" >' + 
			'<button onclick="mdelete()">확인</button>';
	// 3. tag 에 html 넣기 
	deletebox.innerHTML = tag
}

function mdelete(){
	//1. tag 입력된 비밀번호 가져온다.
	let mpassword = document.querySelector("#mpassword").value
	//2. ajax 를 이용한 회원탈퇴 처리 
	$.ajax({
		url : "http://localhost:8080/jspweb/member/delete",
		data : { "mpassword" : mpassword } ,
		success : function( result ){
			if( result === 'true'){
				alert('탈퇴 성공');
				location.href ='/jspweb/member/logout.jsp'
			}else{ alert('동일하지 않는 비밀번호 입니다') }
		 }
	})
}

let bottons = document.querySelectorAll('button')


function updateaction(){
	let mname = document.querySelector('#mname')
	if(bottons[1].innerHTML ==='확인'){
		$.ajax({
			url:"http://localhost:8080/jspweb/member/update",
			data : {"mname": mname.value},
			success: function(re){
				if(re==='true'){
					alert('수정성공')
				}else{
					alert('수정실패')
				}
			}
			
		})
	   bottons[1].innerHTML ='수정'
		mname.readOnly = true;
		//location.href = 'url';
		location.reload();
	}else{
		alert('수정후 확인 버튼 클릭시 수정이 완료됩니다.')
		mname.readOnly = false; //수정모드 제거
		bottons[1].innerHTML ='확인'
		
		
	}
}















/* 
	선언 : let 객체명 = { 속성명 : 값 , 속성명 : 값, 속성명 : 값 }
	호출 : 객체명.속성명
*/