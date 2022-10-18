package model;

public class MemberDao extends Dao{

	private static MemberDao rdao = new MemberDao();
	public static MemberDao getInstance() {return rdao;}
	
	public boolean signup(Dto dto) {
		String sql = "insert into rmember ( rid,rpassword,rphone,remail) values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getRid());
			ps.setString(2, dto.getRpassword());
			ps.setString(3, dto.getRphone());
			ps.setString(4, dto.getRemail());
			ps.executeUpdate(); 
			return true;
		} catch (Exception e) {System.out.println(e);}
		return false;
	}
	
}
