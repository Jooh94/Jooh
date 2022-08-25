/* 
	객체명.textContent
	객체명.innerHTML
	객체명.value		: 입력상자, 선택상자

*/

//1. HTML 요소 가져오기
const input =document.querySelector('#inchbox')
const button =document.querySelector('#inchbtn')
const p =document.querySelector('#inchp')

// 2. 버튼을 눌렀을때
button.addEventListener('click', ()=>{
	
	const inch = Number(input.value ) //Number(문자) :문자열->숫자열
	
	if(isNaN(inch) ){
	  p.textContent = '숫자를 입력해주세요'
	  return	
	}
	//입력값이 숫자이면
	const cm = inch * 2.54
	p.textContent = `${cm}cm`
})
// p.341
const emailbox = document.querySelector('#emailbox')
const emailp = document.querySelector('#emailp')

//이메일 검증 확인 함수
const isemail = (value) =>{
	return(value.indexOf('@')>1) && (value.split('@')[1].indexOf(".")>1)
		// 입력데이터의 @ 가 있는지 이면서 입력데이터의  @ 뒤문자
		//						qweqweqe@naver.com
		// 								naver.com -> .가 있는지
}

emailbox.addEventListener('keyup',(event)=>{
	const value = event.currentTarget.value
	if(isemail(value)){
		p.style.color = 'green'
		p.textContent='이메일 형식입니다 : ${value}'
	}else{
		p.style.color = 'red'
		p.textContent = '이메일 형식이 아닙니다 : ${value}'
	}
})

/* 
	배열명.indexOf('검색데이터') : 배열내 해당 데이터의 인덱스 번호 찾기
	문자열.indexOf('@') : 문자열내 @ 의 인덱스 번호 찾기
		만약에 0보다 작으면 못찾았다~ [ 인덱스란: 저장 순서 번호 = 0번 시작]
	문자열.split('기준문자') : 문자열내 기준문자 기준으로 분리 [자르기] ->배열
		예) 
		문자열 = 유재석/강호동/신동엽/하하
		문자열.split("/")	
		문자열.split("/")[0] : 유재석
		문자열.split("/")[3] : 하하
		
		
		
		
*/


// p. 343
const selectbox = document.querySelector('#selectbox')
const selectp = document.querySelector('#selectp')

selectbox.addEventListener('change',(event)=>{
	const options = event.currentTarget.options
	const index = event.currentTarget.options.selectdIndex
	
	
	selectp.textContent = `선택 : ${options[index].textContent}`
})


const selectbox2 =document.querySelector('#selectbox2')
const selectp2 =document.querySelector('#selectp2')

selectbox2.addEventListener('change',(event)=>{
	
	// 옵션목록 = selectbox2 모둔 옵션 호출
	const options = event.currentTarget.options
	const list = [ ]
	
	for(const option of options){
		// 배열[옵션목록] 중 하나씩 option 대입 반복
		if( option.selected){ // 만약에 해당 옵션에 selected 속성[선택된 상자]
			list.push( option.textContent)
		} // if end
	} // for end
	selectp2.textContent = `선택 : ${list.join(',')}`
	// 배열명.join('연결문자') : 배열내 모든 요소들을 연결문자 기준으로 하나의 문자열로 변환
		//학생명 = [ '유재석','강호동','신동엽']
		// 학생명.join('<->')
		// 유재석 <-> 강호동 <->신동엽
})




// p 345~6


let 현재값			/* input 입력된 데이터를 저장하는 변수*/
let 변환상수 = 10		/* select 에서 선택된 단위별 값 저장하는 변수 */
// 0. HTML 요소 가져오기
const cmiput =document.querySelector('#cmiput');
const cmspan =document.querySelector('#cmspan')
const cmselect = document.querySelector('#cmselect')

//3.
cmselect.addEventListener('change' ,(event)=>{
	const options = event.currentTarget.options
	const index = event.currentTarget.options.seletedIndex
	변환상수 = Number (options[index].value)
	calculate()
})

//2.
const calculate = () => {
	cmspan.textContent = (현재값*변환상수).toFixed(2)
}

// 1. input 입력할때마다 현재값 변수를 입력된 것으로 변환 해주는 이벤트
cmiput.addEventListener('keyup',(event)=>{
	현재값 = Number( event.currentTarget.value)
	calculate()
})




// p. 347
let timer = 0 // 타이머 시간(초) 저장하는 변수/객체
let timerId = 0 // 타이머함수 변수/객체 [setInterval 함수]
const timerinput = document.querySelector('#timerinput')
const timerh1 = document.querySelector('#timerh1')
// 1. 체크박스의 상태가 변경 되었을때
timerinput.addEventListener('change',(event)=>{
	//1. 체크박스의 checked 인지 확인
	if(event.currentTarget.checked){ // 체크가 되어있는 상태
		timerId = setInterval( ()=>{
			timer +=1 // 타이머 시간 변수 1씩 증가
			timerh1.textContent = `${timer}초` // span태그에 변수 출력
			
		} ,1000)
	}else{ //체크가 안되어 있는 상태
		clearInterval( timerId) // 타이머 함수종료 [ clearInterval(타이머객체)]
	}
})


//p 348~349
/*
	tag => 'tag'			복수 querySeletor('h1')
	calss => '.class명' 		복수 querySeletor('.h1class')
	id   => '#id명'     		단일 querySeletor('#h1id')
	name => '[name=name명]'	복수 querySeletor('[name=h1name]')
	
	*식별자
	<h1 id="h1id" class="h1class"  name="h1name">
	*js
	
*/
// 1. HTML 요소
const radios = document.querySelectorAll('[name=pet]')
const output = document.querySelector('#output')
// 2. radios[배열] 반복문
	//배열명.forEach ( ( 반복변수 )=>{ } )
		// 동물목록 = [ 강아지, 고양이 , 햄스터 , 기타]
			/* 1.for ( let i in 동물등록){}
				i= 0  i= 1  i = 2 	i= 3
			   2. 배열명.forEach(( i , j )=> { } )
			   i=강아지 i=고양이 i=햄스터 i=기타
			   3. 배열명 forEach ( ( i , j ) =>{ alert ( i , j ) })
				i= 강아지 i=고양이 i=
			
			*/
radios.forEach( (radio) => {
	
	radio.addEventListener('change' , (event)=>{
		const current = event.currentTarget
		if( current.ckecked){
			output.textContent = `좋아하는 애완동물은 ${current.value}이시군요!`
		} // if end
	}) // event end
 }) // for end










