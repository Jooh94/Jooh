bview()

function bview(){
	
	$.ajax({
		url : "http://localhost:8282/jsptest2/view",
		data : { "type" : "get" } ,   // 지금 전송방식이 get 일까요? post 일까요?이건 get으로 해도상관없다고생각합니다
		success : function( re ) {  // 노션에 적어두세요~~네!
			let b = JSON.parse(re);
			
			let col = document.querySelectorAll(".col")
			
			col[0].innerHTML = b.bno;
			col[1].innerHTML = b.btitle;
			col[2].innerHTML = b.bcontent;
			col[3].innerHTML = b.bwrite;
			col[4].innerHTML = b.bdate;
			col[5].innerHTML = b.bview;
			
		 }
	})
	
}