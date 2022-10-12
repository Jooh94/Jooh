package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;

/**
 * Servlet implementation class idcheck
 */
@WebServlet("/member/idcheck")
public class idcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public idcheck() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mid =	request.getParameter("mid");  			//1.변수요청
		boolean result= MemberDao.getInstance().idcheck(mid); 	//2.DAO처리
		response.getWriter().print(result);						//DAO결과응답
	
	
	}

}
