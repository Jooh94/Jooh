package java1.Ch5클래스.EX7_비회원제게시판;

import java.util.Scanner;

import javax.swing.border.Border;

public class EX7실행 {
public static void main(String[] args) {
	
		// 0.메모리
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100]; // Board 객체 100개를 저장 할 수 있는 배열 선언
		
		while(true) {
			
			//모든 게시물 [ 배열] 출력
			System.out.println("----------비회원 게시판-------");
			System.out.println("번호\t작성자\t제목");
				//1.
		//	for( int index =0 ; index<boardlist.length ; index++) {
			//	System.out.printf("%d\t%s\t%s",index,boardlist[index].writer,boardlist[index].title);
		//	}
				//2.
			int num = 0;
			for( Board temp : boardlist) { // 배열에 객체를 하나씩 temp 객체에 반복 대입
				num++;
				if( temp != null) System.out.printf("%d \t %s \t %s \n", num ,temp.writer , temp.title);
				//만일 객체가 존재하면 출력
			}
			System.out.println("--------------------------");
			System.out.println("1.글쓰기 2.글보기 선택 :");
			int ch =scanner.nextInt();	//출력 -> 입력(int) -> 저장 (int) -> 제어(if)
			///////////////////////1번을 입력했을때 실행되는 구역/////////////////////
			if(ch==1) {
				//1.출력[안내] -> // .입력 -> 저장
				scanner.nextLine();
				System.out.println("제목 : "); String title = scanner.next();
				System.out.println("내용 : "); String content = scanner.next();
				System.out.println("작성자 : "); String writer = scanner.next();
				System.out.println("비밀번호 : "); String password =scanner.next();
				//2. 저장된 변수 4개를 하나의 객체로 만들기 [ 4개변수를 묶음 -> 편하기]
				//Board regist = new Board();
					
				Board regist = new Board(title, content, writer, password,0);
				//객체선언 : 클래스명 변수명 = new 생성자 (매개변수 순서대로);
				
				//3.배열에 객체 저장 [ 빈 공간을 찾아서 빈 공간에 저장]
				for(int index = 0 ; index <boardlist.length; index++) {
					if( boardlist[index]==null) { // 만일 해당 인덱스에 객체가 없으면
						boardlist[index]= regist;
						System.out.println("안내]글 등록이 되었습니다");
						break;
						
					
					} // if end
											
				} //for end
			
			} //if end
			///////////////////////////////////////////////////////////////////
			else if (ch==2) {
				// 게시물번호 --> 인덱스 -->
				System.out.println("안내) 이동할 게시물 번호 : ");
				int select = scanner.nextInt();
				Board board = boardlist[select]; //입력된 번호[인덱스]의 객체 호출
				
				System.out.println("----------"+select+"번 게시물 상세페이지------------");
				System.out.print("작성자 :"+board.writer);
				System.out.println("\t제목 : "+ board.title);
				System.out.println("내용 :"+ board.content);
				System.out.println("----------------------------");
				System.out.print("1.목록보기 2.삭제 3.수정 선택 : ");
				int ch2 = scanner.nextInt();
				if ( ch2 == 1) { } // 생략시 while 재반복
				else if ( ch2 == 2) {
					System.out.print("안내) 비밀번호 : "); String password = scanner.next();
					if( board.password.equals(password) ) {
						// 만일 현재게시물의 비밀번호 와 입력받은 비밀번화 같으면[equals]
							
							//한칸씩 당기기 [삭제된 인덱스 뒤로 ]
							for ( int index = select ; index<boardlist.length ; index++) {
								// 현재 보고 있는 게시물의 인덱스 부터 마지막 인덱스까지 1씩증가
								boardlist[index] =boardlist[index+1]; // 객체를 한칸씩 앞으로 당기기
								if (boardlist[index+1] == null) {break;} // 다음 객체가 null 임ㄴ
							} // for end
					}//if end
					else {System.out.println("안내)패스워드가 다릅니다.");}
				}// else if end
				else if ( ch2 == 3) {
					System.out.println("안내) 비밀번호 :"); String password = scanner.next();
					if (board.password.equals(password)) {
						System.out.print("수정할 제목 : "); boardlist[select].title =scanner.nextLine();
						System.out.print("수정할 내용 : "); boardlist[select].content =scanner.nextLine();
						System.out.println("안내)수정 처리 했습니다.");
						
					} //if end
				
				else {System.out.println("안내)패스워드가 다릅니다.");}
				
			} // else if end
			else {System.out.println("안내) 알수 없는 번호입니다.");}
		
			} //else if end
			else {System.out.println("안내) 알수 없는 번호 입니다.");}
		
		} // while end
	
	} // main end
} // class end








/*
 	설계[메모리]
 		1.제목 2.내용 3.작성자 4.비밀번호
 		선택지 : 1. 2차원배열 2.클래스->객체->1차원배열
 	클래스 설계
 		클래스 멤버 : 필드 ,생성자 , 메소드 
 		1. 필드 : 메모리 저장
 			1.문자열 제목
 			2.문자열 내용
 			3.문자열 작성자
 			4.정수열 비밀번호 
 			5.정수열 조회수
 		2. 생성자 
 			1.빈[매개변수가 없는]생성자
 			2.플[모든 매개변수가 있는]생성자
 			3.게시물 쓰기 생성자
 			4.게시물 조회 생성자
 			
 			2022 .9 .13
 	System 클래스
 			1.시스템 클래스 [운영체제 관련된 메소드 제공]
 				1.System.out		:출력 필드 [console 화면 ]
 				2.System.in			:입력 필드 [키보드]
 	
 	Scanner 클래스
 		1.객체 선언[키보드에 입력된 바이트열을 객체에 저장]
 				-Scanner 변수명 = new Scanner( System.in);
 		2.객체에서 데이터 가져오기
 				변수명.next():객체에 저장된 바이트열을 String 호출	  [띄어쓰기 불가능]
 				변수명.nextLine():객체에 저장된 바이트열을 String 호출 [띄어쓰기 가능]
 					-문제점: nextLine() 앞에 또 다른 next~()있을경우 하나로 취급
 					-해결점:앞에 변수명.nextLine()추가
 				변수명.nexInt()	: 객체에 저장된 바이트열을 int형 호출
 				변수명.nextDouble() : 객체에 저장된 바이트열을 double형 호출
 		* 입력후 저장[변수]
 				String 문자열 = 변수명.next()
 				int 정수 = 변수명.nextint()
 			
 			
 			
 			
 			
 			
 			
 			
 			
 			
 */