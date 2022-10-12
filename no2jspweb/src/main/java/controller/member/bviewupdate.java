package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;


@WebServlet("/member/bviewupdate")
public class bviewupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public bviewupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 int bno = Integer.parseInt(request.getParameter("bno"));
	 MemberDao dao= new MemberDao();
	 boolean result = dao.bviewupdate(bno);
	 response.getWriter().print(result);
	 
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
