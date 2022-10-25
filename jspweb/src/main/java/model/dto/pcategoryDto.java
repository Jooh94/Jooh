package model.dto;

public class pcategoryDto {

	private int pcno;
	private String pcname;
	
	
	public pcategoryDto() {}


	public pcategoryDto(int pcno, String pcname) {
		super();
		this.pcno = pcno;
		this.pcname = pcname;
	}


	public int getPcno() {
		return pcno;
	}


	public void setPcno(int pcno) {
		this.pcno = pcno;
	}


	public String getPcname() {
		return pcname;
	}


	public void setPcname(String pcname) {
		this.pcname = pcname;
	}


	@Override
	public String toString() {
		return "pcategoryDto [pcno=" + pcno + ", pcname=" + pcname + "]";
	}
	
	
	
}
