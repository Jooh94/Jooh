package java1.자료정리;

import java.time.LocalDate;
import java.util.Scanner;

public class 숙제7 {
public static void main(String[] args) {
	
	System.out.println(" >> Level1_7 answer >> ");
	System.out.println(" >> answer time : " + LocalDate.now() +" >> \n" );
	Scanner scanner = new Scanner(System.in);
	
	String output = "";
	
	/* 문제풀이 위치 */
	
	System.out.print("회원명 String :");String 문자열 =scanner.next();
	System.out.print("상태 boolean :");boolean 불 = scanner.nextBoolean();
	System.out.print("성별 char :"); String 문자열1 =scanner.next();
	System.out.print("나이 short :");short 쇼트 =scanner.nextShort();
	System.out.print("포인트 int :");int 인트= scanner.nextInt();
	System.out.print("예금액 long :");long 롱 = scanner.nextLong();
	System.out.print("키 float :"); float 플룻 =scanner.nextFloat();
	System.out.print("몸무게 double :"); double 더블 =scanner.nextDouble();
	
	
	//
	System.out.println("==========회원 개인정보=============");
	System.out.println("회원명 :"+문자열 );
	System.out.println("상태 :"+불);
	System.out.println("성별 : "+문자열1);
	System.out.println("나이 :"+쇼트);
	System.out.println("포인트 :"+인트);
	System.out.println("예금액 :"+롱);
	System.out.println("키 :"+플룻);
	System.out.println("몸무게 :"+더블);
	System.out.println("====================================");
	
	
	
	/* ----------- */
	
}
}
/* 
[문제조건] 
	1. 문제풀이 위치 외 코드는 수정 불가 합니다.
	2. 기본 자료형8개 + 문자열클래스 변수 1개 를 이용한 9개변수를 입력 받습니다.
	3. 입력받은 9개 변수를 그림과 같이 출력합니다.
	4. 기존에 미리 작성된 변수를 최대한 활용합니다.
	
*/