/**
 * 
 */
 
 let counter = 0 // 클릭수를 저장하는 변수
 let isConnect = false
 
 
 const h1 = document.querySelector('h1') // 요소 가져오기
 const p = document.querySelector ('p')
 const connectBtn = document.querySelector('#connect')
 const disconnectBtn = 	document.querySelector('#disconnect')
 // 객체명.addEventListener('이벤트명',콜백함수)
 	// 해당 객체의 이벤트 발생했을때 콜백함수 실행 된다
 
 //출력하는 함수
 const listener = () => { 
	counter++
	h1.textContent = `클릭횟수 : ${counter}`}

 //1. 연결 버튼을 클릭했을때
 connectBtn.addEventListener('click' , () =>{
	if( isConnect == false){
		// 만약에 연결이 안되어 있으면
		h1.addEventListener('click',listener)
		p.textContent = '이벤트 연결 상태 : 연결'
		isConnect = true // 연결 했다는 의미로 연결상태 변수에 true로 변환
	}
})

//2. 연결해제 버튼을 클릭했을때
disconnectBtn.addEventListener('click', ( )=>{
	if(isConnect == true){
		h1.removeEventListener('click',listener)
		p.textContent='이벤트 연결 상태 : 해제'
		isConnect = false
	}
})