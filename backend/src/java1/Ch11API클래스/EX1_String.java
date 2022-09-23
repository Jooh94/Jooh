package java1.Ch11API클래스;

public class EX1_String {
public static void main(String[] args) {
	
	// 기본자료형으로는 문자열 저장 X -> String 클래스
	// byte -> 문자 	byte[] -> 문자열
	// 키보드 입력 --- 스트림(byte)---> 컴퓨터
	// byte ----> String 생성자
	
	
	byte b = 72; // [숫자]	
	char c = (char)b; System.out.println( c );
	// [char 기능 : (java)유니코드 변환 ] 72 -> H
	
	byte[] bytes = {72, 101 , 108,108, 111,32,74,97,118,97};
	char[] chars = new char[10];
		for( int i = 0 ; i<bytes.length ; i++) {
			chars[i] = (char)bytes[i];
		}
	for(int i = 0 ; i<chars.length; i++) {
		System.out.print(chars[i]);
	}
	
	String str1 = new String(bytes); System.out.println("\n"+str1);
	
	String str2 = new String (bytes,6,4); System.out.println(str2);

	// 2.
	byte[] bytes2 =new byte[100];
	System.out.print("입력 :"); 
	
	try {
		int readByteNo =System.in.read(bytes2);
			//readByteNo : 읽어온 바이트수 저장하는 변수
		//	for( int i = 0 ; i<=bytes2.length; i++) {
		//	System.out.println(bytes2[i]);
		//}
		String str3 =new String(bytes2,0,readByteNo-2);
		System.out.println(str3);
		System.out.println("--------절취선------------");
	}
	catch (Exception e) {}	


}
}




/* 
  예외처리
  	1.일반예외:컴파일전에 오류체크 [ 실행전에 자바가 알고있는 오류는 미리 예외처리]
  			* 외부와 연결 [ 키보드 , DB , FILE , 소켓 등]
 	2.실행예외:컴파일 전에 오류 체크X [ 실행후에발생하는 예외 - 개발자 경험/짐작]
 
 	try{
 		예외 발생 할것같은 코드 / 외부 연결
 	}
 	catch(예외클래스 변수명) {오류 대체 코드 }
 
 
 */




