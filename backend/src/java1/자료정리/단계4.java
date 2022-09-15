package java1.자료정리;

import java.util.Scanner;

public class 단계4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] list = new String[100][4]; 
		
		while(true) {
			
			System.out.println("---------- 비회원 게시판 ---------");
			System.out.print(" 1.글쓰기 2.글보기 선택 : ");
			int ch = scanner.nextInt();	
			
			if( ch == 1 ) {
				System.out.print("제목 : ");		String title = scanner.next();
				System.out.print("내용 : ");		String content = scanner.next();
				System.out.print("작성자 : ");	String writer = scanner.next();
				System.out.print("비밀번호 : ");	String password = scanner.next();
				// 게시물 한개당 변수4개를 입력받았다..
				// 근데 게시물이 100개 이면 변수는 400개이네???? 관리 어렵다.. 아 ~ 배열쓰자
				// 그럼 저 4개의 변수를 2차원 배열에 옮기자
				/*		[100][4]
				  					열 
				  			 t   c   w   p
				  			[ ] [ ] [ ] [ ] 	행		첫번재 게시물		0
				  			[ ] [ ] [ ] [ ] 			두번째 게시물 		1
				  			[ ] [ ] [ ] [ ] 			세번째 게시물		2
				  			[ ] [ ] [ ] [ ] 			네번째 게시물		3
				  				~~~~~~ 
				  			[ ] [ ] [ ] [ ]				100번째 게시물  	99
				 */
				// 4개의 변수를 배열에 저장할껀데 비어 있는 게시물 행 찾아야 한다.
				// 배열이 비어있다는 뜻은 null  [ 배열를 선언하고 데이터 을 안넣어주면 기본적으로 null 들어가 있다. ]
				// * 배열에 모든 행의 인덱스를 출력해서 null 찾자
					// 모든 행의 인덱스 : 0~99 -> 0부터 99까지의 변수를 반복하자 
				for( int i = 0 ; i<100 ; i++ ) {
					// i를 0부터 99까지 1씩 증가 
					if( list[i][0] == null ) { // 해당 i번째 행=인덱스 이 공백이면 
						list[i][0] = title; list[i][1] = content;
						list[i][2] = writer; list[i][3] = password;
						break; // 저장했으면 for문 끝내기 -> 한개만 저장할려고 
					} // if end 
				} // for end 
			}  
			else if ( ch == 2 ) {}
			else {} 
			
		} 
	}
}
