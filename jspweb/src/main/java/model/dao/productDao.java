package model.dao;

import java.sql.Statement;
import java.util.ArrayList;

import controller.board.list;
import model.dto.StockDto;
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
		
		String sql = "insert into product(pname, pcomment , pprice , pdiscount , pimg , pcno) values(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getPname());
			ps.setString(2, dto.getPcomment());
			ps.setInt(3, dto.getPprice());
			ps.setFloat(4, dto.getPdiscount());
			ps.setString(5, dto.getPimg());
			ps.setInt(6, dto.getPcno());
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	// 4. 제품 출력 [ R ]
	public ArrayList<productDto> getProducList( String option){
		ArrayList<productDto> list = new ArrayList<>();
		String sql = null;
		if( option.equals("all")) {
			 sql = "select * from product";	
		}else if(option.equals("pactive1")) {
		//2. [판매중] 상태 만 모든 제품 출력
			sql = "select * from product where pactive = 1 order by pdate desc";
		}
		//1.조건없는 모든 제품 출력
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				productDto dto = new productDto(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getInt(4),
						rs.getFloat(5), rs.getByte(6), 
						rs.getString(7), rs.getString(8), 
						rs.getInt(9));
				list.add(dto);
			}
		} catch (Exception e) {System.out.println(e);}
		
		return list;
	}
	
	//5. 제품삭제
	public boolean deleteprodcut(int pno) {
		String sql = "delete from product where pno ="+pno;
		try {
			ps = con.prepareStatement(sql);
			//삭제시 삭제된 레코드수로 삭제성공 유무판단
			int count = ps.executeUpdate();
			if( count == 1) return true;
		} catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	// 6. 제품 개별출력 
	public productDto getpProduct( int pno ) {
		String sql = "select * from product where pno = "+pno;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if( rs.next() ) { // 1개 --> if -> next() 1번실행
				productDto dto = new productDto(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getInt(4), 
						rs.getFloat(5), rs.getByte(6), 
						rs.getString(7), rs.getString(8), rs.getInt(9) );
				return dto;
			}
		}catch (Exception e) {System.out.println(e);} return null;
	}
	
	
	//수정 
	
	// 7. 제품 업데이트 
	public boolean updateProduct( productDto dto ) {
		String sql = "update product set pname = ? , pcomment=? , pprice=? , pdiscount=? , pactive=? , pimg=? , pcno=? "
				+ "where pno = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , dto.getPname());	ps.setString( 2 , dto.getPcomment());
			ps.setInt( 3 , dto.getPprice());	ps.setFloat( 4 , dto.getPdiscount());
			ps.setByte( 5 , dto.getPactive());	ps.setString( 6 , dto.getPimg());
			ps.setInt( 7 , dto.getPcno());		ps.setInt( 8 , dto.getPno());
			ps.executeUpdate(); return true;
		}catch (Exception e) { System.out.println(e);	} return false;
	}
	
	// 8. 재고 등록 
	public boolean setstock( String psize ,  int pno , String pcolor , int pstock  ) {
		// 1. 사이즈 등록 
		String sql = "insert into productsize( psize , pno ) values(?,?)";
		try {
			ps = con.prepareStatement( sql , Statement.RETURN_GENERATED_KEYS );
			ps.setString( 1 , psize ); 		ps.setInt( 2 , pno );
			ps.executeUpdate();	
			rs = ps.getGeneratedKeys();
			if( rs.next() ) {
				int psno = rs.getInt(1); // pk 호출
				// 2. 색상재고 등록
				sql ="insert into productstock(  pcolor ,  pstock , psno ) "
						+ "values( ? , ? , ?) ";
				ps = con.prepareStatement(sql);
				ps.setString( 1 , pcolor );
				ps.setInt( 2 , pstock );
				ps.setInt( 3 , psno );	// 첫번째 sql 실행 결과로 생성된 pk 값 
				ps.executeUpdate();	return true;
			}
		}catch (Exception e) { System.out.println(e);	} return false;
	}
	// 9. 제품별 재고 출력 
	public ArrayList<StockDto> getstock( int pno){
		
		ArrayList<StockDto> list = new ArrayList<>();
		
		String sql = "select ps.psno , ps.psize , pst.pstno , pst.pcolor , pst.pstock "
				+ " from productsize ps , productstock pst"
				+ " where ps.psno = pst.psno and ps.pno = "+pno
				+ " order by ps.psize desc";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {
				StockDto dto = new StockDto(
						rs.getInt(1), rs.getString(2), 
						rs.getInt(3), rs.getString(4), rs.getInt(5));
				list.add(dto);
			}
		}catch (Exception e) { System.out.println(e);	} return list;
	}
}


// * 해당 sql에서 insert 된 pk값 가져오기
	// 1. con.prepareStatement( sql , Statement.RETURN_GENERATED_KEYS )
		// !: Statement [ java.sql 패키지 ]
	// 2. ps.getGeneratedKeys() : pk값 호출 
