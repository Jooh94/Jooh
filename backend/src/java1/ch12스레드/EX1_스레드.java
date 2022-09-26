package java1.ch12스레드;

import java.awt.Toolkit;

public class EX1_스레드 {

	public static void main(String[] args) {
		// 스레드 : 한가닥실 의미 ( 코드 읽는 하나의 흐름 ]
		// 멀티 스레드 : 코드 읽는 여러개의 흐름
		// main 스레드 : main 함수 안에 장착
		
		
		// 1. 525
		
		Toolkit toolkit =Toolkit.getDefaultToolkit(); // Toolkit : console ui 제공 
		for( int i= 0; i<10; i++) {

		toolkit.beep(); // 비프음 소리 함수 [ 소리 속도보다 반복문이 더 빠르다. ]
		try {
		Thread.sleep(500); // Thread.sleep(밀리초) : 밀리초 만큼 현재 스레드 일시정지
		// 밀리초 : 1000/1초
		// Thread : 현재 스레드
		// .sleep(밀리초) : 스레드 일시정지 [ 무조건 예외처리 발생 ]
		}catch (Exception e) {}
		}
		for( int i = 0; i<5 ; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}
		    catch (Exception e) {}
		}
		System.out.println(" -- 멀티 스레드 시작 --");
		// p.526
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		// main 스레드 생성된스레드 실행후 다음코드 실행
		
		
		for( int i = 0; i<5 ; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}
		    catch (Exception e) {}
		}
		System.out.println("-- 익명 구현 객체 멀티스레드 --");
		//3. p 527 : 익명구현 객체	-1 회용 [ 이름 없으니까 다른곳에 호출 불가능]
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit =Toolkit.getDefaultToolkit(); // Toolkit : console ui 제공 
				for( int i= 0; i<10; i++) {
				toolkit.beep(); 
				try {Thread.sleep(500);}
				catch (Exception e) {}
				}	
			}
		} );
		thread2.start();
		
		for( int i = 0; i<5 ; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}
		    catch (Exception e) {}
		}
		System.out.println("--- Thread 클래스 이용한 멀티스레드 --");
		//4. p.529 : Thead 클래스 객체
		
		BeepThread thread3= new BeepThread();
		thread3.start();
		for( int i = 0; i<5 ; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}
		    catch (Exception e) {}
		}
		
		System.out.println("--- Thread 클래스 이용한 익명자식객체 멀티스레드 --");
		// 5. p 530 : 클래스명 객체명 =new 생상자 () {멤버 재정의}
		Thread thread4 = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit =Toolkit.getDefaultToolkit(); // Toolkit : console ui 제공 
				for( int i= 0; i<10; i++) {
				toolkit.beep(); 
				try {Thread.sleep(500);}
				catch (Exception e) {}
				}	
			}
			
		};
		for( int i = 0; i<5 ; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}
		    catch (Exception e) {}
		}
		
		
		
		return; // main 함수 종료
	}
	
}
/* 
 
 
 
 					[멀티 태스킹]				[멀티 프로세스]
 															--> 프로세스		--> 스레드	[싱글 스레드]
 											
 									프로그램 [ 애플리케이션 ]	--> 프로세스		--> 스레드1	[멀티 스레드]
 																		--> 스레드2
 															--> 프로세스
 														
하드웨어[주기억장치] 	운영체제			프로그램 [ 애플리케이션 ]
 					[스케줄링]			자바					--> 프로세스 		--> MAIN스레드	[싱글스레드]
 					[자바 제어X]		
 															--> 프로세스 		--> MAIN스레드
 																			--> 스레드 1 생성
 																			--> 스레드 2 생성
 					
 					
 									프로그램 [ 애플리케이션 ]
 															
 	운영체제 : 하드웨어 <----중개저-----> 사람
 --------------------------------------------------------------------------------------
 
 멀티스레드 흐름단위
 			[운영체제 메모리 할당 [스케줄링]한 순서대로 처리]
 			1. main 스레드 처리
 			2. 스레드2 처리
 			3. 스레드1 처리
 			4. 스레드2 처리
 			5. main스레드 처리
 							MAIN스레드
				 				|
				 				|-------------스레드 생성1
			스레다2생성------------|				|
				|				|				|
				|				|				|
 				|								|
 				|
 	
 스레드 클래스
 		extends		[상속]
 			A클래스 extends B클래스		:B클래스의 설계된 메모리를 A클래스에게 물려준다.
 										:A클래스는 B클래스의 멤버를 사용할수 있다.
 										:B클래스[부모클래스]A클래스[자식클래스]
										* 상속 1번만 받느다

 		implements	[구현]				:B인터페이스의 추상된 메소드를 A클래스가 구현한다.	
 			A클래스	implements B인터페이스	:B인터페이스 메소드를 구현해주는 A클래스
 			
 			
 		인터페이스란?		서로 다른 클래스[설계]들을 [*]동일한 목적하의 조작
 				LG 클래스
 				
 				삼성 클래스					리모콘[인터페이스]
 				
 				롯데 클래스
 		
 		[작업스레드 생성준비]
 		1.run메소드 구현 --> 2.start메소드 실행
 		1. 작업스레드 인터페이스 /클래스 선택기준
 				1.extends vs implements : 상속1번 vs 구현 여러번
 				2. 익명 사용여부 : 작업스레드정의 1번 vs 작업스레드 정의 여러번
 				
 		1.Runnable 클래스
 				-1.구현객체
 						--구현클래스
 						CLASS 구현클래스 implements Runnable{ run(스레드가 실행할코드);}
 				Runnable 구현객체 = new 구현클래스();
 				Thread 객체명 = new Thread(run구현객체);
 				객체명.start();
 				
 				-2.익명구현객체
 				Thread 객체명 = new Thread( new Runnable(){run(스레드가 실행할코드)};
 				객체명.start();
 		
 		2. Thread 클래스
 				-3.
 						하위클래스
 						CLASS 하위클래스 extends Thread{ run(스레드가 실행할코드);}
 					
 					하위클래스 객체명=new 하위클래스();
 					객체명.start();
 				
 				-4.익명 자식 객체
 				Thread 객체명 = new Thread(){ run(스레드가 실행칼코드);};
 				객체명.start();
 -- 스레드 메소드
 			
 			1.run()				:멀티작업할 코드
 			2.start()			:run 메소드 실행
 			3.	
 				setname()("새로운스레드이름")	: 스레드 이름 정의하기(생략시 Thread-X] 
 				getname()					: 스레드 이름 호출
 -- 동기화 [ synchronized]
 		1. 여러개의 스레드가 동일한 객체를 사용할때 대기상태[들어온 순서대로 처리]
 				*싱글스레드에서 X
 		2. 컬렉션 프레임워크
 				ArrayList	:동기화x - 싱글스레드용
 				Vector		:동기화o - 멀티스레드용
 				
 				HshMap		:동기화X - 싱글스레드용
 				HashTable	:동기화O - 멀티스레드용
 
 
 */