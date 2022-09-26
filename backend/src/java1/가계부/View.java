package java1.가계부;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
	//9 스캐너
	Scanner scanner = new Scanner(System.in);
	Controller control =new Controller(); //19-1 메소드 호출
	//20
	public static void main(String[] args)
	{ View view =new View(); view.menu();}
	//8 
	void menu() {
		
		while(true) {
			read(); //28 read(); 함수 올려받은거 입력 이거 리턴으로 다시올라온건지 물어보기
			System.out.println("1.추가 2.수정 3.삭제 4.검색 5.통계");
			//10
			int btn = scanner.nextInt();
			if(btn ==1) {create();} //15
			else if(btn==2) {update();}//16
			else if(btn ==3) {delete();}//17
		}
	}
	//11 내용추가 화면 메소드 
	void create() {
		//18
		System.out.print("날짜 :"); String edate = scanner.next();
		System.out.print("금액 :"); int emoney = scanner.nextInt();
		System.out.print("내용 :"); scanner.nextLine(); String ecomment = scanner.nextLine();
		
		//19
		boolean result = control.create(edate ,emoney ,ecomment);
		if(result) {System.out.println("등록성공");}
		else {System.out.println("등록실패");}
	
	}
	//12 내용 출력화면 메소드
	//28-1 read 만 28-1임 read함수 올리기
	void read() {
		//27
		ArrayList<ExpenseDTO> list =control.read();
		System.out.println("번호\t날짜\t\t금액\t내용");
		for (ExpenseDTO dto : list ) { // list에서 dto 하나씩 꺼내오기
			// for ( 타입파라미터 임시변수 : 리스트/배열){}
		System.out.print(dto.getEno()+"\t");
		System.out.print(dto.getEdate()+"\t");
		System.out.print(dto.getEmoney()+"\t");
		System.out.print(dto.getEcomment()+"\n");
		}
	}
	//13 내용 수정 화면 메소드
	void update() {
		//31
		System.out.print(" 수정할 번호 :"); int eno = scanner.nextInt();
		System.out.print(" 수정할 날짜 :"); String edate = scanner.next();
		System.out.print(" 수정할 금액 :"); int emoney = scanner.nextInt();
		System.out.print(" 수정할 내용 :"); scanner.nextLine(); String ecomment = scanner.nextLine();
		//34
		boolean result
			=control.update( eno, edate, emoney, ecomment);
		if(result) {System.out.println("수정성공");}
		else {System.out.println("수정실패");}
	}
	//14 내용 삭제 화면 메소드
	void delete() {
		//29							
		System.out.println("삭제할 번호 : ");
		int eno =scanner.nextInt();
		boolean result = control.delete(eno);
		if( result) {System.out.println("삭제성공");}
		else {System.out.println("삭제실패[삭제할 번호 없다 or db오류");}

	}
	
	
	
	
}
