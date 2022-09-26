package java1.타자연습게임;

public class 회원가입DTO {

	//1 필드
	private int mno;
	private String pw;
	private String mname;
	private String mnn;
	
	//2.생성자
	public 회원가입DTO() {}
	//풀생성자

	public 회원가입DTO(int mno, String pw, String mname, String mnn) {
		this.mno = mno;
		this.pw = pw;
		this.mname = mname;
		this.mnn = mnn;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMnn() {
		return mnn;
	}

	public void setMnn(String mnn) {
		this.mnn = mnn;
	}
	
	
}
