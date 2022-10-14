blist() // 무조건1번실행
let boardlist = null

function bwrite(){


let info ={	
	
	btitle: document.querySelector("#btitle").value,
	bcontent:document.querySelector("#bcontent").value,
	bwrite:document.querySelector("#bwrite").value,
	bpassword:document.querySelector("#bpassword").value
	
	}
	console.log(info)
	$.ajax({
		url:"http://localhost:8080/no2jspweb/member/bwrite",
		data : info ,
		success:function(re){
			if(re== 'true') {alert('글등록완료'); location.reload();}
		else{alert('글등록실패')}
		
		}
		
		
	})
}

function blist(){
	$.ajax({
		
		url:"http://localhost:8080/no2jspweb/member/blist",
		success:function(re){
			boardlist =JSON.parse(re)
	let html = '<tr>'+
		'<th> 번호 </th><th>제목</th><th>작성자</th><th>작성일</th><th>조회수</th>'+			
		'</tr>';
		
		for ( let i = 0; i<boardlist.length; i++){
			let b = boardlist[i]
			
	html +='<tr>'+
			'<th>'+b.bno+'</th><th onclick="bview('+b.bno+')">'+b.btitle+'</th><th>'+b.bwrite+'</th><th>'+b.bdate+'</th><th>'+b.bview+'</th>'+
			'</tr>';
	
		}
		console.log(html)
		document.querySelector("#boardtable").innerHTML =html	
		}	
	})
}

function bview(bno){

	document.querySelector("#row1").innerHTML = boardlist[bno-1].bno;
	document.querySelector("#row2").innerHTML = boardlist[bno-1].btitle;
	document.querySelector("#row3").innerHTML = boardlist[bno-1].bcontent;
	document.querySelector("#row4").innerHTML = boardlist[bno-1].bwrite;
	document.querySelector("#row5").innerHTML = boardlist[bno-1].bdate;
	document.querySelector("#row6").innerHTML = boardlist[bno-1].bview;
	
	$.ajax({
		url : "http://localhost:8080/no2jspweb/member/bviewupdate",
		data :{"bno":bno},
		success: function(re){
			if(re=='true') {blist()}			
			}
		
	})
}


function bdelete(i){
	let password = prompt('비밀번호 입력')
	if( password !== boardlist[i].bpassword){alert('비밀번호 다름'); return;}
	$.ajax({
		url : "http://localhost:8080/no2jspweb/board/bdelete",
		success: function(re){
			if(re =='true'){alert("삭제 성공"); location.reload();}
			else(alert("실패했어"))
			
		}
		
	})



}










