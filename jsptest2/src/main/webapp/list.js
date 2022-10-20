list();
function list(){
	$.ajax({
		url: "http://localhost:8282/jsptest2/list",
		success: function(re){
		let boardlist = JSON.parse(re)
		let html = '<tr><th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회수</th></tr>'
		for(let i = 0 ; i<boardlist.length; i++){
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
	alert( bno + " click ")
	$.ajax({
		url : "http://localhost:8282/jsptest2/view" , 
		data : {  "bno" : bno , "type" : "load" } ,  // 문자처리 할때 띄어쓰기 하지마세요 [ 띄어쓰기도 문자에 속합니다..]
		success : function(re){ location.href = "view.html" }
	})
}