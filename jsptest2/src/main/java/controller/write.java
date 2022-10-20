package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDao;
import model.BoardDto;

/**
 * Servlet implementation class write
 */
@WebServlet("/write")
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public write() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String btitle = request.getParameter("btitle");
		String bcontent= request.getParameter("bcontent");
		String  bwrite = request.getParameter("bwrite");
		String bpassword = request.getParameter("bpassword");
		
		BoardDto boardDto = new BoardDto(0,
				btitle, bcontent, bwrite, bpassword, null, 0);
		
		BoardDao boardDao = new BoardDao();
		boolean result = boardDao.bwrite(boardDto);
		response.getWriter().print(result);
		
	
	}

}
