function findid(){
let mname =	document.querySelector("#mname").value
let memail=	document.querySelector("#memail").value
let findidconfirmbox =
	document.querySelector("#findidconfirmbox")
	
	// 2. 서블릿에게 데이터 가즈아
	$.ajax({
		url :"/jspweb/member/findid", /* 통신경로 :서블릿URL */
		data : { "mname":mname , "memail" : memail} , /* 보낼 데이터 : {"이름": 값 , "이름",값} */
		success : function(받은데이터){
			if(받은데이터 !== 'null'){
				findidconfirmbox.innerHTML = '회원 아이디 :'+받은데이터
			}else{
				findidconfirmbox.innerHTML = ' 동일한 회원 정보가 없습니다.'
			}
			
		}
		
	});
}

function findpassword(){
let mid =	document.querySelector("#mid").value
let memail=	document.querySelector("#memail").value
let resultbox =
	document.querySelector("#findpasswordconfirmbox")	
	$.ajax({
		url :"/jspweb/member/findpassword",  //통신경로 :서블릿URL
		data : {"mid": mid , "memail": memail} , // 보낼데이터
	success : function(result){
		if(result===''){resultbox.innerHTML = '동일한 회원정보가 없습니다';}
		 else{resultbox.innerHTML = '임시비밀번호 :'+result;}
		}
		
		
	})
	
}