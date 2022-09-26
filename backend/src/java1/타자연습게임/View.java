package java1.타자연습게임;

import java.util.Scanner;

public class View {

	Scanner scanner =new Scanner(System.in);
	Controller control = new Controller();
	
	public static void main(String[] args)
	{View view= new View(); view.menu(); }
	
	void menu() {
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.순위보기");
			int btn = scanner.nextInt();
			if(btn ==1) {create();}
			else if(btn == 2) {}
			else if(btn == 3) {}
		}
	}
	
	void create() {
		System.out.print("아이디 : "); String mid = scanner.next();
		System.out.print("비밀번호 : ");String pw = scanner.next();
		System.out.print("이름 :");String mname = scanner.next();
		System.out.print("닉네임 :");String mnn = scanner.next();
		
		boolean result =control.create(mid,pw,mname,mnn);
		if(result) {System.out.println("회원가입 완료");}
		else {System.out.println("회원가입 실패");}
	
	}
	
	
}
