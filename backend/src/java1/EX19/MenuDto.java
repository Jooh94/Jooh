package java1.EX19;

public class MenuDto {

	
	private int mno;
	private String mname;

	public MenuDto() {}

	public MenuDto(int mno, String mname) {
		super();
		this.mno = mno;
		this.mname = mname;
	}
	
	// 3. 메소드
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void getMname(String mname) {
		this.mname =mname;
	}


}
