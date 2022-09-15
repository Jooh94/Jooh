package java1.자료정리;

import java.util.Scanner;

public class 단계7 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] list = new String[100][4]; 
		
		while(true) {
				System.out.println("번호\t작성자\t제목");
				for( int i = 0 ; i<list.length ; i++ ) {
					if( list[i][0] != null ) { 
						System.out.print( i +"\t");
						System.out.print( list[i][2]+"\t" );
						System.out.print( list[i][0]+"\n" );
					}
				}
			
			System.out.println("---------- 비회원 게시판 ---------");
			System.out.print(" 1.글쓰기 2.글보기 선택 : ");
			int ch = scanner.nextInt();	
			
			if( ch == 1 ) {
				System.out.print("제목 : ");		String title = scanner.next();
				System.out.print("내용 : ");		String content = scanner.next();
				System.out.print("작성자 : ");	String writer = scanner.next();
				System.out.print("비밀번호 : ");	String password = scanner.next();
			
				for( int i = 0 ; i<100 ; i++ ) {
					if( list[i][0] == null ) { 
						list[i][0] = title; list[i][1] = content;
						list[i][2] = writer; list[i][3] = password;
						break;
					} 
				} 
			}  
			else if ( ch == 2 ) {
				System.out.print("게시물번호 선택 : "); int bnum = scanner.nextInt();
				System.out.println("--------------- 게시물 상세페이지 --------------");
				System.out.println("제목 : " + list[bnum][0] + "      작성자 : " + list[bnum][2] );
				System.out.println("내용 : " + list[bnum][1] );
				System.out.println(" 1.뒤로가기 2.글삭제 3.글수정  선택 : ");
				
				int ch2 = scanner.nextInt();
				if( ch2 == 1 ) {}		// 1입력했을떄 // 아무코드 안넣어도 어차피 if 끝나면 다시 while문 반복실행 -> 11줄 이동 
				else if( ch2 == 2 ) {}	// 2입력했을때 
				else if( ch2 == 3 ) {}	// 3입력했을때 
				else {} 				// 그외 
				
			}
			else {} 
		} // while 문 
	}
}
