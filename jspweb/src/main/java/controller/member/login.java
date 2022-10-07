package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/member/login") // URL 정의 : 해당 클래스로 들어올수 있는 경로 선언 [ 매핑 ]
public class login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// 1. form 내 input 태그로 부터 변수 요청
//	String mid=	request.getParameter("mid");
//	String mpassword =	request.getParameter("mpassword");
//		//4. 결과제어 true이면 index.jsp 
//	boolean result = MemberDao.getInstance().login(mid, mpassword);
//	if(result) {response.sendRedirect("/jspweb/index.jsp");}
//	else {response.sendRedirect("/jspweb/member/login.jsp"); }
	
	
		
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.변수요청 mid mpassword 요청함 이 두개값을 각각에 변수에 담았다
		// 자바스크립트에잇는걸 자바로 땡긴거다 이걸 request 라고한다
		
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		// 그리고 DAO DB 메소드 호출 한다 
		int result = MemberDao.getInstance().login(mid, mpassword);
		//3.db메소드 반환 결과를  js ajax에게 응답
		response.getWriter().print(result);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
