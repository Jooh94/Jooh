package java1.자료정리;

import java.util.Scanner;

public class 비회원게시판 {
 public static void main(String[] args) {
	
	 
	 Scanner scanner = new Scanner(System.in);
	 String [][]  list = new String [100][4];
	 while(true) {
	 		System.out.println("게시판");
	 		System.out.println("1.글쓰기 2.글보기"); int 버튼 = scanner.nextInt();
	 
	 		if(버튼==1) { //1버튼 누를때
	 			System.out.println("제목 :"); String 제목 = scanner.next(); 
	 			System.out.println("작성자 :"); String 작성자 = scanner.next();
	 			System.out.println("내용 :");		String 내용 = scanner.next();
	 			System.out.println("비밀번호 :"); String 비밀번호 =scanner.next();
	 			
	 		} // if e

	 
	 
	 } // while e
} // main e
} // class e
