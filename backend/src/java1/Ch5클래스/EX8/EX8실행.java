package java1.Ch5클래스.EX8;

import java.util.Scanner;

public class EX8실행 {

	public static void main(String[] args) {
		
		
		//0.입력 객체
		Scanner scanner = new Scanner (System.in);
			// scanner.next(); 객체명.메소드명()	[O]
			// scanner.next(); 클래스명.메소드명()	[X]
		
		//1.객체 생성 [ 빈 생성자 사용]
		Member m1 = new Member();
		
			m1.id="qwe";
			m1.password="qwe";
			m1.name="qwe";
		
		//2. 객체생성 [매개변수1개 생성자 사용]
		Member m2 = new Member("qwe");
		
		//3. 객체생성 [매개변수2개 생성자 사용]
		Member m3 = new Member("qwe","qwe");
		
		//4. 객체생성 [매개변수3개 생성자 사용]
		Member m4 = new Member("qwe","qwe","qwe");
		
	}
	
}

/* 
 
 	객체지향 프로그램
 		1. 클래스 : 필드 , 생성자 , 메소드로 미리 구성된 설계도
 		2. 객체 : 클래스로부터 new 연산자를 사용한 메모리 할당
 			객체 [선언] : 클래스명 변수명 = new 생성자명()
 			객체 [호출] : 변수명
 			객체 [멤버호출] : 변수명.멤버
 				변수명.필드명
 				변수명.메소드명
 
 
 */