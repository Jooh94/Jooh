
bview()

function bview(){
	
	$.ajax({
		url : "http://localhost:8080/jsptest/view",
		data : { "type" : "get" } , 
		success : function( re ) { 
			let board = JSON.parse(re)
			
			let col2 = document.querySelectorAll(".col2")
			
			col2[0].innerHTML = board.bno;
			col2[1].innerHTML = board.btitle;
			col2[2].innerHTML = board.bcontent;
			col2[3].innerHTML = board.bwrite;
			col2[4].innerHTML = board.bdate;
			col2[5].innerHTML = board.bview;
			
		 }
	})
	
}