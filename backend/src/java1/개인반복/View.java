package java1.개인반복;

import java.util.Scanner;

public class View {
 //9 메인 화면 스캐너 적용
	Scanner scanner= new Scanner(System.in);
	//20
public static void main(String[] args) {View view = new View(); view.menu();}



	//8
	void menu() {
		while(true) {
		System.out.println("1.추가 2.수정 3.삭제 4.검색 5.통계");
		//10
		int btn = scanner.nextInt();
		if(btn ==1) {create();} //15
		else if(btn==2) {update();}//16
		else if(btn ==3) {delete();}
	}

}
	//11 내용추가 화면 메소드
	void create() {
		//18
		System.out.println("날짜 :"); String eadte =scanner.next();
		System.out.println("금액 :"); int emoney = scanner.nextInt();
		System.out.println("내용 :"); scanner.nextLine(); String ecomment =scanner.nextLine();
		//19
		boolean result =control.create(eadte,emoney,ecomment);
		if(result) {System.out.println("등록성공");}
		else {System.out.println("등록실패");}
	}
	//12 내용 출력화면 메소드
	void read() {}
	//13 내용 수정 화면 메소드
	void update() {}
	//14 내용 삭제 화면 메소드
	void delete() {}
}
