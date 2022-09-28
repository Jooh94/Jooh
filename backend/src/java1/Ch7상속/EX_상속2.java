package java1.Ch7상속;

public class EX_상속2 {

	public static void main(String[] args) {
		
	
	//객체선언
	Student student =
			new Student("홍길동", "1234-123455", 1);
	
	System.out.println("name"+ student.name);
	System.out.println("ssn :"+ student.ssn);
	System.out.println("studentNo:"+student.stdentNo);
	}
}
