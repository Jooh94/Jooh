package java1.Ch5클래스.EX13비회원제게시판_DB버전;

public class BoardControl {

	BoardDao boardDao = new BoardDao(); // 현재 클래스에 존재하는 메소드 들이 Dao객체의 메소드 호출용
	//1.
	boolean regist ( String b_title , String b_content,String b_writer , String b_password) {
		// 로직 or DAO 호출 작성 예정
		// 1. 4개의 매개변수 받는다
		// 2. 변수 많을때 이동하면 매개변수 코드가 많으니깐 객체화 하자
		BoardDto boardDto = new BoardDto (0 , b_title, b_content, b_writer, b_password, 0);
		// 3. 유효성검사 [ 추후에 ]
		// 4. DB 처리 
		boolean result = boardDao.regist(boardDto); //dao.regist 메소드 호출후 결과값을 result에 저장
		// 5. DB 결과 반환
		return result;  
		
	}
	//2.
	BoardDto[] getBoardlist (){
		BoardDto[] boardlist = null;
		boardlist =boardDao.getBoardlist();
		return boardlist;
	}
	//3.
	BoardDto getBoard( int b_no ) {
		
		BoardDto board =null;
		board = boardDao.getBoard(b_no);
		return board;
	}
	//4.
	boolean update( int b_no , String b_password ,
			String new_title , String new_content) {
		// 로직 or DAO 호출 작성 예정
		return false;
	}
	//5.삭제 처리 메소드
	boolean delete( int b_no , String b_password) {
		// sql 코드 들어갈 예정
		return false;
	}
	
}
