package java1.c조건문반복문; //패키지명

// 1. 클래스 선언
public class Ex1_If { //class s

	// 2. main() : 코드를 읽어주는 메소드
	public static void main(String[] args) { //main s
		
		//예1 : 참 실행문이 1개 일때는 중괄호 생략 가능
		if( 3 > 1) {System.out.println("예1) 3이 1보다 크다");}
		//예2 : 조건이 true 이면 실행 아니면 실행x
		if(3 > 5) System.out.println("예2) 3이 5보다 크다"); //조건이 false 이기때문에 실행불가능
		
		//예3 p.136) : [ 예상 : 점수가 93점이기때문에 첫번째 if만 실행 ]
		int score = 93; // 점수 변수
		if(score >= 90) { //실행문 (;) 2개이상이면ㄴ { } 으로 묶음
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} // IF end
		if(score<90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다"); // if와 상관없이 출력 중괄호 안할시 
		 //if end
		
			
		//p.137
		int score2 = 85;
			// 변수선언시 : 중복이름 불가능
		if( score2 >=90) {
			System.out.println("예제4)점수가 90보다 큽니다.");
			System.out.println("예제4)등급은 A입니다.");
		} // if end
		else { // 위조건에서 false 이면 실행
			System.out.println("예제4)점수가 90보다 작습니다.");
			System.out.println("예제4)등급은 B등급입니다.");
		}// else end
		
		
		//예제5) p.138 조건이 다수일때 1.if~elseif (하나의 true) 2.(다수의 true) if다중
		int score3 = 75;
		
		if( score3>=90)    {System.out.println("점수가 100~90입니다."); System.out.println("등급은 A등급입니다"); }
		else if( score3>=80){System.out.println("점수가 80~89입니다."); System.out.println("등급은 B등급입니다"); }
		else if (score3>=70){System.out.println("점수가 70~79입니다."); System.out.println("등급은 C등급입니다"); }
		else { System.out.println("점수가 70미만입니다"); System.out.println("등급은 D입니다.");}
		//vs
		
		if( score3 >=90) {System.out.println("점수가 100~90입니다."); System.out.println("등급은 A입니다");}
		if( score3 >=80) {System.out.println("점수가 100~90입니다."); System.out.println("등급은 B입니다");}
		if( score3 >=70) {System.out.println("점수가 100~90입니다."); System.out.println("등급은 C입니다");}
		if( score3 <70) {System.out.println("점수가 100~90입니다."); System.out.println("등급은 D입니다");}
		
		// 예제6 if 중첩
		int score4 = 95; char 성별 = 'M';
		if( score4 == 100) {
			if(성별 =='M') {System.out.println("100점 이면서 남자이다");}
			else { System.out.println("100점 이면서 여자이다.");}
			
		}else {
			if(성별 == 'F') {System.out.println("100점 아니면서 여자이다.");}
			else {System.out.println("100점 아니면서 남자이다.");}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main e

} //class e
/* 
 	IF 문 : 조건식의 결과에 따라 블록 실행 여부 결정
 		if( 조건식 ) { 조건이 true  }
 		- 조건식 : true / false / 비교연산자 / 논리연산자 /
 		if 형태
 			1.
 				if (조건) 참					: 참[true] 위치에 실행문[ ; ]이 1개 이면 { } 생략 가능 
 			2.
 				if (조건) {참}				: 참[true] 위치에 실행문[ ; ]이 2개 이상 일때 
 			3. 
 				if(조건) {참}
 				else{거짓}
 			4.
 				if( 조건 ) { 참 }
 				else if (조건2 ) { 참2 }
 				else if (조건3   [ 참3 }
 				else {거짓}
 			5.
 				if( 조건 ) { 
 					if ( 조건 ) {
 					
 					}else{
 						거짓
 					}
 				}
 
 
 */