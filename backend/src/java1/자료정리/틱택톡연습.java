package java1.자료정리;

import java.util.Random;
import java.util.Scanner;

public class 틱택톡연습 {


/*

	변수 선언 : 자료형 변수명 = 값 
		* 하나의 값 저장 
	배열 선언 : 자료형[ ] 변수명 = new 자료형[길이]
		* 길이 만큼의 값 저장 
		* 초기값을 없을때 [ 처음에 값을 개발자 안넣어주면 ]
		* 	정수 0	실수 0.0    클래스  null		
		* 
		* 
	기본자료형
		char
		byte
		short
		int
		long
		double
		float
		boolean
	그외는 클래스다 .
	
	인덱스 : 배열에 저장된 순서번호 
	배열 호출 : 배열명[인덱스]
	
	
*/


public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

String[ ] 게임판 =  {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
int 알개수 = 0;

while( true ) {
	// 출력 
	for( int i = 0 ; i<=8 ; i++ ) {
		System.out.print( 게임판[i] );
		if( i == 2 )System.out.println();
		if( i == 5 )System.out.println();
		 // if( i % 3 == 2 ) System.out.println();
	 }
	//입력받기
		// 1. 안내(print) -> 2.입력(scanner) -> 3.저장(변수)
	while(true) {
		System.out.println("위치 선택 : ");
		int 위치 = scanner.nextInt(); // ~ 어디에 두지 
		
		if( !게임판[위치].equals("[ ]")) {
			System.out.println("둘수 없습니다");
		}else {
			게임판[위치] = "[O]";// 그 위치에 알두자 
			알개수++;
			break;
		}
	}
	
	// 무승부
	if( 알개수 == 9 ) { System.out.println("무승부"); break;}
	
	
	//
	while(true) {
		Random random = new Random();
		int 위치2 = random.nextInt(9);
		if( !게임판[위치2].equals("[ ]")) {
			System.out.println("둘수 없습니다");
		}else {
			게임판[위치2] = "[X]";
			알개수++;
			break;
		}
	}
	
	
	//승리판단
		// 1. 가로로 이기는수 012 345 678
	String 승리자알 = null;
	for(int i = 0 ; i<=6 ; i+=3 ) {
		if( !게임판[i].equals("[ ]") && 게임판[i].equals(게임판[i+1] ) && 게임판[i+1].equals(게임판[i+2]) ) { System.out.println(게임판[i]+"승리"); 승리자알=게임판[i]; }	
	}
//	if( !게임판[0].equals("[ ]") && 게임판[0].equals(게임판[1] ) && 게임판[1].equals(게임판[2]) ) { System.out.println(게임판[0]+"승리"); break; }
//	if( !게임판[3].equals("[ ]") && 게임판[3].equals(게임판[4] ) && 게임판[4].equals(게임판[5]) ) {System.out.println(게임판[3]+"승리"); break; }
//	if( !게임판[6].equals("[ ]") && 게임판[6].equals(게임판[7] ) && 게임판[7].equals(게임판[8]) ) { System.out.println(게임판[6]+"승리"); break; }
	

		// 2. 세로로 이기는수 036 147 258
	for( int i = 0 ; i<=2 ; i++) {
		if( !게임판[i].equals("[ ]") && 게임판[i].equals(게임판[i+3] ) && 게임판[i+3].equals(게임판[ i+6]) ) {System.out.println(게임판[i]+"승리"); 승리자알=게임판[i];  }
	}
//	if( !게임판[0].equals("[ ]") && 게임판[0].equals(게임판[3] ) && 게임판[3].equals(게임판[6]) ) {System.out.println(게임판[0]+"승리"); break; }
//	if( !게임판[1].equals("[ ]") && 게임판[1].equals(게임판[4] ) && 게임판[4].equals(게임판[7]) ) { System.out.println(게임판[1]+"승리"); break; }
//	if( !게임판[2].equals("[ ]") && 게임판[2].equals(게임판[5] ) && 게임판[5].equals(게임판[8]) ) { System.out.println(게임판[2]+"승리"); break; }
		// 3. 대각선으로 이기는수  0 48 246
	if( !게임판[0].equals("[ ]") && 게임판[0].equals(게임판[4] ) && 게임판[4].equals(게임판[8]) ) { System.out.println(게임판[0]+"승리"); 승리자알=게임판[0];  }
	if( !게임판[2].equals("[ ]") && 게임판[2].equals(게임판[4] ) && 게임판[4].equals(게임판[6]) ) {System.out.println(게임판[2]+"승리"); 승리자알=게임판[2];  }
		// 4. 무승부 
	
	if( 승리자알 != null ) { break; }
	
	
	
	
}//while e

for( int i = 0 ; i<=8 ; i++ ) {
	System.out.print( 게임판[i] );
	if( i == 2 )System.out.println();
	if( i == 5 )System.out.println();
	 // if( i % 3 == 2 ) System.out.println();
 }











}
}