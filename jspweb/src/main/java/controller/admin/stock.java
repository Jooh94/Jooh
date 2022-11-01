package controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.dao.productDao;
import model.dto.StockDto;

/**
 * Servlet implementation class stock
 */
@WebServlet("/admin/stock")
public class stock extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stock() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//재고 출력
		
		//1.요청 [ 제품별 모든 재고 확인 -> 제품번호 요청 ]
		int pno = Integer.parseInt( request.getParameter("pno"));
		//2.db처리
		ArrayList<StockDto> list = new productDao().getstock(pno); 
		//3. 형변환 [ lst->jsonarray]
		JSONArray array = new JSONArray();
		for(StockDto dto : list) {
			JSONObject obect= new JSONObject();
			obect.put("psno", dto.getPsno());
			obect.put("psize", dto.getPsize());
			obect.put("pstno", dto.getPstno());
			obect.put("pcolor", dto.getPcolor());
			obect.put("pstock", dto.getPstock());
			array.add(obect);
		}
		//4. 반환
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//1. 요청
		request.setCharacterEncoding("UTF-8");
		String psize = request.getParameter("psize"); // 사이즈명
		int pno = Integer.parseInt( request.getParameter("pno")); //제품벊
		String pcolor = request.getParameter("pcolor"); // 색상
		int pstock = Integer.parseInt( request.getParameter("pstock")); //재고
		
		
		
	//2. db처리
		boolean result = new productDao().setstock(psize,pno,pcolor,pstock);
		
	//3.결과
		response.getWriter().print(result);
	
	
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
