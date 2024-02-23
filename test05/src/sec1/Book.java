package sec1;

public class Book {
	private int bno;
	private String bname;
	private int price;
	private String author;
	private String pub;
	
	//gettersetter
	
	@Override
	public String toString() {
		return "Book [bno=" + bno + ", bname=" + bname + ", price=" + price + ", author=" + author + ", pub=" + pub
				+ "]";
	}
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	
	//오버로드에서 변수형마다 개수 같은 건 하나만 만들 수 있음
	//ex. String bname 만들고 String author 만들기 불가(String1개짜리)
	//but String bname, String author 가능(String2개)
	public void print() {
		System.out.println("교재 정보");
	}
	public void print(String bname) {
		System.out.println("교재명 : bname");
	}
	public void print(int price) {
		System.out.println("교재가격 : price");
	}
	public void print(String bname, int price, String author) {
		System.out.println("교재명 : "+ bname);
		System.out.println("교재가격 : "+ price);
		System.out.println("교재저자 : " + author);
	}
}
