



function rsignup(){
	//alert('asd')
	
	let info = {
		
		rid: document.querySelector("#rid").value,
		rpassword:document.querySelector("#rpassword").value,
		rphone:document.querySelector("#rphone").value,
		remail:document.querySelector("#remail").value	
		
	}
	
	$.ajax({
		url:"http://localhost:8080/roomescape/rmember/signup",
		type : "POST",
		data : info ,
		success : function(re){
			
			if( re ==='true'){
				alert('회원가입성공') 
				}
			else{
				alert('회원가입실패')
				}
		}
		
	})

	
}
let col = document.querySelectorAll('.col')
/* --1.아이디---------------------*/
function mevent1(){									// 아이디를 입력 [keyup]하면 이벤트 발생= 함수 실행
	let rid = document.querySelector("#rid").value  // 1. 입력받은 아이디 호출
	let ridj = /^[a-z0-9]{5,20}$/					// 2. 정규표현식 작성
									
	if(ridj.test(rid) ){							// 3.정규표현식이 동일하면
		
		
		$.ajax({									// 4.아이디 중복체크 [비동기식]
			//url : "http://localhost:8080/jspweb/member/idcheck",
			//data: {"rid":rid},//보내기
			success : function(re) {//받기				// 5. 중복체크 결과(re)
				if( re==='true'){col[0].innerHTML = "소문자/숫자 조합5~20글자"}
				else{col[0].innerHTML='성공1'}
			}
			
		})//$.ajax end
		
	}else{ col[0].innerHTML="소문자/숫자 조합5~20글자"}

}

// 항상 무조건 연결되었는지 먼저확인
/* --2.비밀번호---------------------*/
function mevent2(){
	let rpassword = document.querySelector("#rpassword").value
	let rpasswordj = /^[a-zA-Z0-9]{8,20}$/
	
	if(rpasswordj.test(rpassword))
		{col[1].innerHTML= "성공2"}
		else{col[1].innerHTML="소문자/숫자 조합8~20글자"}
}
/* --3. 전화번호---------------------*/
function mevent3(){
	let rphone = document.querySelector("#rphone").value
	let rphonej=/^([0-9]{2,3})-([0-9]{3,4})-([0-9]{3,4})$/
	
	if(rphonej.test(rphone))
	{col[2].innerHTML="성공3"}
	else{col[2].innerHTML="지역번호-XXXX-XXXX 형식"  }
	
}
/* --4. 이메일---------------------*/
function mevent4(){
	let remail = document.querySelector("#remail").value
	let remailj = /^[a-zA-Z0-9+-_.]+@[a-zA-Z0-9-]+\.[a-zA0-Z9-]+$/
	if(remailj.test(remail)){col[3].innerHTML="성공4" }
	else{col[3].innerHTML='이메일 형식으로 입력해주세요'} 
}

/* ---------------------*/


	