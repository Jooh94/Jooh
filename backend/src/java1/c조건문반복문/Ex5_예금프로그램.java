package java1.c조건문반복문;

import java.util.Scanner;

//p 161 확인문제7
//1.클래스선언 [자바는 100% 객체지향 <--클래스]
public class Ex5_예금프로그램 { //class s

	//2. main(메인 스레드 내장) 함수 [코드 실행 ]
	public static void main(String[] args) { //main
		
		
		//p.161 확인문제7
		
		boolean run = true; //종료 하는 스위치 (on/off , true/false등 )변수
		int balance = 0 ; //int형 변수 선언 /금액 저장하는 변수
		Scanner scanner = new Scanner(System.in); //입력객체 선언
		// 객체 선언 : 클래스명 변수명 = new 생성자명(매개변수)
		// 객체마다 변수와 메소드(함수) 포함 = 멤버
		// 객체의 멤버호출 ( . ) 접근연산자
		
		while (run) { //while (true/false):true 이면 반복문 실행
			System.out.println("-------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료"); //입력 경우의수 4개
			System.out.println("------------------");
			System.out.print("선택>"); int ch = scanner.nextInt(); 
			if(ch ==1 ) // 1 입력했을경우
			{
				System.out.println("안내) 예금액>"); 
				
				balance += scanner.nextInt();} 
			else if( ch==2 ) 
			{
				System.out.println("안내) 출금액>");
				//잔액부족 [ 경우ㅡ이수 2개 :1.예금액보다 출금액 더 크거나 같으면 /2. 더 자그면]
				int money = scanner.nextInt();
				if(balance<money) {System.out.println("안내)잔액이 부족합니다");}
				else { balance -= money;}
				balance -= scanner.nextInt();}
			else if( ch==3 ) 
			{System.out.println("안내)잔고>"+balance); }
			else if( ch==4 )
			{break;} 
			else {System.out.println("안내)알수 없는 번호 입니다.");} // 그외 입력헀을경우
			
		} //while end
		System.out.println("프로그램 종료");
		
		
	} //main end
	
	
} // class e

/* 
 
			 저장(메모리)
			 1.변수: 데이터 1개 저장할수 있는 메모리공간
			 2.배열:데이터 여러개 저장할수있는 메모리공간
			 3.메소드=함수:코드를 저장 할 수 있는 메모리 공간
			 4.객체:변수,함수 집합소 
			 
			 	ex) 헬스 클래스			사람1 객체			사람2 객체
			 		1.나이				나이 =40			나이=30
			 		2.몸무게				몸무게 = 80		몸무게 =70
			 		3.스쿼드 행동			스쿼드 행동		스쿼드 행동
 
 
 */