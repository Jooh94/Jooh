package java1.EX19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AdminDAO {
	//1.필드
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static AdminDAO adao = new AdminDAO();
	
	//2. 생성자
	private AdminDAO() {
		try {
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mmth","root","1234");
		}catch (Exception e) {System.out.println("경고"+e);}
	}
	// 3. 메소드
		// 1. 외부에서 싱글톤 객체를호출하는 메소드 [ getInstance
	public static AdminDAO getInstance() {return adao;}
	
	//4. 기능 메소드
		// 1. 메뉴 추가[ 인수 : 메뉴이름 반환 :성공/실패]
	boolean inMenu(String menuname) {
			// 1. SQL 작성
		String sql = "insert into menu values(null,?)";	
			// 2. SQL 연결/조작
		try {
			ps = con.prepareStatement(sql); // 2. SQL 연결/조작
			ps.setString(1, menuname); 		// ? :첫번째 ? 에 변수 대입
			ps.executeUpdate();				// 3. SQL 실행/결과조각
			return true;
			
		}catch (Exception e) {System.out.println("메뉴 추가 실패"+e);}
		return false;
			
	}
	
		// 2.메뉴 호출
	ArrayList<MenuDto>getMenu() {
		ArrayList<MenuDto> list = new ArrayList<>();
		String sql = "select * from menu";
		try {
			ps = con.prepareStatement(sql);
			rs =ps.executeQuery();
			while(rs.next()) { // rs.next() : 다음레코드
			MenuDto menu =new MenuDto(
					rs.getInt(1),rs.getString(2) );
			list.add(menu);
			}
			return list;
		}catch (Exception e) {}
		return list;
	}
		// 3. 제품 추가
	boolean inProduct(ProductDTO productDto) {
		String sql = "insert into product value(null,? ,? ,? ,? ,?)";
		try {
			ps =con.prepareStatement(sql);
			ps.setString(1,productDto.getPname());
			ps.setInt(2, productDto.getPprice());
			ps.setString(3, productDto.getPcomment());
			ps.setShort(4, productDto.getPamount());
			ps.setByte(5, productDto.getMno());
			ps.executeUpdate();
			return true; // 성공시 true 반환
		}// try e
		catch (Exception e) {
			System.out.println("경고 ) 제품추가실패 :"+e);
			}//catch
		return false;
	} // 메소드 end
	
		// 4. 주문 확인
}




















