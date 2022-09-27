package java1.타자연습게임;

import java.util.Scanner;

public class Mainpage {

	private static Mainpage mainp = new Mainpage();
	private Mainpage () {}
	Scanner scanner = new Scanner(System.in);
	MemberController control = new MemberController();
	
	void menu() {
		
		System.out.println("1.회원가입 2.로그인 3.순위보기");
		
		int btn = scanner.nextInt();
		if(btn ==1) {sginup();}
		else if(btn==2) {}
		else if(btn==3) {}
	}
	

	void sginup() {
		System.out.println(" 아이디 : "); String mid =scanner.next();
		System.out.println(" 비밀번호 :"); String pw =scanner.next();
		System.out.println(" 이름 : "); String mname =scanner.next();
		System.out.println(" 닉네임 :"); String mnn = scanner.next();
	}
}