package java1.Ch5클래스.EX10;

public class Car { //클래스 [설계도: 변수선언, 메소드선언]

	// 1. 필드
	int gas; // gas 수량을 저장하는 int형 필드[변수]
	// 2. 생성자
	// 3. 메소드
	
	// 1. 반환값x 매개변수1개
	void setGas( int gas) {
		this.gas = gas;
		return;
	}
	
	// 2. 반환값 boolean 매개변수x
	boolean isLeftGas() {
		if( gas ==0) { // 만일 gas 변수가 0 이면 
			System.out.println("gas가 없습니다.");
			return false; // 가스가없다는 의미 // 함수종료
		}else { // 아니면
			System.out.println("ㅎgas가 있습니다.");
			return true;
		} // else end
	}// m end
	//3.반환값x 매개변수x
	void ren() {
		while(true) {
			
			if ( gas >0) { // 만일 gas변수가 0보다 크면
				System.out.println("달립니다.[gas잔량:"+gas+"]");
				gas -= 1;
				
			}else {
				System.out.println("멈춥니다.[gas잔량:"+gas+"]");
				return; //함수 종료 //무한루프 종료
			}
			
			
		} // w e
		// while 이후에 코드가 존재하지 않기때문에 return문과 break문과 같다
	}// m e
	
}
