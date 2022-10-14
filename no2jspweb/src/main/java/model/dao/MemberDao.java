package model.dao;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class MemberDao extends Dao {
	

public boolean bwrite(String btitle , String bcontent ,
		String bwrite , String bpassword) {
	String sql = "insert into board ( btitle , bcontent , bwrite , bpassword)"
			+ " values(?,?,?,?)";
	try {
		ps= con.prepareStatement(sql);
		ps.setString(1, btitle);
		ps.setString(2, bcontent);
		ps.setString(3, bwrite);
		ps.setString(4, bpassword);
		ps.executeUpdate(); return true;
	} catch (Exception e) {System.out.println(e);}
	return false;		
}
	
	public JSONArray blist() {
		JSONArray array = new JSONArray(); //선언
	String sql = "select * from board";
	try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()) {
			JSONObject object = new JSONObject();
			object.put("bno",rs.getInt(1));
			object.put("btitle",rs.getString(2));
			object.put("bcontent",rs.getString(3));
			object.put("bwrite",rs.getString(4));
			object.put("bdate",rs.getString(5));
			object.put("bview",rs.getInt(7));
			array.add(object);
		}
		return array;
	} catch (Exception e) {System.out.println(e);} return array;
	
	}

 public boolean bviewupdate(int bno) {
	 String sql ="update board set bview = bview+1 where bno="+bno;
	 try {
		ps = con.prepareStatement(sql);
		ps.executeUpdate(); return true;
	} catch (Exception e) {System.out.println(e);}
	 return false;
 }
 
	
	public boolean bdelete( int bno) {
		String sql ="delete from board where bno ="+bno;
		try {
			ps= con.prepareStatement(sql);
			int count = ps.executeUpdate();
			if(count ==1) {return true;}
		} catch (Exception e) {System.out.println(e);}
		return false;
	}

	
}
