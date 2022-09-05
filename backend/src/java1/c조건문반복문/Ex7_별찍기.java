package java1.c조건문반복문;

import java.util.Scanner; // 외부 클래스 호출 [ 가져오기 ]

public class Ex7_별찍기 {
	
	public static void main(String[] args) {
		
		// 0. 입력객체 [ 1번 선언]
		Scanner scanner = new Scanner(System.in);
		
		// 1. 입력받은 수만큼 * 출력
		System.out.print("문제1)별개수 :"); int s1 = scanner.nextInt();
		for( int i = 1 ; i<= s1 ; i ++) { // i는 1부터 입력 받은 수까지 1씩 증가반복
			System.out.print("*");
		}//for end
System.out.println("\n-----------------------------------------------");
		// 2. 입력받은 수 만큼 * 출력 [ 3줄마다 줄바꿈 처리 ]
		System.out.print("문제2) 별개수 :"); int s2 = scanner.nextInt();
		for( int i =1 ; i<= s2 ; i++) { 
			System.out.println("*"); if ( i % 3 == 0) {System.out.println();}
		} // for end
System.out.println("\n----------------------------------------------");
		
		//3.   
		System.out.println("문제3)줄수 :"); int line3 =scanner.nextInt();
		for( int i = 1 ; i<=line3 ; i++) {
			for (int s =1 ;s<= i ; s++) {
				System.out.print("*");
			}
			//줄바꿈
			System.out.println();
		}
System.out.println("\n-----------------------------------------");
		

		//4.
		System.out.println("문제4)줄수:"); int line4 = scanner.nextInt();
		for ( int i = 1 ; i<=line4 ; i++) {
			// 2.별찍기
			for( int s =1 ; s<= line4-i+1 ; s++) {System.out.print("*");}
			// 1.줄바꿈
			System.out.println();
		}

System.out.println("\n--------------------------------------");
		System.out.println("문제5)줄수:"); int line5 = scanner.nextInt();
		for ( int i = 1 ; i<=line5 ; i++) {
			// 2. 공백찍기
			for( int b = 1 ; b<=line5-i; b++) {System.out.print(" ");}
			// 3. 별찍기
			for( int s =1 ; s<=i ; s++) {System.out.print("*");}
			//1.줄바꿈
			System.out.println();
		}
System.out.println("\n-----------------------------------------------");
		System.out.println("문제6)줄수:"); int line6 =scanner.nextInt();
		for ( int i = 1 ; i<=line6 ; i ++) {
			//2. 공백
			for( int b= 1 ; b<= i-1 ; b++) {
				System.out.print(" ");
			}
			//3.별
			for ( int s = 1 ; s<=line6-i+1 ; s++) {
				System.out.print("*");
			}
			// 1. 줄바꿈
			System.out.println();
		}
		
System.out.println("\n------------------------------------------------");

		System.out.println("문제7)줄수:"); int line7 = scanner.nextInt();
		for( int i = 1 ; i<=line7 ; i++) {
			//2.공백
			for( int b = 1 ; b<=line7-i ; b++) {
				System.out.print(" ");
			}// for2 end
			//3.
			for ( int s = 1 ; s<=i*2-1 ; s++) {
				System.out.print("*");
			}// for3 end
			
			//1줄바꿈
			System.out.println();
		} // for1 end
		
System.out.println("\n----------------------------------------------");

		System.out.println("문제8)줄수"); int line8 = scanner.nextInt();
		for ( int i = 1 ; i<=line8 ; i++) {
			for( int b = 1 ; b<=line8*2-1 ; b++) {
				System.out.print(" ");
			}
			for( int s = 1 ; s<=i*2-1 ; s++)
				System.out.print("*");
			
			//1.줄바꿈
			System.out.println();
		}


	} // main e
} // class e
/* 
 				i = 현재 줄수 	s =  별
별문제3 : 입력받은 줄 만큼 출력
			
	*		
	**		
	***		
	****	
	***** 	 	
			  * i마다 s출력
				i = 1			s =1
 				i = 2			s =1 2
 				i = 3			s =1 2 3
 				i = 4			s =1 2 3 4
 				i = 5			s =1 2 3 4 5
 					i : i는 1부터 입력받은줄까지 1씩증가한다.
 					s : s는 1부터 현재줄수[i] 까지 1씩증가한다.
 
 
 별문제4 : 입력받은 줄 만큼 출력
					i = 현재줄수		s = 별
	*****			i = 1			s = 1 2 3 4 5 입력받은줄-현재줄수 [5-1 = 4+]
	****			i = 2			s = 1 2 3 4
	***				i = 3			s = 1 2 3
	**				i = 4			s = 1 2
	*				i = 5			s = 1
	
 					* i 마다 s출력
 					i : i는 1부터 입력받은줄까지 1씩 증가한다.
 						s: s는 1부터 입력받은줄- 현재줄수+1 까지 1씩증가한다.
 
 별문제5 : 입력받은 줄 만큼 출력
				i = 현재 줄수  		b = 공백 			s = 별
        *		i = 1				b = 1 2 3 4		s = 1		
       **		i = 2				b = 1 2 3		s = 1 2
      ***		i = 3				b = 1 2			s = 1 2 3
     ****		i = 4				b = 1			s = 1 2 3 4
    *****		i = 5				b = 			s = 1 2 3 4 5
 			* i 마다 b , s 출력
 					b : b는 1부터 입력받은줄-현재줄수 까지 1씩 증가한다.
 					s : s는 1부터 s까지 1씩증가한ㄷ.

별문제6 : 입력받은 줄 만큼 출력
			i=현재줄수  b=공백
	*****		i =1	b =	 			s = 1 2 3 4 5
	 ****		i =2	b = 1			s = 1 2 3 4
	  ***		i =3	b = 1 2			s = 1 2 3
	   **		i =4	b = 1 2 3		s = 1 2
	    * 		i =5	b = 1 2 3 4		s = 1
 				i: i는 1부터 입력받은줄까지 1씩증가한다.
 					b: b는 1부터 i-1 까지 1씩증가한다.[3번 문제 유사 ]
 					s :s는 1부터 입력받은줄 -현재줄수 +1 까지 1씩증가. [4번 문제유사]
 별문제7 : 입력받은 줄 만큼 출력
		
        *			i = 1		b = 1 2 3 4		s = 1	
       ***			i = 2		b = 1 2 3		s = 1 2 3
      *****			i = 3		b = 1 2			s = 1 2 3 4 5
     *******		i = 4		b = 1			s = 1 2 3 4 5 6 7 
    *********		i = 5 		b = 			s = 1 2 3 4 5 6 7 8 9
     i : i는 1부터 입력받은줄까지 1씩 증가한다
     	b = b는 1부터 입력받은수 -현재줄수 까지 1씩증가 [5번유사]
	*********		i = 5		b = 
 별문제9 : 입력받은 줄만큼 출력

	*********	i = 1		b =				s = 1 2 3 4 5 6 7 8 9
	 *******	i = 2		b = 1 			s = 1 2 3 4 5 6 7
	  *****		i = 3		b = 1 2			s = 1 2 3 4 5 
	   ***		i = 4		b = 1 2 3		s = 1 2 3
	    *		i = 5		b = 1 2 3 4 	s = 1
 
 
 */