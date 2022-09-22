package java1.ch13컬렉션프레임워크;

import java.util.ArrayList;

public class EX1_arraylist {
 public static void main(String[] args) {
	
	 //1. 객체 [클래스명 변수명 = new 생성자(); ]
	 //1. 컬렉션프레임워크 객체[클래스명<타입파라미터> 변수명 = new 클래스명<>();]
	 		// < > : 클래스안에 클래스를 매개 넣는 방식
	
	 
	 // 정수 int 여러개를 저장할수 있는 리스트 선언
	 ArrayList<Integer> intlist = new ArrayList<>();
	 
	 //실수 double 여러개를 저장할수 있는 리스트 선언
	 ArrayList<Double> doublelist = new ArrayList<>();
	 
	 // 내가 만든 자료형을 여러개를 저장할수 있는 리스트선언
	 ArrayList<Member> memberlist = new ArrayList<>();
	 
	// String 여러개를 저장할수 있는 리스트 선언
	 ArrayList<String> list = new ArrayList<>(); 
	 
	 // 1.add()
	 list.add("java"); System.out.println("리스트현황 :"+list.toString());  //"java" : String
	 list.add("jdbc"); System.out.println("리스트현황 :"+list.toString());
	 list.add("Servlet/jsp"); System.out.println("리스트현황 :"+list.toString());
	 list.add(2,"database"); System.out.println("리스트현황 :"+list.toString());
	 list.add("ibatis"); System.out.println("리스트현황 :"+list.toString());
	 
	 // 2. size()
	 System.out.println("리스트내 객체수"+list.size());
	 
	 //3. get()
	 System.out.println("특정 인덱스[0] 호출 : "+ list.get(0));
	 System.out.println("특정 인덱스[3] 호출 : "+ list.get(3));
	 
	 //4. remove()
	 System.out.println("특정 인덱스[0] 삭제 :"+list.remove(0));
	 System.out.println("리스트현황 : "+list.toString());
	 System.out.println("동일한 객체로 삭제 :"+list.remove("ibatis"));
	 System.out.println("리스트현황 : "+list.toString());
	 
	 //5.리스트/배열 <----> 반복문
	 	//1.
	 for (int i= 0; i<list.size(); i++) {
		 System.out.println(list.get(i));
		 
	 }
	 	//2.
	 for( String s : list) { 
		 System.out.println(s);
		 
	 }
 
	 
	 
	 //7.  .contains(객체) : 해당 객체가 존재하면 true 아니면 false
	 System.out.println(list.contains("jdbc"));
	 
	 //8.  .contains(객체) : 해당 객체의 인덱스 위치 반환
	 System.out.println(list.indexOf("jdbc"));
	 
	 //9 list.isEmpty() : 리스트가 객체 하나도 없는지 확인 하나도없으면 true / false
	 System.out.println(list.isEmpty());
	 
	 //10 .iterator() : 리스트내 객체 순회 
	 System.out.println(list.iterator());
	 

	 
	 // 함수는 관례적 이름 get~~ , set~~ , is~~
	 
	 
	// 6.
		 list.clear();
 }
}



/* 
 
 	문자열 10개 저장한다
 	1.String [ ] 배열  = new String[10]
 		1.선언된 길이는 변경X
 		2. 추가 삭제 삽입 -> 직접 인덱스 이용해서
 		
 	2.ArrayList<String> 배열 = new ArrayList<>();
 		1. 길이가 자동 [ 기본값 10부터 ]
 		2. 추가 삭제 삭입 -> 함수(미리 만들어지 코드) -> 편리함
 ArrayList 클래스
 		1.리스트명.add( 객체명 ) : 마지막 인덱스에 객체 추가
 		1.리스트명.add( 인덱스 , 객체 ) : 해당 인덱스에 객체 추가
 		
 		2.리스트명.size()  : 리스트내 객체수
 		
 		3.리스트명.get(인덱스) : 해당 인덱스의 객체 호출
 		
 		4.리스트명.remove(인덱스) : 해당 인덱스의 객체 삭제
 		4.리스트명.remove(객체) : 해당 객체 삭제
 		
 		5.리스트명.clear() : 리스트내 모두 객체 삭제 
 		
 		6.리스트명.containe(객체) : 해당 객체 여부 확인 [true /false]
 		7.리스트명.indexOf(객체)  : 해당 객체 인덱스 번호 [있읅ㅇ우 =번호 / 없을경우 = -1]
 		8.리스트명.isEmpty()		: 리스트가 비어이쓴경우 [true /false]
 		9.리스트명.iterator()		: 리스트내 객체 순회

 ArrayList 클래스
 	ArrayList<자료형/클래스> 리스트명 = new ArrayList<>();
   *동기화 지원X 
   *추가/검색 빠르다
	객체1	객체2	객체3	객체4	객체5
	[0]		[1]		[2]		[3]		[4]
 Vector 클래스
 	Vector<자료형/클래스> 리스트명 = new Vector<>();
 	동기화 지원O 
 LinkedList 클래스
 	* 구조가 다름
 	* 중간 삽입/삭제 빠름
 	
 	객체1<--링크--> 객체2<---->객체3<---->객체4<--->객체5
 	
 [암호화]
 		데이터---->해시---->코드[컴퓨터 이해가능한]
 set 인터페이스
 	*순서[인덱스]없다.[데이터로 식별하기 때문에 중복불가능]
 		-데이터-->해시함수[.hashCode()] -->16진수 주소
 	1.add(객체)
 	2.size()
 			*get():인덱스가 없어서 X
 	3.remove(객체)
 	4.clear()
 	5.isEmpty()
 	6.*iterator()
 	7. .contains(객체)	
 
 Map 인터페이스
 		* 순서[인덱스]없다.
 		* key:중복불가,value:중복가능 : entry
 	1. .put(키:값)	:엔트리 추가
 	2. .get(키)		:해당 키의 값 호출
 	3. .remove(키)	:해당 키의 엔트리 삭제
 	4. .keySet()	:모든 키 를 호출[set]
 	5. .size()
 	6. .containskey(키) : 해당 키가 존재하는지 확인
 	7. .containsvalue(값) : 해당 값이 존재하는지 확인
 	
 	List			set				Map
 	1.인덱스O			1.인덱스X			1.인덱스x
 	2.중복허용O		2.중복허용X		2.엔트리(키,값)
 									3.키(set):중복불가능
 									4.값:중복 가능
 	[인덱스 사용]						[키 사용]
 	
 	
 ------------------------------------해쉬맵 ex
 학년별 학생 리스트
 Map<int.ArrayList<Sutdent>>map= new HashMap<>();
 	ArrayList<Student>list 1= new ArrayList<>();
 	ArrayList<Student>list 2= new ArrayList<>();
 	ArrayList<Student>list 3= new ArrayList<>();
 	
 	map.put(1,list)
 ----------------------------------------------
 */