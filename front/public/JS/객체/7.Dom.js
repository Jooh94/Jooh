


					//함수(이벤트, 콜백함수 (인수)=>{결과})
document.addEventListener('DOMContentLoaded', ()=>{
	
	//변수 = h1 태그 이름으로 요소(태그)선택 [태그를 js객체로 가져오기]
	const header = document.querySelector('h1')
		//querySelector : 요소 1개 가져오기
		//querySelectorAll: 요소 여러개 가져오기
	console.log(header)
	console.log(typeof(header))  
	// typeof( ) : 자료형 [1.string 2.boolean 3.Number.4object(배열,함수,DOM)]
		
		
	// 텍스트 와 스타일 변경
	header.textContent = '안녕~~'
	header.style.color = 'white'// css 조작[DOM객체명.style 속성명 = 값]
	header.style.backgroundColor = 'black' // css조작
	header.style.padding = '10px'
 }) //addEventListener end
	

document.addEventListener('DOMContentLoaded' ,()=>{
	const  headers = document.querySelectorAll('h1')
	console.log(headers)
	console.log(typeof(headers) )
	for ( let i = 0 ; i<headers.length ; i ++){
		headers[i].textContent='안녕1'+i
	}
	//2.
	for ( let index in headers){ // 0부터 마지막인데스까지 인덱스 하나씩 대입반복
		headers[index].textContent = '안녕'+index
	}
	//3.
	for( let object of headers){
		object.textContent = '안녕'		
	}
	//4.
	headers.forEach( (object)=>  {object.textContent ='안녕~~'})
	
	
	
})				