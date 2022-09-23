package java1.Ch11API클래스;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class EX4_달력 {
	//1. 필드
	Scanner scanner = new  Scanner(System.in); // 입력객체
	Calendar cal = Calendar.getInstance(); // 달력객체
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH)+1;
	int day = cal.get(Calendar.YEAR);
	//2.생성자
	
	//3. 메소드
	void run() {
		while(true){
		///////////////////////////////////////////////////////////////
		//** 현재날짜를 이용한 1일 요일 찾기
		cal.set(year, month-1,1);// 현재월의1 일 날짜로 세팅
			//  연도   월      일 설정 준거임
		int sweek = cal.get(Calendar.DAY_OF_WEEK); // 현재 월의 1일의 요일
		//** 현재날짜의 마지막 일 수 찾기
		int eday =cal.getActualMaximum(Calendar.DAY_OF_MONTH); 
		System.out.println("마지막일 :"+eday);
			
			///출력 코드///
		
		System.out.printf("====== %d 년 %d 월 의 달력========== \n",
				year , month );
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		// 1. 1일의 전까지 공백 반복문
		for ( int i = 1 ; i< sweek; i++) {System.out.print("\t");} 
		// 1번 반복문 돌리는 이유 공백자리 넣기위해서 
		// 2. 1일부터~ 마지막
		for( int i =1 ; i<=eday; i++) {
			System.out.printf("%2d \t",i);
			// 토요일 이후[sweek 7의 배수이면]에 줄 바꿈 처리
			if (sweek % 7 == 0) {System.out.println();}
			sweek ++; // 일수를 출력할때마다 요일도 증가처리
		
		}
		일정출력();	//2
		System.out.println("\n=======================================");
		
		//////////////////////////////////////////////////////////////
		System.out.println("<이전달[1] >다음달[2] 검색[3] 일정추가[4] : ");
		int btn= scanner.nextInt();
			// 이전달 : 월에서 차감[ 만일 월이 0이면 월=12 설정 연도 1차감]
		if(btn==1) {month--;if( month==0) {month=12; year--;}}
		else if(btn ==2) {month++; if(month ==13) {month=1; year++;}}
		else if(btn==3)  {
			System.out.println("검색 연도 :"); int inyear = scanner.nextInt();
			System.out.println("검색 월 :"); int inmonth = scanner.nextInt();
			if( inyear<1900 || inyear >9999 && (inmonth <1|| inmonth>12)) {
				System.out.println("경고 : 지원하지 않는 연도 입니다");
			}else {year = inyear; month = inmonth;}
			
		}
		else if(btn == 4) {일정추가();}
		
		
		}
		
		//출력코드//
	}// run 메소드 1
	void 일정추가() { // 날짜 ,메모 등
		System.out.println("날짜 :"); String cdate = scanner.next();
		System.out.println("메모 :"); String ccomment = scanner.next();
		boolean result = 달력Dao.getInstance().일정추가( cdate,ccomment);
		if(result) {System.out.println("일정등록");}
		else {System.out.println("일정등록실패");}
	} 
	
	void 일정출력() {
		System.out.println("\n-----일정확인-------");
		System.out.println("번호\t날짜\t\t메모");
		
		String strmonth = "";
		if(month < 10) {strmonth = "0"+month;}
		else {strmonth = month+"";}
		
		HashMap<Integer, ArrayList<String>> map
			= 달력Dao.getInstance().일정출력(String.valueOf(year),strmonth);
		
		for( Integer key : map.keySet()) {
			//keySet() :모든 키 호출
			System.out.print(key+"\t");
			for(String s : map.get(key)) {
				System.out.print(s+"\t");
			}
			System.out.println();
		}
		
	}
	

}








