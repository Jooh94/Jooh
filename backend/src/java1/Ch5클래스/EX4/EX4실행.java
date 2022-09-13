package java1.Ch5클래스.EX4;

public class EX4실행 {
public static void main(String[] args) {
	
	
	//1. 객체 선언[오류발생 : 생성자에 매개변수 생략해서]
	Car myCar = new Car();
			
	
	myCar.color ="검정";
	myCar.cc= 3000;
	
	// 2.객체 선언
	Car myCar2 = new Car ("검정",3000);
	
}
}
