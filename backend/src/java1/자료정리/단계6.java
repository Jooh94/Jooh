package java1.자료정리;

import java.util.Scanner;

public class 단계6 {
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
				// 해당 게시물의 모든 정보를 알기 위해 --> 해당 게시물을 선택 
				// 1. 제목[ x = 중복이 있을수 있으니까 ] 
				// 2. 내용[ x = 중복이 있을수 있으니까 ]  
				// 3. 작성자[ x = 한사람이 여러개 글쓰면 식별 불가능 ]
				// 4. 비밀번호[ x = 중복이 있을수 있은까 ] 
				// 5. 게시물번호=인덱스 [ o =  인덱스는 저장되는 순서니까 절대~~~~~~~~~ 중복이 없다 <-- 식별자 써야지 ]
				
				// 식별자인 게시물번호=인덱스=행번호 를 입력받자!!! 
				System.out.print("게시물번호 선택 : "); int bnum = scanner.nextInt();
				
				System.out.println("--------------- 게시물 상세페이지 --------------");
				// 선택된 게시물번호의 정보를 출력해주자 
				System.out.println("제목 : " + list[bnum][0] + "      작성자 : " + list[bnum][2] );
				System.out.println("내용 : " + list[bnum][1] );
				
				System.out.println(" 1.뒤로가기 2.글삭제 3.글수정  선택 : ");
				
			}
			else {} 
		} 
	}
}
