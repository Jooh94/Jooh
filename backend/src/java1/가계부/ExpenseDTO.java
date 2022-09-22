package java1.가계부;

public class ExpenseDTO {
	// 1.필드 sql에 있는거 가져와서 자바형식으로 바꾸기 
	private int eno; 
	private String edate; 
	private int emoney; 
	private String ecomment; 
	//2. 생성자
	public ExpenseDTO(){} // 빈생성자 생성
	// 풀 생성자 값 넣어준거 
	public ExpenseDTO(int eno, String edate, int emoney, String ecomment) {
		
		this.eno = eno;
		this.edate = edate;
		this.emoney = emoney;
		this.ecomment = ecomment;
	}
	//3 GETTER SETTER 메소드
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public int getEmoney() {
		return emoney;
	}
	public void setEmoney(int emoney) {
		this.emoney = emoney;
	}
	public String getEcomment() {
		return ecomment;
	}
	public void setEcomment(String ecomment) {
		this.ecomment = ecomment;
	}
	
	
	
	
	
}
