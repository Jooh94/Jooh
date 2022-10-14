 /*썸머노트 실행*/
 
 $(document).ready(function() {
  $('#summernote').summernote({
	
		  placeholder : '내용 입력 해주세요',
  			maxHeight : null,
	  		minHeight : 300,
	  		lang: 'ko-KR'
	});
  

  
  
});
 
 function bwrite(){
// form 버전 

let form = document.querySelector('form') // 1. form 태그 호출
console.log(form)
	
let formdata =	new FormData(form) // 2. 객체화된 form 정보 호출  
					//대문자써야함 fordata X FormData O
console.log(formdata)

	$.ajax({ // ajax 통신 전송타입 : 문자열
		url : "http://localhost:8080/jspweb/board/write",
		data : formdata, // ajax 기본값으로 form 전송 불가능
		//첨부파일 전송시 : 아래 코드 추가 [post방식[get방식불가] ]
		type : 'POST', // http메소드 [get(첨부파일 지원안해 첨부파일은 무조건  포스트) vs post]
		contentType : false, 
		// 기본값 :application x-www-form-urlencoded; charset = UTF-8 	: 바이트[첨부파일 지원x]
		//vs
		// flase : mulutipart/for-data									: 대용량 바이트[첨부파일 지원O]
		processData : false , //전송시 사용되는 타입
		// 기본값 : 전송url 데이터 명시 http://example.com?title=tit*content=cont
		//vs
		//false : http://example.com
		
		success :function(re){
			if(re==='true')
			{alert('글등록');
			 location.href="list.jsp"
			 }
			else{alert('글등록실패')}}
		
	})


/*
	//form 없는 버전!
	
	let inputs = document.querySelectorAll('input')
	console.log( inputs ) // inputs[0] : 헤더에 검색 입력창
	let data = {
		btitle : inputs[1].value , 	
		bcontent : inputs[2].value
	}
	
	console.log( data )
	
	
	$.ajax({
		url : "http://localhost:8080/jspweb/board/write" ,
		data : data ,
		success : function ( re ){
			if(re==='true'){alert('글등록'); location.href="list.jsp"}
			else{alert('글등록실패')}
		}
	})
	*/
}