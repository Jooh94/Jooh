package java1.가계부;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ExpenseDAO {

	
	//6 private 넣기
	//4 C P R 적용
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static ExpenseDAO dao = new ExpenseDAO(); //6-1  적용
	//5 sql 연결
	public ExpenseDAO() {
		try {
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test",
				"root","1234");
		
		}
		catch (Exception e) {System.out.println("DB오류:"+e);}
			
	}
	//7 메소드
	public static ExpenseDAO getInstance() { return dao; }
	
	//24 내용추가 SQL
	boolean create(ExpenseDTO dto) {
		String sql ="insert into expense values(null,?,?,?)";
		try {
			ps =con.prepareStatement(sql);
			ps.setString(1, dto.getEdate());
			ps.setInt(2, dto.getEmoney());
			ps.setString(3, dto.getEcomment());
			ps.executeUpdate(); return true;
		}catch (Exception e) {System.out.println("오류"+e);}
		return false;
	}
	//25 내용출력 SQL 메소드

	ArrayList<ExpenseDTO>read(){  //25-1
	ArrayList<ExpenseDTO>list = new ArrayList<>();
		String sql ="select * from expense";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next()){//rs.next():다음레코드
				// 레코드 --> 객체화 [포장]
				rs.getInt(1); // 현 레코드의 첫번째필드
				rs.getString(2); // 현 레코드의 2번째필드
				rs.getInt(3);// 현 레코드의 3번째필드 //필드4개니깐 4개 입력
				rs.getString(4);// 현 레코드의 4번째필드
				//4개 묶어서 보내자
				ExpenseDTO dto = new ExpenseDTO(
						rs.getInt(1),rs.getString(2),
						rs.getInt(3),rs.getString(4));
						// 객체 -> 리스트담기
				list.add(dto);
			}
			return list; //반환
		}catch (Exception e) {}
		return list;
	}
	//30 내용삭제 SQL 메소드 // 
	boolean delete(int eno) {
		String sql="delete from expense where eno = ?";
		try {
			ps =con.prepareStatement(sql);
			ps.setInt(1, eno);
			ps.executeUpdate(); return true;
		}catch (Exception e) {}
		return false;
	}
	//33
	boolean update(ExpenseDTO dto) {
		String sql= "update expense set "
				+ "edate = ? , "
				+ "emoney = ? , "
				+ "ecomment = ?  "
				+ "where eno = ? ";
	try {
		ps = con.prepareStatement(sql);
		ps.setString(1,dto.getEdate());
		ps.setInt(2, dto.getEmoney());
		ps.setString(3, dto.getEcomment());
		ps.setInt(4, dto.getEno());
		ps.executeUpdate(); return true;
	}catch (Exception e) {System.out.println("DB오류:"+e);}
	return false;
	}
	
	
	
}
