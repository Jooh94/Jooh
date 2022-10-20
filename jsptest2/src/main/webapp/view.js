bview()

function bview(){
	
	$.ajax({
		url : "http://localhost:8282/jsptest2/view",
		data : { "type" : "get" } , 
		success : function( re ) { 
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