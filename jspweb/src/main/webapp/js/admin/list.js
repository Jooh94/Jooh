getproduct()

// 1. 모든 제품호출 메소드
function getproduct(){
	$.ajax({
		url:"/jspweb/admin/regist",
		type: "get",
		success: function(re){
		let json = JSON.parse(re)
		console.log(json)	
	    var html =  '<tr>'+
						'<th>제품이미지</th>'+
						'<th>제품번호</th>'+
						'<th>제품명</th>'+
						'<th>가격</th>'+
						'<th>할인율</th>'+
						'<th>판매가[가격*할인율]</th>'+
						'<th>판매상태</th> '+
						'<th>등록날짜</th>'+
					'</tr>';	
		for(let i=0; i<json.length; i++){
			html+='<tr>'+
						'<th><img src="http://localhost:8080/jspweb/admin/pimg/'+json[i].pimg+'" style="width:50px; height:50px;"></th>'+
						'<th>'+json[i].pno+'</th>'+
						'<th>'+json[i].pname+'</th>'+
						'<th>'+json[i].pprice+'</th>'+
						'<th>'+json[i].pdiscount+'</th>'+
						'<th>'+json[i].pprice*json[i].pdiscount+'</th> '+
						'<th>'+json[i].pactive+'</th>'+
						'<th>'+json[i].pdate+'</th>'+
					'</tr>';
		}
				
		document.querySelector('table').innerHTML=html
			
			
		}
	})
}