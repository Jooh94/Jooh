package java1.ch10예외처리;

public class EX_2예외처리 {
public static void main(String[] args) {
	
	// 0.
	
	try {
	Class clazz = Class.forName("java.lang.String2");
				//Class.forName : 일반예외발생
	} catch (Exception e) {System.out.println(e);}
	
	
	// 1. NullPointer
	//String date = null;
	//System.out.println(data.toString());
	
	//2. ArrayUIndexOutOfBounds
	try {
	System.out.println(args);
	String data1 =args[0];
	
	} catch (Exception e) {System.out.println(e);}
	
	
	//String date1 = "100";
	//String date2 = "a100";
	
	// 메소드 호출방법1 : Static메소드는 : 클래스명.메소드명( )
//	int value1 = Integer.parseInt(date1);
	//int value2 = Integer.parseInt(date2);
	
//	int result = value1+ value2;
	//System.out.println(date1+date2+ "="+result);
	
	
	//1. 자식 객체 선언
//	Dog dog = new Dog();
//	changeDog(dog);
	
	//2.자식 객체 선언
//	Cat cat = new Cat();
//	changeDog(cat);
//}

	//public static void changeDog(Animal animal) {
		//Dog dog = (Dog)animal;
	
	}

}
