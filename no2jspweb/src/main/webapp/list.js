
list();
function list(){
	$.ajax({
		url : "http://localhost:8080/jsptest/list" , 
		success : function( re ){ 
			let boardlist =  JSON.parse( re )
			let html = '<tr><th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회수</th></tr>'
			for( let i = 0 ; i<boardlist.length ; i++ ){
				let b = boardlist[i];
				html += '<tr onclick="viewload('+b.bno+')">'+ 
							'<td>'+b.bno+'</td>'+
							'<td>'+b.btitle+'</td>'+
							'<td>'+b.bwrite+'</td>'+
							'<td>'+b.bdate+'</td>'+
							'<td>'+b.bview+'</td>'+
						'</tr>';
			}
			document.querySelector('table').innerHTML = html;
		 } 
	})
}

function viewload( bno ){
	$.ajax({
		url : "http://localhost:8080/jsptest/view" , 
		data : { "bno" : bno , "type" : "load" } , 
		success : function(re){ location.href="view.jsp" }
	})
}





