package java1.Ch7상속;

public class Student extends People {
	
	int stdentNo;
	public Student(String name , String ssn , int studentNo) {
		
		super(name, ssn);
		this.stdentNo =studentNo;
	}
	
}
