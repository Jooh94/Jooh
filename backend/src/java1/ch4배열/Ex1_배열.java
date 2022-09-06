package java1.ch4배열;

public class Ex1_배열 {

	public static void main(String[] args) {
		//예) p.183
	// 1. 배열 선언
	int[] scores = { 83 , 90 , 87 }; // int 형 배열 선언 , 3개 값 초기화
	// 2. 배열 호출
	System.out.println("배열[0]:"+scores[0]); // 배열내 0번 인덱스 호출
 	System.out.println("배열[1]:"+scores[1]); //배열내 1번 인덱스 호출 
 	System.out.println("배열[2]:"+scores[2]); 
 	System.out.println("배열:"+scores);  // 배열명 주소[번지] 호출 -> 
 	// 3. 배열 반복문 활용
 	int sum = 0 ;
 	for( int i = 0 ; i <scores.length; i++) { // i는 0부터 배열의길이 미만 까지 1씩ㅈ ㅡㅇ가
 		sum += scores[i]; // i번째 인덱스의 값 호출해서 sum변수에 누적 더하기
 		
 	}// for end
 	System.out.println("총합:"+sum);
 	System.out.println("평균:"+(sum/3)); 
 				// 1. sum/3 	-> int/int -> int
 				// 2. sum/3.0 	-> int/double -> double
	
 	
 	//1. new 연산자를 이용한 선언
 	int [] 배열 = new int[3]; // new 연산자를 이용한 선언 // int형 3개를 저장할수 있는 배열
 	// 2. for문 배열내 모든 인덱스 호출
 	for ( int i = 0; i<배열.length ; i++) {
 		System.out.println(배열[i]);
 	}
 	
 	//3. 배열내 각 인덱스의 데이터넣기
 	배열[0] = 100;  배열[1] =93; 	배열[2]= 20;
	
 	
 	//4. for문 배열내 모든 인덱스 호출
 	for( int i = 0 ; i<배열.length ; i++) {
 		System.out.println(배열[i]);
 	}
 	
 	//5. 향상된 for문
 	for( int value : 배열) {
 		// for (반복변수 : 배열명 )
 		// 배열내 첫번째 인덱스부터 마지막인덱스까지 반복변수에
 		System.out.println(value);
 	}
 	
 	
	}//main
	
} //class

/*
  변수 : 데이터 1개 저장
  배열
  		1.* 같은타입 [ 자료형 클래스]의 데이를 연속된 공간에 나열
  		2. 인덱스 : 저장되는 순서번호
  		3. [ ]
  		4. 제공받은 메소드 X [js] push , splice
 
  		배열선언
  			1. 타입[] 배열명; 2. 타입 배열명[] ;
  		배열 생성
  			1. 타입[] 배열명 =  {값0 , 값1 , 값2, 값3~~} : 배열선언과 동시에 값 대입
  				* 배열에 미리 값 넣을때
  			2. 타입[] 배열명 = new 타입 [ 길이 ]			: 배열의 길이만큼 선언[ 값 ]
 				* 배열의 길이를 미리 설정할때				정수 : 0 실수:0.0 클래스:null
 		배열 호출
 			배열명 : 배열의 메모리 주소(번지)
			1. 배열명[인덱스번호]
		특정 인덱스의 데이터 변경[대입/수정]
			1. 배열명[인덱스번호] =새로운 데이터
		배열 길이
			배열명.length : 배열의 길이
		반복문 활용
			for(자료형 변수명 :배열명{
			}
			
			199p.
			배열선언
				* 같은 타입의 데이터를 연속된 공간에 나열[하나의배열에 int,double 같이 저장불가
				* 인덱스[0번시작~]사용
				1. 타입[]배열명={값 , 값2, 값3}		 : 같은 타입의 데이터를 {} 에 작성
					int[] 배열명= {123}
				
				2. 타입[] 배열명 = new 타입[길이]		 : 해당 타입을 길이 만큼 저장 가능한 배열
				
				int[] qodufaud = new int [3]	 :int 형 변수3개를 저장 할수 있는 배열 선언
				double[] 배열명 = new double[5]	 : double 형 변수 5개를 저장할수 있는 배열 선언
				String[]배열명 =new String[10]     :String 객체 10개를 저장할수 있는 배열 선언
			배열길이
				배열명.length		:배열의 길이[항목개수]
			배열내 항목 사용	
				1.호출 		: 배열명[인덱스]
				2.대입/수정 	: 배열명[인덱스] =새로운 값
				3.삭제 		: 배열명[인덱스] =NULL 혹은 0 혹은 0.0 혹은 false [p.183 배열초기값] 
			배열과 for 문 활용
				
				모든 배열내 항목 호출
				1.
						for(int i = 0 ; i<=배열.length; i++{
								배열[i];
						}
				2.		for (타입 변수명:배열) {			//*변수의 타입은 배열의 타입과 동일
								변수명
						}
				
				
				
				
				
				
*/