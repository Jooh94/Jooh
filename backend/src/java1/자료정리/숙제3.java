package java1.자료정리;

import java.time.LocalDate;
import java.util.Scanner;

public class 숙제3 {
public static void main(String[] args) {
	
	System.out.println(" >> Level1_3 answer >> ");
	System.out.println(" >> answer time : " + LocalDate.now() +" >> \n" );
	Scanner scanner = new Scanner(System.in);
	/* 문제풀이 위치 */
	System.out.print("input boolean : "); boolean 불 = scanner.nextBoolean();
	System.out.print("input byte :"); byte 바이트 = scanner.nextByte();
	System.out.print("input char :"); String 문자열 = scanner.next();
	System.out.print("input short :");short 쇼트 = scanner.nextShort();
	System.out.print("input int :"); int 인트 = scanner.nextInt();
	System.out.print("input long :"); long 롱 = scanner.nextLong();
	System.out.print("input float :"); float 풀릇 = scanner.nextFloat();
	System.out.print("input double :"); double 더블 =scanner.nextDouble();
	//
	System.out.println("output boolean : "+불);
	System.out.println("output byte :"+바이트);
	System.out.println("output char :"+문자열);
	System.out.println("output short :"+쇼트);
	System.out.println("output int :"+인트);
	System.out.println("output long :"+롱);
	System.out.println("output float :"+풀릇);
	System.out.println("output double :"+더블);
	
}
}
