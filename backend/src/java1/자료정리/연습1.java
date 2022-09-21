package java1.자료정리;

import java.util.Scanner;

public class 연습1 {
		public static void main(String[] args) {
			
		
		Scanner scanner = new Scanner(System.in);
		String [] [] list = new String [100] [4];
		
		while(true) {
			
			System.out.println("번호\t작성자\t제목");
			for( int i = 0; i<list.length; i++ ) {
				if(list[i][0]!=null){
				System.out.print(i+"\t");
				System.out.print(list[i][1]+"\t");
				System.out.print(list[i][1]+"\n");
				}
			}
			
			
			
			
		System.out.println("-----------게시판---------");
		System.out.println("1.글쓰기 2.글보기"); int 번호 = scanner.nextInt();
		if(번호==1) {// 1번 누를때
			System.out.println("제목 :"); String 제목 = scanner.next();
			System.out.println("작성자 :"); String 작성자 =scanner.next();
			System.out.println("내용 :");	String 내용 = scanner.next();
			System.out.println("비밀번호 :"); String 비밀번호 =scanner.next();
			for ( int i = 0 ; i<100; i++) {
				if(list[i][0] == null) {
					list[i][0] =제목;
					list[i][1] =작성자;
					list[i][2] =내용;
					list[i][3] =비밀번호;
					break;
				}
			}
			
			
			
		}
		
		
		
		
		
		else if(번호==2){
			
			System.out.println("게시물번호 선택 :"); int bnum =scanner.nextInt();
			
			System.out.println("---------게시물 상세페이지------");
			System.out.println("제목 :"+ list[bnum][0]+"		작성자 :"+list[bnum][1]);
			System.out.println("내용 :"+ list[bnum][1]);
			
			System.out.println("1.뒤로가기 2.글삭제 3.글수정 선택:");
			
			int ch2 = scanner.nextInt(); //새로운버튼
			if(ch2==1) {}
			else if (ch2 == 2 ) {
			System.out.println("비밀번호 :"); String password = scanner.next();
			
			if (list[bnum][3].equals(password) ) {
				for ( int i = bnum; i<list.length; i++) {
					list[i][0] = list[i+1][0];
					list[i][1] = list[i+1][1];
					list[i][2] = list[i+1][2];
					list[i][3] = list[i+1][3];
					if( list[i+1] ==null) break;
				}
				
			}else {
				System.out.println("안내) 비밀번호가 다릅니다.");
			}
			
			}
			else if (ch2 == 3 ) {
			System.out.println("비밀번호 : "); String password = scanner.next();
			if( list[bnum][3].equals(password)) {
				
				System.out.println("수정할 제목 :");String newtitle =scanner.next();
				System.out.println("수정할 내용 :");String newcontent = scanner.next();
				list[bnum][0]= newtitle;
				list[bnum][1]=newcontent;
			}else {
				System.out.println("안내) 비밀번호가 다릅니다.");
			}
				
				
			}
			else {}
		}
		
		
		
		else {}
		
		
		} // while e
		}//main e
}// class e
