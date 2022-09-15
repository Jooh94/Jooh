package java1.자료정리;

import java.util.Scanner;

public class 단계8 {
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
				if( ch2 == 1 ) {}		
				else if( ch2 == 2 ) {
					// 삭제할 게시물번호 = 이미 위에 받았다 = bnum 변수 
					// 삭제할 게시물의 비밀번호 = 비밀번호 동일하면 삭제 진행 
					
					// 해당 게시물부터 한칸씩 당기기 
						/*
						  [ 유재석 ]  [ 강호동 ] [ 신동엽 ] [ 하하 ] [ 서장훈 ]  [ null ]
						     0          1         2       3        4         5
						     		  
						     상황 : 강호동 삭제 하기 
						     		1. 강호동이 있던 자리에 신동엽 대입하자 
						     			강호동 = 신동엽 		
						     			 [ 유재석 ]  [ 신동엽 ] [ 신동엽 ] [ 하하 ] [ 서장훈 ]  [ null ]
						     		2. 신동엽 자리에 하하 대입하자 
						     			신동엽 = 하하 			
						     			[ 유재석 ]  [ 신동엽 ] [ 하하 ] [ 하하 ] [ 서장훈 ]  [ null ]
						     		3. 하하 자리에 서장훈 대입하자 
						     			하하 = 서장훈 
						     			[ 유재석 ]  [ 신동엽 ] [ 하하 ] [ 서장훈 ] [ 서장훈 ]  [ null ]
						     		4. 서장훈 자리에 null 대입하자 
						     			서장훈 = null
						     			[ 유재석 ]  [ 신동엽 ] [ 하하 ] [ 서장훈 ] [ null ]  [ null ]
						     		5. 다음 자리가 null 이면 그만하자 
						 */

					System.out.println("비밀번호 : "); String password = scanner.next();
					
					if( list[bnum][3] .equals(password) ) { // 만약에 해당 게시물의 비밀번호와 같으면 삭제 진행 
						for( int i = bnum ; i<list.length ; i++ ) {
							list[i][0] = list[i+1][0];		// 제목 = 다음 행의 제목 
							list[i][1] = list[i+1][1];		// 내용 = 다음 행의 내용 
							list[i][2] = list[i+1][2];		// 작성자 = 다음 행의 작성자 
							list[i][3] = list[i+1][3];		// 비밀번호 = 다음 행의 비밀번호 
							if( list[i+1][0] == null ) break; // 다음 행에 제목이 존재하지 않으면 반복종료 
						}
					}else {
						System.out.println(" 안내) 비밀번호가 다릅니다. ");
					}
				}	
				else if( ch2 == 3 ) {
					
				}	
				else {} 				
				
			}
			else {} 
		} // while 문 
	}
}
