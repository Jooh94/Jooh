package java1.자료정리;

import java.util.Scanner;

import org.w3c.dom.css.CSSUnknownRule;

public class 연습3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String [] [] list = new String [100][4];
		
		
		while(true) {
		
		System.out.println("번호\t작성자\t제목");
		for( int i = 0 ; i<list.length; i++) {
			System.out.print(i+"\t");{
			System.out.print(list[2]+"\t");
			System.out.print(list[0]+"\n");
		}
		}
			System.out.println("비회원 게시판");
			System.out.println("1.글쓰기 2.글보기");
		int ch = scanner.nextInt();
			if(ch==1) {
			System.out.println("제목 :"); String title = scanner.next();
			System.out.println("내용 :"); String content = scanner.next();
			System.out.println("작성자 :"); String writer = scanner.next();
			System.out.println("비밀번호 : "); String password = scanner.next();
				for(int i = 0 ; i<100; i++) {
					if(list[i][0]==null) {
						list[i][0] = title;
						list[i][1] = content;
						list[i][2] = writer;
						list[i][3] = password;
						break;
					}
					}
			}
			else if (ch==2){
				System.out.println("게시물 번호 선택 :"); int bnum = scanner.nextInt();
				System.out.println("상세페이지 --");
				System.out.println("제목 :     "+list[0]+"           작성자"+list[2]);
				System.out.println("내용 : "+list[1]);
				System.out.println("1.뒤로가기 2.삭제하기 3.수정하기"); int  ch2 = scanner.nextInt();
				
				if(ch2 ==1) {}
				else if (ch ==2) {
				System.out.println("비밀번호 :"); String password = scanner.next();
				if( list[bnum][3].equals(password)) {
					for(int i = bnum ; i <list.length; i++) {
						list[i][0] = list[i+1][0];
						list[i][1] = list[i+1][1];
						list[i][2] = list[i+1][2];
						list[i][3] = list[i+1][3];
						if(list[i+1]==null)break;
					}
				}else {
					System.out.println("안내) 비밀번호가 다릅니다.");
				}
					
				}
				else if (ch ==3) {
					System.out.println("비밀번호 :"); String password = scanner.next();
					if (list[bnum][3].equals(password)) {
						System.out.println("수정할 제목 :"); String newtitle =scanner.next();
						System.out.println("수정할 내용 :"); String newcontent=scanner.next();
						list[bnum][0] =newtitle;
						list[bnum][1] = newcontent;
						
						
					}else {
						System.out.println("안내) 비밀번호가 다릅니다");
				}
					
				}
				else {}
				
				
			}
			else {}
			
			
		} // w e
	}
}
