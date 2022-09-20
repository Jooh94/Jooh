package java1.Ch5클래스.EX17_final;

import java.util.prefs.PreferenceChangeEvent;

public class EX17실행 {
	
	
	public static void main(String[] args) {
		
		// 1.객체선언
			// 클래스명 객체명 = new 생성자();
		
		Person p2 = new Person("123456-1234567","홍길동");
		
	//	p2.nation = "USA";	// 오류 : final 필드는 수정불가
	//	p2.ssn = "6555555-1234444"; 
		p2.name ="홍삼원";		// final 아니기 때문에 수정 가능
	
		
	
	
	
	}

}
