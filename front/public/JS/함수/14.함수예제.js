//p.203
function isLeapYear (year) {
	
	return(year%4==0) && (year%100 !=0) ||(year%400 == 0)
}
         // 변수/함수 와 문자열 같이 출력하는 방법
         // 1. '문자열' + 변수명
         // 2. ` 문자열 $(변수명/함수())`


console.log(`2020년은 윤년일까?===${isLeapYear(2020)}`)
console.log(`2020년은 윤년일까?===${isLeapYear(2010)}`)
console.log(`2020년은 윤년일까?===${isLeapYear(2020)}`)
console.log(`2020년은 윤년일까?===${isLeapYear(2020)}`)
function 윤년버튼함수 ( ){

 alert('버튼이 눌렸다.')
   //윤년버튼함수 라는 함수명으로 매개변수가 없는 함수
 let 연도 = Number ( prompt('연도를 입력 :'))
 let 결과 = isLeapYear( 연도 ) // 함수 호출 : 함수명(매개변수)
 document.getEIementbyId('resuItbox').innerHTML = '결과:'+결과
 // document : 문서(html)
  // get : 가져오기
     // EIement: 요소(태그)
     // Id: 식별자이름
}