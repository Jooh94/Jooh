package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;


@WebServlet("/member/findid")
public class findid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public findid() {
        super();
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 한글깨지니깐 한글 인코딩
		//변수욧청
		String mname =request.getParameter("mname");
		String memail =request.getParameter("memail");
		// 2.DB처리
		String	result= MemberDao.getInstance().findid(mname, memail);
		
		//3. 응답
		response.getWriter().print(result);		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
