package java1.개인반복;

public class ExmenuDTO {
	//1. 필드 sql에서 가져와서 자바형식 바꾸기
	private int gno; 
    private String gdate;
    private int gmoney;
    private String gcomment; 
	//2.생성자
    public ExmenuDTO() {}
	public ExmenuDTO(int gno, String gdate, int gmoney, String gcomment) {
		
		this.gno = gno;
		this.gdate = gdate;
		this.gmoney = gmoney;
		this.gcomment = gcomment;
	}
	//3. 메소드 ( private 사용하면 필요성 높음 사용안하면 필요성 낮아짐 
	// 3번메소드 들어오고 나가고 연결다리해줌 
	public int getGno() {
		return gno;
	}
	public void setGno(int gno) {
		this.gno = gno;
	}
	public String getGdate() {
		return gdate;
	}
	public void setGdate(String gdate) {
		this.gdate = gdate;
	}
	public int getGmoney() {
		return gmoney;
	}
	public void setGmoney(int gmoney) {
		this.gmoney = gmoney;
	}
	public String getGcomment() {
		return gcomment;
	}
	public void setGcomment(String gcomment) {
		this.gcomment = gcomment;
	}
    
 
    
    
    
}
