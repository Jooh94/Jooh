
// 1. 등록 버튼을 눌렀을때
function regist(){

	/* 첨부파일이 포함되어있을경우 form 많이 쓴다 */
	let form = document.querySelector('form')
	let formdata = new FormData(form)
	
	
	$.ajax({
		
		url :"/jspweb/admin/regist",
		data : formdata,
		/* form 전송이 첨부파일 경우 [아래 3가지 무조건 필수]  t p c 타입은 무조건 POST*/ 
		type :"POST",
		processData: false,
		contentType: false,
		success: function(re){
			if(re == 'true'){alert("제품등록")}
			else{alert("제품등록실패")}
		}
	})
	
}

//2. 첨부파일 등록(변경)했을때 미리보기 
let pimg = document.querySelector('#pimg')

pimg.addEventListener('change',function(e){ // e : 첨부파일 input change 이벤트  e : event 객체 ( 이벤트정보[target ,data 등])
	// 1. js 파일 클래스 [FileReader ]
	let file = new  FileReader() // 객체 생성
	/*	console.log(file)
		console.log(e)			// 이벤트 객체
		console.log(e.target)	// 이벤트 발생 시킨 태그 <input type ="file">
		console.log(e.target.files[0]) // 해당 태그의 파일 등록된 파일호출 */
	// 2. 해당 첨부된 파올 경로 알기 [file.readAsDataURL(파일)] // e.target.files[0] : 첨부파일의 등록된 이미지 가져오기
	 	file.readAsDataURL(e.target.files[0]) // readAsDataURL() : 해당 파일 읽어오기
	// 3. 이미지 태그에 이미지 대입 
	file.onload =  function(e){		// e : 로드 된 file 의 이벤트
		document.querySelector('#pimgpre').src = e.target.result  	//  서버[사용자의 c드라이브 경로요청X]와 관련 없음
	}
})


// 3. 카테고리 추가 버튼을 눌렀을때 이벤트

function pcategoryview(){
	document.querySelector('.pcategoryaddbox').innerHTML
		= '	<input type="text" id="pcname">'+
			'<button type="button" onclick ="pcategoryadd()">카테고리 등록</button>'
}

//4. 카테고리 등록 버튼을 눌렀을때 이벤트
function pcategoryadd(){
	$.ajax({
		 url: "/jspweb/admin/pcategory",
		 type : "POST",
		 data:{"pcname":document.querySelector('#pcname').value},
		 success:function(re){
			if( re == 'true'){
				alert('카테고리등록')
				document.querySelector('.pcategoryaddbox').innerHTML =''
				getpcategory()
			}else{alert('카테고리실패')}
			}

		})
}

getpcategory()
function getpcategory(){
	$.ajax({
		url : "/jspweb/admin/pcategory",
		type:"get",
		success:function(re){
			console.log(re)
			let json = JSON.parse(re)
			
			let html = ''
			
			for ( let i= 0; i<json.length; i++){
				let category = json[i];				
				html += '<input type="radio" name ="pcno"  value='+category.pcno+'>'+category.pcname;
			}
			
			document.querySelector(".pcategorybox").innerHTML = html;
		}	
		
	})
}







