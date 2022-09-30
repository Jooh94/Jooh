package java1.ch10예외처리;

import java.sql.SQLException;
import java.util.Scanner;

public class EX4_실행 {

	public void signup() throws SQLException{
	Dao.getInStance().signup();
		
	}
	public void login() throws SQLException{
		Dao.getInStance().login();
	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		try {
			System.out.println("1.회원가입 2.로그인");
			int ch = scanner.nextInt();
			if( ch==1) signup();
			if ( ch==2) login();
			
		
		}catch (SQLException e) {
			System.out.println("DB 오류"+e);
		}catch (IndexOutOfBoundsException e) {
			System.out.println("숫자만 입력해주세요!");
			scanner= new Scanner(System.in);
		}
		}
		
	}
	
	
}
