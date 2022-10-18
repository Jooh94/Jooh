
 
 
 bview()
 function bview(){
		alert('asd')
	$.ajax({
		url:"http://localhost:8080/jspweb/board/view",
		success:function(re){
			let board = JSON.parse(re)
			console.log(board)
			
			document.querySelector('.btitle').value =board.btitle;
			// 썸머토느는 내용 저장시 html 형식으로 저장하기 때문에
			document.querySelector('.bcontent').innerHTML =board.bcontent;
			
			if(board.bfile !== null){ // 첨부파일 존재하면
				
				let filedelete = board.bfile+'<button type="button" onclick="bfiledelete()">삭제</button>' // html 구성
				document.querySelector('.oldbfilebox').innerHTML =filedelete; // 위에서 구성된 html 넣기			
			}
			
			
			
			
		/*썸머노트*/
			$(document).ready(function() {
			  $('#summernote').summernote({
	
		  placeholder : '내용 입력 해주세요',
  			maxHeight : null,
	  		minHeight : 300
		});
		
	});
	/*--------------*/
	
}
 
 
})

}

 //2. 첨부파일 삭제 버튼을 눌렀을때 (1.경로 2.보낼데이터 3.받을데이터 생각해요..)
 function bfiledelete(){
	
	//1.
	if(confirm('삭제 하시겠습니까?')){ //  만약에 confirm[확인/취소]
	
	
	$.ajax({
		
		url : "http://localhost:8080/jspweb/board/bfiledelete",
		success: function(re){
			if(re === 'true'){
				alert('첨부파일 삭제')
				//* 현재페이지 새로고침 : location.reload()
				//location.reload()
				document.querySelector('.oldbfilebox').innerHTML ='' //공백처리
				//* 특정태그만 새로고침 : JQUERY ($)제공
				$(" .#oldbfilebox").load(location.href+' #oldbfilebox')
				//
			}else{
				alert('첨부파일 삭제 실패')
			}
				
		}
		
	})
	}
}



function bupdate(){
	
	let form = document.querySelector('form')
	let formdate = new FormData(form)
	
	console.log(formdate)

	$.ajax({
		url : "http://localhost:8080/jspweb/board/bupdate",
		data : formdate,
		
		//첨부파일시
		type :"POST",
		contentType : false,
		processData : false,
		//성공시
		success: function(re){
			if(re==='true'){alert('수정성공'); location.href='view.jsp'}
			else{alert('수정실패')}
			
		}
		
	})
	
	
}
















