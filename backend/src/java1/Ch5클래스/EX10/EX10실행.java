package java1.Ch5클래스.EX10;

public class EX10실행 {
	
	public static void main(String[] args) {
		
		//1.객체 선언
		Car myCar = new Car();
		
		//2.객체에 메소드 호출[인수o 반환]
		myCar.setGas(5); // 매개변수 5 //반환x
		
			//gas = 5
		
		//3.객체에 메소드 호출
		boolean gasState= myCar.isLeftGas();
			//매개변수 x / 반환 boolean
		
		
			//gasStatet = true
		
		if( gasState) {
			System.out.println("출발합니다.");
			myCar.ren(); //매개변수x /반환x
			
			// gas = 0
			
		}
		// 4.
		if( myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 있습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
			
		}
		
		
	}

}
