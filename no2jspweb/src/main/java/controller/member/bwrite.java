package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;

@WebServlet("/member/bwrite")
public class bwrite extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public bwrite() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	request.setCharacterEncoding("UTF-8"); //한글인코딩
String bitle=	request.getParameter("btitle");
String bcontent =	request.getParameter("bcontent");
String bwrite =	request.getParameter("bwrite");
String bpassword =	request.getParameter("bpassword");

MemberDao dao = new MemberDao(); // 선언
boolean result =dao.bwrite(bitle, bcontent, bwrite, bpassword);
//3.결과제어 이거 반환 스크립트로 넘겨주기
response.getWriter().print(result);


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
