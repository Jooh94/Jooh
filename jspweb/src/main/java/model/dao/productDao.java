package model.dao;

import java.util.ArrayList;

import model.dto.pcategoryDto;
import model.dto.productDto;

public class productDao extends Dao {

	// 1. 카테고리 등록 [ C ]
	public boolean setpcategory( String pcname) {
		String sql = "insert into pcategory(pcname) values(?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, pcname);
			ps.executeUpdate(); return true;
			
		} catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	// 2. 카테고리 출력 [ R ]
	public ArrayList<pcategoryDto> getpcategory(){
		
		ArrayList<pcategoryDto>list = new ArrayList<>();
		String sql = "select * from pcategory";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
			pcategoryDto dto = new pcategoryDto(rs.getInt(1),rs.getString(2));
			list.add(dto);
			}
		} catch (Exception e) {System.out.println(e);}
		return list;
	}
	
	
	// 3. 제품 등록 [ C ]
	
	public boolean setproduct(productDto dto) {
		return false;
	}
	
	// 4. 제품 출력 [ R ]
	public ArrayList<productDto> getProducList(){
		return null;
	}
	
}
