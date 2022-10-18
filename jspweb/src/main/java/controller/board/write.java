package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.BoardDao;
import model.dao.MemberDao;

/**
 * Servlet implementation class write
 */
@WebServlet("/board/write")
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public write() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
/*		String mid =(String)request.getSession().getAttribute("mid");	//1. 로그인 세션[ 로그인한 사람의 아이디]가져오기
		int mno = MemberDao.getInstance().getMno(mid);					//2. 회원아이디 --> 회원번호
																				// fk는 pk에 있는 데이터만 저장가능 [ 무결성 ]
		String btitle =request.getParameter("btitle");					//3 입력받은 데이터1 요청
		String bcontent =	request.getParameter("bcontent");			//3 입력받은 데이터2 요청
		
			System.out.println(btitle);
			System.out.println(bcontent);
		
		boolean result= 												//4. DAO 호출 [ 저장 ]
		BoardDao.getInstance().write(btitle, bcontent,mno);
			System.out.println(result);									
		response.getWriter().print(result); */								//5. 결과를 AJAX 돌려주기
//		if(result) {
	//		response.sendRedirect("list.jsp");
	//	}else {
		//	response.sendRedirect("write.jsp");
	//	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 첨부파일 쓰려고 dopost 사용할거임
		//1. 첨부파일 [ cos.js]
			//1.cos.jar 빌드추가
			//2.HttpServletRequest : 첨부파일 지원 [ 소량의 문자만 지원]
			//3.MultipartRequest :첨부파일 지원o[대용량의 문자가능]	
				// 첨부파일 : http post메소드 지원
				// new MultipartRequest ( ) 선언 또해줘야함~ ( 1요청방식,2파일저장경로,3최대용량범위(바이트),4인코딩타입 5.기타(보안기능))
							// 1비트( 0,1)--> 1바이트 (01011111:8비트) -> 1kb (1024b)->1mb(1024kb) ->1G(1024MB)
		//1.저장 경로[개발중인 프로젝트 폴더 저장]
		//String uploadpath ="C:\\Users\\504\\git\\Jooh\\jspweb\\src\\main\\webapp\\upload";
		// 1. 저장경로 [배포된 프로젝트의 (서버) 폴더 저장]
			//1. 현재 배포된 프로젝트의 경로 찾기
		
		// String uploadpath = request.getSession().getServletContext().getRealPath("/upload"); // jspweb
		//System.out.println(uploadpath);
		
		String uploadpath = request.getSession().getServletContext().getRealPath("/upload");// jspweb/upload
		
		//2. Multipart 객체 생성
		MultipartRequest multi = new MultipartRequest(
						request ,				 			// 1 요청방식
						uploadpath , 						// 저장 경로
						1024 * 1024 * 10, 					//3.용량10MB  // 1MB [ 1024:1kb / 1024*1024: 1mb / 1024*1024*1024 :1G]
						"UTF-8",							//4.인코딩
						new DefaultFileRenamePolicy() 		//5.업로드된 파일의 이름이 중복일경우 자동이름 변경
							
				);//생성자 end
		
		//3. 해당 저장경로에 저장이
		
		String btitle = multi.getParameter("btitle"); // request -> multi
			System.out.println(btitle);// 확인
		String bcontent =multi.getParameter("bcontent");
			System.out.println(bcontent);  //확인
			//두가지 이름은 write.jsp name값이랑 같아야한다
			//*어떤파일을 업로드 했는지 db에 저장할 첨부파일된 경로/이름호출
		String bfile = multi.getFilesystemName("bfile");
			System.out.println(bfile);
			// 회원아이디 -->회원번호
			
		int mno = MemberDao.getInstance().getMno((String)request.getSession().getAttribute("mid"));
			System.out.println(mno);
		//5. db처리
		boolean result =
		BoardDao.getInstance().write(btitle, bcontent, mno,bfile);
			System.out.println(result);
		//6.
		response.getWriter().print(result);
	


	
	}

}
