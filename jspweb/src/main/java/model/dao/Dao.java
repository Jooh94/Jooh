package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	Connection con;  // 연결인터페이스  		//db 연동 인터페이스
	PreparedStatement ps;  // sql조작인터페이스//sql조작 인터페이스
	ResultSet rs; // 결과(쿼리)조작			// 쿼리조작 인터페이스
	
	// insert , update , delete ---> rs x 
	// select -> rs o
	
	
	public Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jspweb",
					"root" ,
					"1234");
			System.out.println("DB 연동 성공");
	}catch (Exception e) {System.out.println(e);}
	}
}
