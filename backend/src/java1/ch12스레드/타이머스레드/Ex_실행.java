package java1.ch12스레드.타이머스레드;

import java.util.Scanner;

public class Ex_실행 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		Timer timer = new Timer(); //타이머 객체 멀티스레드 선언
		boolean timerstate = false; // 타이머 현재 실행상태 변수
		boolean waitstate= true;
		
		while(true){
		System.out.println("1.타이머시작 2.리셋 3.저장[db]");
		int ch = scan.nextInt();

		if (ch==1 && timerstate == false && waitstate == true) {
			timer.start();timerstate = true;
			}
		
		else if (ch==1 && timerstate == true && waitstate ==true) {
			timer.setWait(false); waitstate= false;
		}
		else if ( ch==1 && timerstate == true && waitstate == false) {
			timer.setWait(true); waitstate= true;
		}
		else if (ch==2) {
			timer.setStop(false);
			timerstate =false; waitstate = true;
			timer = new Timer();}
		
		
		}
	}
}



/* 
 
 멀티스레드
 	1.Thread(이미만들어진 클래스) 클래스 상속
 	2. Runnable 인터페이스 구현
 	
 	* run 메소드 구현
 	* start 메소드로 run 호출
 
 */