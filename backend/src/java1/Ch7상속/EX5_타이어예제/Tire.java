package java1.Ch7상속.EX5_타이어예제;

public class Tire {
// 1. 필드
	public int maxRotation; // 최대 회전수 ( 타이머수명)
	public int accumulatedRotation; // 누적 회전수
	public String location;
	//2.
	public Tire(int maxRotation, String location) {
		
		this.maxRotation = maxRotation;
		this.location = location;
	}
	//3. 메소드
	
	
	
	
	public boolean roll() {
		++accumulatedRotation; // 누적 회전수 1씩증가
		if( accumulatedRotation< maxRotation) {
			System.out.println(location+"Tire수명 :"
					+(maxRotation-accumulatedRotation)+"회");
		return true;
		}else {
			System.out.println("***"+location+"Tire 펑크 ***");
			return false;
		}
	}
	
}
