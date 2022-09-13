package java1.Ch5클래스;

public class Korean {
	
	//필드
	String nation = "대한민국";
		//클래수 내부에 미리 초기화 -> 객체 생성시 대한민국 초기화
	String name;
	String ssn;
	
	//1. 매개변수가 있는 생성자
	Korean( String n, String s){
	//클래스명( 매개변수1,매개변수2)
		name =n;
		ssn = s;
	}
	//2. 매개변수가 없는 생성자
	public Korean() {}
	
	//메소드
}
