package model;

public class BooklentDTO {
	private int lentno;
	private int userno;
	private int bookno;
	private String outdate;
	private String indate;
	
	public int getLentno() {
		return lentno;
	}
	public void setLentno(int lentno) {
		this.lentno = lentno;
	}
	public int getUserno() {
		return userno;
	}
	public void setUserno(int userno) {
		this.userno = userno;
	}
	public int getBookno() {
		return bookno;
	}
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	public String getOutdate() {
		return outdate;
	}
	public void setOutdate(String outdate) {
		this.outdate = outdate;
	}
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
}
