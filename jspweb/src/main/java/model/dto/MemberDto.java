package model.dto;

public class MemberDto {

	//1. 필드 priavate 특별한 경우아니면 priavate하자
	//2. 생성자 기본2개 : 1.빈생성자 2.풀생성성자 3.그외추가
	//3. get, set 메소드 
	//4. 필드 정보 확인메소드 : toString
	
		private	int mno;	
		private  String mid;				
		private  String   mpassword;								
		private  String   mname;									
		private  String   mphone;									
		private  String  memail;									
		private  String  maddress;							
		private  String  mdate;										
		private	int	mpoint;	
		
		public MemberDto() {}

		public MemberDto(int mno, String mid, String mpassword, String mname, String mphone, String memail,
				String maddress, String mdate, int mpoint) {
			super();
			this.mno = mno;
			this.mid = mid;
			this.mpassword = mpassword;
			this.mname = mname;
			this.mphone = mphone;
			this.memail = memail;
			this.maddress = maddress;
			this.mdate = mdate;
			this.mpoint = mpoint;
		}

		public int getMno() {
			return mno;
		}

		public void setMno(int mno) {
			this.mno = mno;
		}

		public String getMid() {
			return mid;
		}

		public void setMid(String mid) {
			this.mid = mid;
		}

		public String getMpassword() {
			return mpassword;
		}

		public void setMpassword(String mpassword) {
			this.mpassword = mpassword;
		}

		public String getMname() {
			return mname;
		}

		public void setMname(String mname) {
			this.mname = mname;
		}

		public String getMphone() {
			return mphone;
		}

		public void setMphone(String mphone) {
			this.mphone = mphone;
		}

		public String getMemail() {
			return memail;
		}

		public void setMemail(String memail) {
			this.memail = memail;
		}

		public String getMaddress() {
			return maddress;
		}

		public void setMaddress(String maddress) {
			this.maddress = maddress;
		}

		public String getMdate() {
			return mdate;
		}

		public void setMdate(String mdate) {
			this.mdate = mdate;
		}

		public int getMpoint() {
			return mpoint;
		}

		public void setMpoint(int mpoint) {
			this.mpoint = mpoint;
		}

		@Override
		public String toString() {
			return "MemberDto [mno=" + mno + ", mid=" + mid + ", mpassword=" + mpassword + ", mname=" + mname
					+ ", mphone=" + mphone + ", memail=" + memail + ", maddress=" + maddress + ", mdate=" + mdate
					+ ", mpoint=" + mpoint + "]";
		}
	
		
}
