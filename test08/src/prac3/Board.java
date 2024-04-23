package prac3;

public class Board {
	private int bno;		//글번호
	private String title;	//제목
	private String uname;	//작성자
	private String content;	//글내용
	private String resdate;	//작성일
	private int visited;	//읽은횟수
	
	public Board () { } //기본(디폴트)생성자
	public Board(int bno, String title, String uname, String content, String resdate, int visited) {
		super();
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
		
	//gettersetter	
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	
}
