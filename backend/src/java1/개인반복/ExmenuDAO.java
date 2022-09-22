package java1.개인반복;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java1.가계부.ExpenseDAO;

public class ExmenuDAO {

	
	// private 넣기
	//4
	// C P R
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static ExmenuDAO ado =new ExmenuDAO();
	
	//5 sql연결
	public ExmenuDAO() {
		try {
			con =DriverManager.getConnection(
					"jdbc:mysql:localhost:3306/ggb",
					"root","1234");
		}
		catch (Exception e) {System.out.println("DB오류:"+e);}
	}

	//7 메소드
	public static ExpenseDAO getInstance() {return ado;}
	
}
 
	

	
	