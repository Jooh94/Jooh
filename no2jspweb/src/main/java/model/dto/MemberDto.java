package model.dto;

public class MemberDto {

 private int	bno;		
 private String  btitle; 
 private String   bcontent; 
 private String   bwrite; 
 private String  bdate; 
 private String  bpassword; 
 private int   bview; 

	public MemberDto() {}

	public MemberDto(int bno, String btitle, String bcontent, String bwrite, String bdate, String bpassword,
			int bview) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwrite = bwrite;
		this.bdate = bdate;
		this.bpassword = bpassword;
		this.bview = bview;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBwrite() {
		return bwrite;
	}

	public void setBwrite(String bwrite) {
		this.bwrite = bwrite;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getBpassword() {
		return bpassword;
	}

	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}

	public int getBview() {
		return bview;
	}

	public void setBview(int bview) {
		this.bview = bview;
	}

	@Override
	public String toString() {
		return "MemberDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwrite=" + bwrite
				+ ", bdate=" + bdate + ", bpassword=" + bpassword + ", bview=" + bview + "]";
	}
	
	
 
	
}
