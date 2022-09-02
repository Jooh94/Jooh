package java1.c조건문반복문;

import java.util.Scanner;

public class Ex0_연습 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. 구구단
		/*
		단 : 2부터 9까지 1씩 증가 -> 8번
		곱 : 1부터 9까지 1씩 증가 -> 9번
		-- 단 1번 당 곱은 모두(9번) 실행 -- 단 마다 곱은 9개 존재 -- 단 이 곱을 포함 하고 있다.
	*/
	int 실행횟수 = 0 ;
	for ( int 단= 2; 단<=9 ; 단 ++) { //단 2~9 [ 8회 ]
		// 단 2부터 9까지 1씩 증가
		for( int 곱 = 1 ; 곱<=9 ; 곱++) { // 곱 1~9 [ 9회] 단 1회마다 곱 모두 9회 실행
			System.out.printf("%2d X %2d= %2d\n" , 단 , 곱 ,(단*곱));
			실행횟수++;
		} // for 문
	} //for문
	System.out.println("총 반복횟수"+ 실행횟수); //72회
	
	
	//2. 무한루프 =무한루프
	//for( int y = 0 ; true ; y++) {
	//	System.out.println("실행");
	//}

	System.out.print("문제3) 정수1 입력: "); int 문제3_1 = scanner.nextInt();
	System.out.print("문제3) 정수2 입력: "); int 문제3_2 = scanner.nextInt();
	System.out.print("문제3) 정수3 입력: "); int 문제3_3 = scanner.nextInt();
	if( 문제3_1 > 문제3_2 ) { int temp = 문제3_1; 문제3_1 = 문제3_2; 문제3_2 = temp; }
	if( 문제3_1 > 문제3_3 ) { int temp = 문제3_1; 문제3_1 = 문제3_3; 문제3_3 = temp; }
	if( 문제3_2 > 문제3_3 ) { int temp = 문제3_2; 문제3_2 = 문제3_3; 문제3_3 = temp; }
	
	System.out.println( 문제3_1 +" "+ 문제3_2 +" "+ 문제3_3 );  // 출력방식 1 
	
	// 문제4 : 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력 
	System.out.print("문제1)정수1 입력:"); int 문제4 = scanner.nextInt();
	if(문제4>=90) {System.out.println("합격");}
	else{System.out.println("불합격");}
	
		
	}

}
