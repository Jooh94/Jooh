package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;

/**
 * Servlet implementation class update
 */
@WebServlet("/member/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public update() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//수정하려면 식별 데이터 필요 == 로그인정보 == 세션
		String mid = (String) request.getSession().getAttribute("mid");
		
		// 수정할 내용
		String mname = request.getParameter("mname");
		boolean result = MemberDao.getInstance().update(mid,mname);
		response.getWriter().print(result);

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

				
				
	}

}
