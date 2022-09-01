package java1.a변수;

public class Ex3_문자열 { //class s
	
	public static void main(String[] args) { //main s
		
		//p.64 string 타입 [ string 클래스]
		
				//char 문자 = "자바";    //오류발생 :char 문자 한개만 저장가능 
		String 문자열 = "자바";
		
		//pp.65
		String name ="홍길동"; System.out.println(name);
		String job = "프로그래머"; System.out.println(job);
		
		//p.66
		System.out.println("안녕하세요"); // println: 출력후 줄바꿈처리
		System.out.print("자바입니다."); // print:출력후 줄바꿈처리 x
		System.out.println("하하하하하");
		
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
		
		System.out.println("\t\\    /\\");
		System.out.println("\t )  ( ')");
		System.out.println("\t(  /  )");
		System.out.println("\t \\(__)|");
		
		System.out.println("\t|\\_/|");
		System.out.println("\t|q p|\t/}");
		System.out.println("\t( 0 )\"\"\"\\");
		System.out.println("\t|\"^\"`\t |");
		System.out.println("\t||_/=\\\\__|");
		
		System.out.print("\t[[ 출석부 ]]\n");
		System.out.print("-------------------------");
		System.out.print("\n이름\t1교시\t2교시\t3교시");
		System.out.print("\n유재석\t출석\t결석\t출석");
		System.out.print("\n강호동\t출석\t결석\t출석");
		System.out.print("\n------------------------");
	} //main e

}// class e
/*
	문자[한글자]		:char		: '자'
	문자열[두글자 이상]	:String		:"자바입니다"
	
	
	console 화면에 출력하는 함수
	print()		: 출력만 
	println()	: 출력 후 줄바꿈[\n] 포함
	printf()	: 형식문자 출력
	
	-제어[이스케이프]문자
		1.\n : 줄바꿈 2.\t: 들여쓰기[tab 5칸]
		3.\": "출력
			"홍길동" ----->홍길동
			"\"홍길동\"" ---->"홍길동"
*/