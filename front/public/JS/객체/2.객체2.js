/*
	//p.249
	자바스크립트 데이터 를 저장하는 방법
		1.변수/상수
		2. 배열
		*  함수 : 1.매개변수.2미리정의코드3.리턴값
			1.일반함수 : function 함수명( 매개변수~ ){ 코드  return 리턴값}
			2.익명함수 : function ( ) { }
			3.화살표 함수: (매개변수) => 리턴값
			4.[객체메소드]: 함수명 ( ) { }
		3. 객체
		let/const 객체명 = {
			키:값
		 ,  키2:값2 
		 ,  키3:값3
			키4:function (){}		 
}

*/
const pet = {
	name : '구름',
	eat : function( food ){
		alert(this.name + '은/는' + food + '을/를 먹습니다.')
		// this : 자신이 가진 속성 뜻
		// 객체내부 this.키 vs 객체외부 객체명.키
	} //함수 end
}// 객체 end

pet.eat('고기')

// p. 250 속성추가
// 1. 객체 만들기
const student = { } // 비어 있는 개체
//2. 기존에 없는 키 접근 -> 새로운 속성 부여
student.이름 = '윤인성'
student.취미 = '악기'
student.장래희망 = '생명공학자'
// 3. 객체 확인
console.log( student )


// p250 속성 제거
// 1. 객체내 속성 제거 [delete 객체명.키]
delete student.장래희망
// 2. 객체 확인
console.log( student)

//251p

const pet2 ={
	name: '구름',
	eat( food ){ //<!-------eat : function(food)) { }
		alert(this.name+'은/는'+food+'을/를먹습니다.')
	}
}
pet2.eat('밥')


//p.254
const 객체 = {
	name : '혼자 공부하는 파이썬',
	price : 18000,
	punlisher : '한빛미디어'
}

// 2.add[X] 정답 :3
// 3. delete[O] 정답 : 1
// 4. print 메소드 












