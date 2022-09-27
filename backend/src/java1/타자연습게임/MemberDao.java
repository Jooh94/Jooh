package java1.타자연습게임;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static MemberDao dao =new MemberDao();
	
	
	
	
	public MemberDao() {
		try {
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/typing_game",
				"root","1234");
		
		}
		catch (Exception e) {System.out.println("DB오류:"+e);}		
		
	}

	public static MemberDao getInstance() {return dao;}
	
	


	
}
