package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;
import model.dto.MemberDto;
//@WebServlet ("URL정의) : 해당 클래스
@WebServlet("/member/signup") // 해당 클래스로 매핑 ( 연결 ) URL 설정[패키지 경로x]
public class signup extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String  mid = request.getParameter("mid");
		String  mpassword = request.getParameter("mpassword");
		String  mpasswordconfirm = request.getParameter("mpasswordconfirm");
		String  mname = request.getParameter("mname");
		String  mphone = request.getParameter("mphone");
		String  memail = request.getParameter("memail");
		
		//주소4개 요청
		String maddress1 = request.getParameter("maddress1");
		String maddress2 = request.getParameter("maddress2");
		String maddress3 = request.getParameter("maddress3");
		String maddress4 = request.getParameter("maddress4");
		String maddress = maddress1+","+maddress2+","+maddress3+","+maddress4;
		
		MemberDto dto =new MemberDto(0,mid,
				mpassword,mname,
				mphone,memail,maddress,null,0);
		System.out.println(dto.toString());
		
		// 메소드 호출용 객체 선언
		
	//1.싱글톤 객체가 아닐경우 보여준거 [1.객체생성 2.객체명.메소드명()]
	//	MemberDao dao = new MemberDao();
	//	boolean result= dao.signup(dto);
		//2. 싱글톤 객체가 있을경우[ 클래스명.getInstance().메소드명()]
		boolean result = MemberDao.getInstance().signup(dto);
		//결과제어
		if( result) {response.sendRedirect("/jspweb/member/login.jsp");}
		
		
		//if(result) {System.out.println("회원가입 성공");}
		//else {System.out.println("회원가입 실패");}
		
	}
	
	
	
	private static final long serialVersionUID = 1L;

    public signup() {  }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 입력받은 변수 4개를 DAO 이동하자 [변수4개 vs DTO 1개 VS 컬렉션프레임워크 ]
		// DTO 왜쓸까요 편하기 위해서
		// 1.변수 4개 -> DTO 객체화
		
		
	//	MemberDto dto = new MemberDto(id, pw, name, phone);
	//		//2. 테스트 [ 객체 필드 정보 확인 ]
	//	System.out.println(dto.toString()); // toString 은 확인용
	//		//3.Dao 싱글톤 객체 호출 한다음 메소드 호
	//	boolean result = MemberDao.getInstance().signup(dto);
	//	if( result) {System.out.println("회원가입 성공");}
	//	else {System.out.println("회원가입 실패");}
		
		
		response.getWriter().append("qweqweqweqweqwe ").append(request.getContextPath());
	}



}
