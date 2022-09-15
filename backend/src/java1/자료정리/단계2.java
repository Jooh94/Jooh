package java1.자료정리;

import java.util.Scanner;

public class 단계2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] list = new String[100][4]; 
		
		while(true) { // 무한루프
			
			System.out.println("---------- 비회원 게시판 ---------");
			System.out.print(" 1.글쓰기 2.글보기 선택 : ");
			int ch = scanner.nextInt();	
			
			// 경우의수 : 1 혹은 2 눌렀을때 
			if( ch == 1 ) {} // 1눌렀을때 
			else if ( ch == 2 ) {} // 2눌렀을때 
			else {} // 그외 
			
		} //  w end 
	}
}
