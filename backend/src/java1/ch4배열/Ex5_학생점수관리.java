package java1.ch4배열;

import java.util.Scanner;

public class Ex5_학생점수관리 { // classs
	 public static void main(String[]args) { // main s
		
		 
		 boolean run = true ;  // 무한루프 제어 변수
		 int stdentNum = 0 ; // 학생수 저장할 변수
		 int[] scores = null; // 여러개 점수를 저장할 배열 [ 메모리 할당 전 ]
		 Scanner scanner = new Scanner(System.in); //입력객체
		 
		 while(run){ //무한루프 s
			 System.out.println("------------------------");
			 System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			 System.out.print("선택 : "); int selectNo = scanner.nextInt();
			 
			 if(selectNo ==1) 
			 	{
				 System.out.println("학생수 : "); stdentNum =scanner.nextInt();
				 scores = new int[stdentNum]; //입력받은 학생수 만큼 배열에 메모리(길이) 할당
				 System.out.println("배열에 " + stdentNum +"명의 점수 입력 가능");
			 	} // 1 입력했을때
 			 else if (selectNo ==2) // 2 입력했을때 ( 학생수 입력전 실행 불가)
 			 	{
 				 	for( int i = 0 ; i<scores.length ; i++) { // i 는 0부터 배열의길이까지 1씩증가반복
 				 		System.out.print("scores["+i+"]:"); 
 				 		scores[i] = scanner.nextInt(); // i번째 인덱스의 입력값을 대입
 				 	}
 			 	} 
			 else if (selectNo ==3)//3 입력했을때
			 	{
				 	
				 	for( int i = 0 ; i<scores.length ; i ++) {
				 			// sssSystem.out.println("scores["+i+">"+scores[i]);
				 			System.out.printf("scores[%d]> %d \n", i,scores[i]);
				 	}//for end
			 	} 
			 else if (selectNo ==4)//4 입력했을때
			 	{
				 int max = 0;	// 최고점수
				 int sum = 0; 	//평균 구하기전에 합계 구하기
				 for( int value : scores) {
				 		if(value > max){ max = value;}// 만약에 해당 값이 max보다 크면 max 대입
				 		sum += value; //해당 값을sum 변수에 누적 더하기
				 	}//for end
				 	System.out.println("최고 점수 : "+ max);
				 	double avg =(double)sum / scores.length;
				 				//* 강제형변환 int -> double
				 	System.out.println("평균 점수 : "+ avg); // 평균: 합계/개수
				 	
				 	//* 순위별[내림차순] 출력
				 	for ( int i = 0 ; i<scores.length; i++) {
				 		for( int j = i+1 ; j<scores.length ; j++) {
				 			if(scores[i]> scores[j]) {
				 				int	temp = scores[i];
				 				scores[i] = scores[j];
				 				scores[j] = temp;
				 			}// if e
				 		} // for e
				 	}// fore
				 	//확인
				 	int rank = 0;
				 	for( int value : scores) {
				 		System.out.println((rank+1)+"순위점수 : "+value);
				 		rank++;
				 	}
			 	} 
			 else if (selectNo ==5)
			 	{run=false;} //5 입력했을때
			 else {System.out.println("안내) 알수 없는 번호입니다.");} //그외 입력했을때
 			 
		 }// while e
		 System.out.println("프로그램 종료");
		 
	} // main e
} //class e
