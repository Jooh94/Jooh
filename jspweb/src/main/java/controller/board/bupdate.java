package controller.board;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.BoardDao;
import model.dto.BoardDto;

/**
 * Servlet implementation class bupdate
 */
@WebServlet("/board/bupdate")
public class bupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 서버내 업로드 폴더 경로 찾기
		String uploadpath = request.getSession()
				.getServletContext().getRealPath("/upload");
		// 2.MultipartRequest 객체 
		MultipartRequest multi = new MultipartRequest(
				request,
				uploadpath, 
				1024*1024*10,
				"UTF-8",
				new DefaultFileRenamePolicy());
		//3요청
		String btitle = multi.getParameter("btitle");
		String bcontent = multi.getParameter("bcontent");
		String bfile = multi.getFilesystemName("bfile");
		
			//1. 수정시 새로운 첨부파일 등록시 [ 기존첨부파일 삭제]
			// *수정할 게시물의 번호
		int bno = (Integer)request.getSession().getAttribute("bno");
		
		BoardDto dto = BoardDao.getInstance().getboard(bno); // 수정 되기전 게시물정보 호출
		
		//* 기존첨부파일 변경 여부 판단
		boolean bfilechange = true;
		
		//*.수정시 첨부파일 등록없을경우[ 기존첨부파일 호출]
		if(bfile ==null) {bfile =dto.getBfile();bfilechange=false;}
		
		if ( bfile == null) { // 2. 수정시 첨부파일 등록 없을경우 [ 기존첨부파일 호출]
			bfile = BoardDao.getInstance().getboard(bno ).getBfile(); 
		
		}
		
		//4.dao처리
		
	boolean result =	BoardDao.getInstance().bupdate(bno,btitle,bcontent,bfile);
	if(bfilechange) { // 업데이트 성공시 [기존첨부파일 변경되었을때]기존파일 삭제
		String deletepath = request.getSession().getServletContext().getRealPath("/upload/"+dto.getBfile());
		File file =new File(deletepath); if(file.exists()) file.delete();
	}
	//결과반환
	response.getWriter().print(result);
	
	}

}
