package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import model.dao.BoardDao;
import model.dto.BoardDto;

/**
 * Servlet implementation class view
 */
@WebServlet("/board/view")
public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public view() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			//요청
		//	int bno = Integer.parseInt(request.getParameter("bno"));
		//	System.out.println(bno);
			
		//1. 세션요청 [세션(Object) -->String->int]
			//다형성 : 부모가 자식으로 강제 형변환 가능
		int bno =(Integer)request.getSession().getAttribute("bno");
			BoardDto dto =
			BoardDao.getInstance().getboard(bno);
			
			JSONObject object = new JSONObject();
			object.put("bno",dto.getBno());
			object.put("btitle",dto.getBtitle());
			object.put("bcontent",dto.getBcontent());
			object.put("mno",dto.getMno());
			//4 응답
			
			response.getWriter().print(object);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
