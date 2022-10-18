package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao;
import model.Dto;
import model.MemberDao;


@WebServlet("/rmember/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");				
		String rid = request.getParameter("rid");				System.out.println( rid );
		String rpassword = request.getParameter("rpassword");	System.out.println( rpassword );
		String rphone =	request.getParameter("rphone");			System.out.println( rphone );
		String remail =	request.getParameter("remail");			System.out.println( remail );
		
		Dto dto = new Dto(0, rid, rpassword, rphone, remail , null);
		
		
		
		boolean result=	MemberDao.getInstance().signup(dto);
		
		response.getWriter().print(result);

		//if(result) {response.sendRedirect("");}
		
	}

}
