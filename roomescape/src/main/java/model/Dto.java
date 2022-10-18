package model;

public class Dto {

	private  int rno; 
	private String rid;			
	private String rpassword;							
	private String rphone;							
	private String remail;				
	private String rdate;
	
	public Dto() {}

	public Dto(int rno, String rid, String rpassword, String rphone, String remail, String rdate) {
		super();
		this.rno = rno;
		this.rid = rid;
		this.rpassword = rpassword;
		this.rphone = rphone;
		this.remail = remail;
		this.rdate = rdate;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getRpassword() {
		return rpassword;
	}

	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}

	public String getRphone() {
		return rphone;
	}

	public void setRphone(String rphone) {
		this.rphone = rphone;
	}

	public String getRemail() {
		return remail;
	}

	public void setRemail(String remail) {
		this.remail = remail;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	@Override
	public String toString() {
		return "dto [rno=" + rno + ", rid=" + rid + ", rpassword=" + rpassword + ", rphone=" + rphone + ", remail="
				+ remail + ", rdate=" + rdate + "]";
	}
	
	
	
	
	
}
