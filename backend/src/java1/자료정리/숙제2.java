package java1.자료정리;

import java.time.LocalDate;

public class 숙제2 {
public static void main(String[] args) {
	
	System.out.println(" >> Level1_2 answer >> ");
	System.out.println(" >> answer time : " + LocalDate.now() +" >> \n" );
	System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
	System.out.println("-------------------------------------------------------------");
	/* 문제풀이 위치 */
	
	
	boolean 불 = true; System.out.printf("%-10s   %15s   %30s\n","boolean",불,"true or false" );
	byte 바이트 = 100; System.out.printf("%-10s   %15s   %30s\n","byte",바이트,"-128 ~ 127");
	char 차 = 'A'; System.out.printf("%-10s   %15s   %30s\n","char",'A',"0~65535[ character 1 ]" );
	short 쇼트 = 30000; System.out.printf("%-10s   %15s   %30s\n",쇼트,"30000","-32768 ~ 32767" );
	int 인트 = 2000000000; System.out.printf("%-10s   %15s   %30s\n","int",인트,"-+2000 million" );
	long 롱 = 4000000000L; System.out.printf("%-10s   %15s   %30s\n","long",롱,"-+2000 million Excess" );
	float 플룻 = 3.1231232F; System.out.printf("%-10s   %15s   %30s\n", "float",플룻,"8 dcemal places");
	double 더블 = 3.1231231231; System.out.printf("%-10s   %15s   %30s\n","double",더블,"17 decimal places");
	
	
	/* ----------- */
	
	
}
}

/* 
[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
[조건] 
	1. 모든 기본자료형 8개 사용
	2. printf() 메소드 사용
*/
