package java1.ch10예외처리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Dao {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static Dao dao = new Dao();
	public static Dao getInStance() {return dao;}
	// public static 이 싱글톤이 아니라 싱글톤을만들기위한 설계도 인가..
	private Dao(){
		try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
				"root","1234");
		}catch (Exception e) {System.out.println(e);}
		}
	//메소드
	public void signup() throws SQLException {
		String sql="";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
	}
	public void login() throws SQLException{
		String sql = "";
		ps = con.prepareStatement(sql);
		ps.executeQuery();
	}
	
}
