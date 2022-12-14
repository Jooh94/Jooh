package java1.ch12스레드;

import java.util.Scanner;

public class EX4_1예제1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean musicstate =false; //음악 재생여부 판단변수
	Music music = new Music(); // 음락 스레스 선언
	
	boolean moviestate = false; // 영화 재생여부 
	Movie movie = new Movie(); // 영화 스레드 선언
	Thread thread = new Thread(movie);
	
	while(true) {
		
		if( musicstate == false) System.out.print("1.음악[재생]");
		else System.out.print("1.음악[중지]");
		
		if (moviestate ==false)System.out.print("2.영화[재생]");
		else System.out.print("2.영화[중지]");
		
		int ch= scanner.nextInt();
		
		if(ch==1 && musicstate == false) {//입력한 값이 1번 이면서 음악이 꺼져있으면
			music.start();				//음악 스레드 실행
			musicstate = true;			// 현재 스레드가 작업 스레드 재생여부 변경
		
		}

		else if ( ch ==1 && musicstate == true ) { // 입력한 값이 1번 이면서 음악스레드가 켜져있으면
			music.setStop(false);	//현재 스레드가 작업 스레드 재생여부 변경	
			musicstate = false;		// 음악 스레드 종료 -> while 종료 -> run메소드 종료 -> 멀티스레드 종료
			music = new Music();	// 새로운 메모리 할당
		}
	
	
		if( ch==2 && moviestate == false) {
			thread.start(); moviestate = true;
		}
		else if ( ch== 2 && moviestate ==true) {
			movie.setStop(false);
			moviestate= false;	thread = new Thread(movie);
		}
	}
	
	
}
}
