package java1.가계부;

import java.util.ArrayList;

public class Controller {


	//21 내용추가 컨트롤러
	boolean create(String edate , 
			int emoney ,String ecomment) {
		
		//22 매개변수3개 --> 1개 dto 선언
		ExpenseDTO dto = new ExpenseDTO(0 ,edate,
				emoney,ecomment);
		//23 dto 객체
		return ExpenseDAO.getInstance().create(dto);
	
	}
	
	//26 내용호출 컨트롤러
	ArrayList<ExpenseDTO> read(){
		return ExpenseDAO.getInstance().read();
	}

	// 30 내용삭제 컨트롤러
	boolean delete(int eno) {
		return ExpenseDAO.getInstance().delete(eno);
	}
	//32 내용수정 컨트롤러
	boolean update(int a , String b ,int c , String d) {
		return ExpenseDAO.getInstance().update(new ExpenseDTO(a,b,c,d));
}
}