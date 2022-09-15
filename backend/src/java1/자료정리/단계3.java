package java1.자료정리;

import java.util.Scanner;

public class 단계3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] list = new String[100][4]; 
		
		while(true) {
			
			System.out.println("---------- 비회원 게시판 ---------");
			System.out.print(" 1.글쓰기 2.글보기 선택 : ");
			int ch = scanner.nextInt();	
			
			if( ch == 1 ) {
				// 1. 출력[print] : 안내( 뭐를 입력해야 되는지 안내 ) -> 입력[scanner] ( 뭐를 입력받을껀지 선택 ) -> 저장[ 변수 ]
				System.out.print("제목 : ");		String title = scanner.next();
				System.out.print("내용 : ");		String content = scanner.next();
				System.out.print("작성자 : ");	String writer = scanner.next();
				System.out.print("비밀번호 : ");	String password = scanner.next();
			}  
			else if ( ch == 2 ) {}
			else {} 
			
		} 
	}
}
