// 전역변수는 상단에 두자 [상단]

let pageinfo ={ // js 객체 선언
	listsize : 5 ,// 한 페이지당 보이는 게시물 수 설정한거임
	page : 1 ,		// 현재 페이지 번호
	key : '',		//검색 키
	keyword : '',	//검색 키워드
}



// 1. 게시물 출력 함수
list(1) // js 열람시 메소드 1번 실행 
function list(page){ // 함수 정의한다
	
	pageinfo.page =page; // 객체 정보 변경
	
	$.ajax({
		url : "http://localhost:8080/jspweb/baord/list" , 
		data: pageinfo,
		success : function( re ){
			let boards = JSON.parse(re)	
			//1. OBject내 게시물리스트 호출
			let boardlist = boards.data
			let html = ""
			// boardlist -> 객체를 하나씩 꺼내기
			////////////1. 게시물 출력//////////
			for( let i = 0 ;  i<boardlist.length ; i++){
				// 1. i번째 객체 호출 
				let b = boardlist[i]
				
				// 2. i번쨰 객체의 정보를 html 형식으로 변환해서 문자열에 저장
				html += '<tr>' +
							'<td>'+b.bno+'</td>'+
							//'<td><a href="http://localhost:8080/jspweb/board/view.jsp?bno='+b.bno+'">'+b.btitle+'</a></td>'+
							'<td onclick="viewload('+b.bno+')">'+b.btitle+'</td>'+
							'<td>'+b.mid+'</td>'+
							'<td>'+b.bdate+'</td>'+
							'<td>'+b.bview+'</td>'+
						'</tr>';
			} // for end 
				
			document.querySelector('.btalbe').innerHTML = html
			
			////////////////////3페이징처리///////////
			//1. 페이지버튼 html 구성
			let pagehtml='';
				//2. 이전버튼
				if(page==1){ pagehtml +='<button onclick="list('+(page)+')" >이전</button>';}
				else{ pagehtml +='<button onclick="list('+(page-1)+')" >이전</button>';}
			
			
				//4. 페이지번호 버튼
				for (let page = boards.startbtn ; page<=boards.endbtn; page++){
					pagehtml += '<button type="button" onclick="list('+page+')">'+page+'</button>';
				}
				
				
				//3. 다음버튼
				if(page >= boards.totalpage){pagehtml +='<button onclick="list('+(page)+')" >다음</button>';}
				else{pagehtml +='<button onclick="list('+(page+1)+')" >다음</button>';}
				
				document.querySelector('.pagebox').innerHTML = pagehtml
				//전체vs 검색된 게시물 표시
				document.querySelector('.totalsize').innerHTML = boards.totalsize
			
		}
	})
}
// 2. 제목 클릭했을때 화면 전환 상세 페이지 이동 함수
function viewload( bno ){
	$.ajax({
		url : "http://localhost:8080/jspweb/board/viewload" , 
		data : { "bno" : bno },
		success : function( re ){
		location.href = "http://localhost:8080/jspweb/board/view.jsp"
		}
	})
}
//4 검색처리 함수
function bsearch(){
	
	pageinfo.key =	document.querySelector('.key').value
	pageinfo.keyword = document.querySelector('.keyword').value		
	list( 1 )
}



//6. 게시물 표시 개수
function blistsize(){
	pageinfo.listsize = document.querySelector('.listsize').value
	list( 1 )
}



	
	
	
