package java1.자료정리;

import java.util.Scanner;

public class 단계1 {
	
	//1. 
	public static void main(String[] args) {
	
		//2. 
		Scanner scanner = new Scanner(System.in);
		//3.
		String[][] list = new String[100][4]; // [행=100][열=4] => 400개 
		
		
		System.out.println("---------- 비회원 게시판 ---------");
		System.out.print(" 1.글쓰기 2.글보기 선택 : "); // 입력을 받기전에 알림[메시지] // 1.번호(int) 2.문자(String)
		// --------------------- int 를 입력줘 ~~
		
		int ch = scanner.nextInt();	// nextInt() 인 이유 : 위에서 int 입력하라고 했으니까
		// int 를 입력받았으니 int 상자에 저장[ int 변수 ] 
	}
}
