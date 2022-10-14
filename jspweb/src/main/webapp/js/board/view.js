
bview()

function bview(){
	$.ajax({
		url : "http://localhost:8080/jspweb/board/view" , 
		success : function( re ){ 
			let board  = JSON.parse( re )
			console.log( board )
			document.querySelector('.bno').innerHTML = board.bno;
			document.querySelector('.btitle').innerHTML = board.btitle;
			document.querySelector('.bcontent').innerHTML = board.bcontent;
			document.querySelector('.mid').innerHTML = board.mid;
			
			
			console.log(board.bfile)
			if(board.bfile){ // null,undefined,0,false
			alert('null 아닌경우')
			/*http://localhost:8080/jspweb/board/filedown*/
			let filelink ='<a href="../board/filedown?bfile='+board.bfile+'">'+board.bfile+'</a>'
			// ' ' : 전체 문자열 처리
			// " " : 전체 문자열내 문자열 구분
			document.querySelector('.bfile').innerHTML = filelink
			}else{
				alert('null 입니다')
			
			}
			console.log(board.btnaction)
			let btnbox = document.querySelector('.btnbox')
			if(board.btnaction == true){
			// 삭제버튼 활성화
			let deletebtn= '<button onclick="bdelete('+board.bno+')"> 삭제 </button>'
			btnbox.innerHTML +=deletebtn;
			// 수정 버튼 활성화 
			let updatebtn = '<button><a href="../board/update.jsp">수정</a></button>'
			btnbox.innerHTML += updatebtn;
			}
			
			
		}
		
	})
}

function bdelete(bno){
	$.ajax({
		url :"http://localhost:8080/jspweb/board/bdelete",
		data : {"bno":bno}, //삭제할 게시물의 식별번호[pk]
		success:function(re){
			if( re==='true'){
				alert('글삭제 성공');
				location.href="../board/list.jsp"
			}		
			else{alert('글삭제 실패 : 관리자문의')}
		}
		
	})
}

