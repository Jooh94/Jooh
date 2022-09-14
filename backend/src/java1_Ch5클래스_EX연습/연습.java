package java1_Ch5클래스_EX연습;

public class 연습 {

	//클래스멤버
	//1.필드
	String title ; 
	String content;
	String writer;
	String password;
	int view;
	//2.생성자
		//1.빈 생성자[기본생성자]
	public 연습() {}
		//2. 풀 생성자
	연습 (String title, String content,
			String writer, String password,
			int view){
		this.title=title;
		this.content=content;
		this.writer=writer;
		this.password=password;
		this.view = view;
	}
	
	
}
