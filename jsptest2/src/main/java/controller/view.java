package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import model.BoardDao;
import model.BoardDto;

/**
 * Servlet implementation class view
 */
@WebServlet("/view")
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
		String type = request.getParameter("type");
		if( type.equals("load") ) {
			int bno = Integer.parseInt( request.getParameter("bno" ) );
			request.getSession().setAttribute("bno" , bno );
			return;
		}else if( type.equals("get") ) {
			int bno = (Integer)request.getSession().getAttribute("bno");
			BoardDao boardDao = new BoardDao();
			BoardDto dto = boardDao.getboard( bno );
			if( dto == null ) { return; }
			JSONObject object = new JSONObject();
			object.put( "bno" , dto.getBno() );
			object.put( "btitle", dto.getBtitle() );
			object.put( "bcontent", dto.getBcontent() );
			object.put( "bwrite", dto.getBwrite() );
			object.put( "bpassword", dto.getBpassword() );
			object.put( "bdate", dto.getBdate() );
			object.put( "bview", dto.getBview() );
			
			// ?? 나오는건 한글이 깨져서 그럽니다.
			response.setCharacterEncoding("utf-8");   // 오늘도 고생하셨어요~선생님!!??그
			response.getWriter().print( object );//제가오늘 실수한부분이 문자열띄어쓰기,겟으로보내쓰면겟으로받고, 두가지맞을까요 한글인식이랑 네 3가지 맞습니다.감사합니다!!
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // 근데 여기는 포슽트 입니다..ㅋㅋㅋㅋ 겟으로 보냈으몀ㄴ 겟으로 받으세요~~네!
		
		 // 혹시 복사 하셨나요????맨처음에 제가 쓰고나서 그다음에 햇엇어요

	
	
	
	
	}

}
