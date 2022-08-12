/*
     함수 : 미리 정의된 코드집합
         alert() prompt() -> js 내장함수
     함수 정의 : 
         function 함수명 ( 매개변수1 , 매개변수2 ~~){
		 	실행코드
		 	return 리턴값
	
	
		}     
   	함수 호출
   		js : 함수명 (매개변수1 , 매개변수2 ~ )
   		html : 이벤트속성 ->
   		    onclick : 클릭했을때
   		    onclick = "함수명 (매개변수1,매개변수2)"
*/
//1. 매개변수x 리턴값x 함수 정의
function 함수1(){ alert('함수1실행')}
//2.매개변수o 리턴값 x 함수 정의
function 함수2 (value){
	alert('함수2실행 매개변수:'+value)
}
//3.매개변수o리턴값o 정의
function 함수3( value1 , velue2){
   alert('함수3실행 매개변수:'+value1+value2)
   return value1 + value2
}
//4.
function 함수( ){
	alert('함수4실행')
	return 10
}

//호출
함수1() //js에서 정의된 함수 호출
함수2(50)// 함수 호출시 매개변수 전달
let result = 함수 ( 3 , 5 ) //2개의 매개변수 전달
let result2 = 함수4( )

// p.204 최소값 구하는 함수
	// min 이름으로 함수 선언하는데 매개변수 array
function min (array){
	let output = array[0] // array에서 0번인덱스 호출해서 output 대입
	for(const item of array){ 
		// 배열에 요소를 하나씩 item에 대입 반복
		   // for (변수 in 배열) : 배열내 인덱스를 하나씩 대입 변환 반복
		   // for (변수 of 배열) : 배열내 요소의값을 하나씩 대입 반복
		if( output > item){ //해당 값이 output보다 작으면
			output = item   // output 해당 값으로 ㄱ체
		} //if e
	} //for e
	return output // 함수가 종료되면서 함수호출했던 곳으로 반환[리턴]
} //f end


const testArray = [52,273,32,103,275,24,57]
console.log(`$(testArray)중에서`) //배열 출력
console.log(`최솟값 =${min(testArray)}`) // 함수 결과를 출력
   //console.log ( ) : js 내장 함수 [콘솔에 메세지를 출력하는 함수]
   