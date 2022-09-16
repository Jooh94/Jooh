package java1.자료정리;

public class 자료정리 {

	public static void main(String[] args) {
		
		
		
		
	}
}












/* 
 2022 .9 .14
  static: 정적
  		[메소드 영역]
  		1.프로그램 시작시 메모리 할당
  		2.프로그램 종료시 메모리초기화
  		* 모든 클래스에서 사용되는[공통메모리]
  프로젝트 패키지 관리 방법 ->디자인패턴
  		1.MYC
  			M:모델 	[JAVA]
  			V:뷰		[HTML,css,js]
  			c:컨트롤러[JAVA]
VIEW--m-->controller 
	
	JVM
	-메소드영역[Static]
		-프로그램 시작될때 메모리 할당
	-스택영역
		-변수 메모리
	-힙영역
		-객체/배열 메모리

2022.9.16

	메모리 할당 준비물
		1. 메모리크기[자료형/타입/클래스등]
				int double 등
				String,Scanner 등
		2.메모리 이름[(메모리이름 = 주소값(16진수)]
		3.데이터
		
	변수[스택영역]
			1.기본자료형 : int double 스택에 값 저장ㅇ
			2.참조타입형 : 클래스/배열 힙에 값 저장하고 힙의 주소값을 변수[스택]에 저장한다
			
			== 값 비교		3==3 [o0		 주소=주소[x]
			값 중복이 가능하지만 					주소는 중복이 불가능하다.
			
			equlas 객체비교	3 == 3			주소안에있는데이터.equlas(주소안에있는데이터)
			[해당 주소안에 있는 데이터 비교]
		
* 클래스(설계도)
		멤버 : 1.필드 2.생성자 3.메소드
		
		1.필드(데이터 저장공간)
			1.변수 2.배열 3.객체 4.인터페이스
		2.생성자 ( 객체의 생성시 초기값)
			*생성자명은 클래스와 동일해야 한다.
			*new 사용시 객체 필드에 값 대입
			1.매개변수가 없는 생성자 [빈생성자]
			2. 모든 매개변수수를 받는 생성자[풀생성자]
			3.~그외 본인 선택생성
			
		3.메소드(미리 구성된 코드집합)
			1.준비물
					1.변환타입[결과] : 메소드 호출시에 메소드안으로 들어오는 데이터
					2.메소드이름
					3.매개변수[인수]:메소드를 호출했던곳으로 반환 하는 값
			
		
		클래스명.멤버[x]   
		클래스명.static 멤버(필드/메소드)[o]
		객체명.멤버[o]
---------------------------------------------------------------------
		사람 [ 이름x 키x 나이x 주민등록번호o , 지문o 등등]
		비회원게시판[ 클래스. DB,MVC패턴]
			1.메모리
				1.게시물번호 저우
				2.제목 문자열[~100글자]
				3.내용 : 문자열[~500글자]
				4.작성자 : 문자열[~10글자] 
				5.비밀번호 : 문자열[~4글자]
				6.조회수 : 정수
		create table 테이블명 (필드명1 타입속성, 필드명2 타입속성,필드명3 타입속성);
		
	create table board(
	    b_no int primary key auto_increment ,
	      b_title varchar(100) ,	
	      b_content varchar(500), 	
	      b_writer varchar(10) ,	
	      b_password varchar(4) ,	
	      b_view int				

);

		2.클래스 설계
			
			1. BoardDao		:데이터베이스와 접근 객체
					1.DB접속코드
					2.메소드
							1.regist()
									인수:BoardDto
									반환:boolean
							2.getBoardlist()
									인수:x
									반환:BoardDto[]			:dto 여러개이니까 배열/리스트
							
							3. getBoard()
									인수:int b_no
									변환:BoardDto
							4.update()
									인수:int b_no , int b_password, Stringb_title,String b_content
									반환:boolean
							5.delete ()
									인수:int  b_no,int b_password
									변환:boolean
							
							
			2.BoardDto		: 이동객체[db의 필드명과 동일하게 작성]
					1.필드
							int b_no;
							String b_title;
							String b_content;
							String b_writer;
							String b_password;
							int b_view;
					2.생성자
							1.빈생성자 2.풀생성자
					3.메소드
			
			
			
			
			
				 
			2.기능
					1.게시물등록
						제목,내용,작성자,비밀번호 받아야지
						인수: 제목,내용,작성자비밀번호
						변환:등록,실패
					2.모든게시물 조회
						모든 게시물의 순서대로 제목,내용,작성자,비밀번호 출력해야지
					3.개별 게시물
						보고 싶은 게시물 선택!!
								선택?? : 중복이 없는 값 [게시물번호]
						1.게시물번호 입력받는다.
						2.입력받은 게시물번호의 해당 게시물 모든 정보 출력한다.
						
						인수:게시물번호
						반환:해당 게시물의 정보
					4.수정 기능
							1.비밀번호 입력받는다.
							2.현재보고있는 게시물번호와 비밀번호와 수정페이지 이동
							3.수정내용 입력받아 수정처리 한다.
							
							인수:게시물번호,비밀번호,수정할 내용들
							반환 성공,실패
					5.삭제 기능
							1.비밀번호 입력받는다.
							2.현재보고있는 게시물번호와 비밀번호와 동일하면
	
							인수: 게시물번호,비밀번호
							반환:성공,실패
							
	
	
	DB												Contro		l				View
	1.등록처리											1.등록처리 <---Model[DTO]--->	1.등록화면
	2.모든게시물처리			<---DTO[]배열/리스트-->	2.모든게시물처리	<--DTO[]--->2.모든게시물 출력화면
	3.개별게시물처리		<---ㅡModel[DTO]-------->	3.개별게시물처리				3.개별게시물 출력화면
	4.비밀번호검증처리									4.비밀번호검증처리				4.수정페이지 출력화면
	5.수정처리											5.수정처리
	6.삭제처리											6.삭제처리
		
		
데이터베이스
		
		2022 9 -16 정리
	JDBC [ 자바와 DB연동클래스/라이브러리]
			1.Connection 						: DB연동 인터페이스
					1.DB연동
					con =DriverManager.gatConnection(db주소,계정명,비밀번호);
					*DriverManager:DB연동클래스
					2.연동된 DB에 SQL 연결
						con.prepareStatement(sql)
			2.PreparedStatement					:연결된 DB에 SQL 연결/조작
					1.연동된 DB에 SQL 연결
							ps=con.prepareStatement(sql)
					2.조작 메소드
							1.ps.setint(?위치,정수데이터) / ps.setString(?위치,문자열데이터)
							2.ps.executeUpdate()	:insert,update,delete
							3.rs=ps.executeQuery()	:select
			3.ResultSet 						:SQL 결과[쿼리]조작
 					*rs 기본값 :null
 					* null--next()-->결과의 첫번째레코드 --next() --> 검색결과의 두번째레코드 --> ~~
 					1.rs.next() :다음 레코드 [있으면 true/  없으면 false]
 					2.rs.getint(필드번호/필드명):현재 레코드[행] 해당 필드의 데이터 호출
SQL
		DML
				select*from 테이블명 where 조건
						[모든필드]select*from 테이블명
						[레코드수]select count(*)from 테이블명
						[특정조건]select*from 테이블명 where 필드명 = 조건값
						
				insert into 테이블명 values(데이터1,데이터2,데이터3)
						[모든필드추가]insert into 테이블명 values(값1,값2,값3)
						[특정필드추가]insert into 테이블명(필드명1,필드명)values(값1,값2)
				update 테이블명 set 필드명 = 새로운데이터 where 조건
						[특정조건] update 테이블명 필드명 = 새로운데이터,필드명2=새로운데이터 where 필드명 =조건값
						
				delete from 테이블명 where 조건
						[특정조건]delete from 테이블명 where 필드명 =조건값
 
 
 
 
 
 */
 