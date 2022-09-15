package java1.자료정리;
import java.util.Scanner;

public class 단계5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] list = new String[100][4]; 
		
		// 1. 배열에 있는 모든 정보를 출력 [ 작성된 게시물 출력  ] // 안되는 이유 : 여기에 있으면 1번밖에 실행 안되니까 ~~ 
		
		while(true) {
		
			// *** 2.배열에 있는 모든 정보를 출력 [ 작성된 게시물 출력  ] // 종훈 선택 [ 작성된 글을 입력하면 상단에 표시 해야 되니까 ] 
				// 가능한 이유 : 글 쓰기 전에 모든 글 표시 
			
			// ** 모든 게시물 출력 --> 모든 인덱스 호출하자 --> 조건 : 해당 인덱스 공백 제외하자
				System.out.println("번호\t작성자\t제목");
				for( int i = 0 ; i<list.length ; i++ ) {
					// 1. null 이면 출력한다 [X]  2. null 아니면 출력한다. [ O ]
					if( list[i][0] != null ) { //  공백이 아니면 --> 게시글이 존재하는 뜻 
						System.out.print( i +"\t");
						System.out.print( list[i][2]+"\t" );
						System.out.print( list[i][0]+"\n" );
					}
				}
			
			System.out.println("---------- 비회원 게시판 ---------");
			System.out.print(" 1.글쓰기 2.글보기 선택 : ");
			int ch = scanner.nextInt();	
			
			if( ch == 1 ) {
				// 3. 배열에 있는 모든 정보를 출력 [ 작성된 게시물 출력  ] 
					// 애매한 이유 : 1번을 눌렀을때 했을때만 반복 되는 위치  
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
			else if ( ch == 2 ) {}
			else {} 
			
			// 4. 배열에 있는 모든 정보를 출력 [ 작성된 게시물 출력  ] // 주혁 선택 [ 저장후에 저장된 내용을 출력한다. 위에서 아래로 ] 
				// 애매한 이유 : 글 쓰기 한 후에 모든 글 표시 
		} 
	}
}
