/**
 * 
 */
 
 //p.320
// 1.js <h1> 태그 생성 -> 객체 대입 
 const header = document.createElement(`h1`)
 //2. 텍스트 조작
 
header.textContent = 'js에서 만든 태그'
header.style.color = 'white'
header.style.backgroundColor ='black'
//3. 해당 태그에 하위태그로 객체를 추가
document.body.appendChild(header)

//p.321
	//1. 해당 id의 태그 객체 가져오기
const divA = document.querySelector('#first')
const divB = document.querySelector('#second')
const h1 = document.createElement('h1') // 2.태그(요소만들기)
h1.textContent = '이동하는 h1태그' //3. js만든 태그(요소)에 텍스트넣기

const toFirst = () => {
	 divA.appendChild(h1) // 4.첫번째 div에 js만든 태그 추가
	setTimeout( toSecond,2000)//5. 1초뒤에 다른 함수 [toSecond] 실행
}

const toSecond = () =>{
	divB.appendChild( h1 )
	setTimeout(toFirst,2000) //6.5초뒤 실행
	
}

toFirst()// 5.함수 실행





/*
// 1.기본 함수
function gkatn (  ){
	divB.appendChild(divA)
}



const toSecond = () =>{
	divB.appendChild(divA)
}

//3.타이머함수 ( 함수() , 밀리초(1000/1초) ex 3000=3초)
setTimeout( toSecond , 3000) */


// p.322 객체 제거

const h2 = document.querySelector('h2')



//1. 타이머 함수setTimeout( 함수, 밀리초)
//2. 문서객체.removeChild (자식 객체)
//3. 부모객체 찾기 : 문서객체.parentNode
setTimeout( () =>{
	h2.parentNode.removeChild(h2)
} , 3000) // 3초후 실행되는 코드

const 익명함수 = () => {h2.parentNode.removeChild(h2)}
setTimeout(익명함수,3000)
//3.
function 함수() {
	//h2.parentNode.removeChild(h2)
	document.body.removeChild(h2)
}
setTimeout(함수 , 3000)















