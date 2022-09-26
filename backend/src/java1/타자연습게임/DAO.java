package java1.타자연습게임;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {

	
	
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
    private static DAO dao =new DAO();
	public DAO() {
		try {
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test",
				"root","1234");
		
		}
		catch (Exception e) {System.out.println("DB오류:"+e);}
			
	}
	public static DAO getInstance() {return dao;}
    
}
