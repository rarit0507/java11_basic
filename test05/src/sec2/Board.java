package sec2;

public class Board {
	private int bno;
	private String title;
	private String uname;
	private String context;
	private String resdate;
	private int visited;
	
	//생성자 함수(메소드와 달리 매개변수 없이 출력 가능)

	/*생성자 함수 오버로딩 : 생성자 함수에 매개변수 종류나 개수 따라 같은 아룸의 생성자 여러번 정의 */
	/* 멤버 필드값을 적용하여 객체를 만들게 됨 */
	
	//생성자자동생성(우클-source-constructor)-만들고 super지우기
	public Board() { }	//(1)
	public Board(int bno) {		//(2)객체 생성 시에 값을 넣어버림
		this.bno = bno;
	}

	public Board(int bno, String title) {
		this.bno = bno;
		this.title = title;
	}
	public Board(int bno, String title, String uname) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
	}
	public Board(int bno, String title, String uname,String context) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.context = context;
	}
	public Board(int bno, String title, String uname,String context,String resdate) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.context = context;
		this.resdate = resdate;
	}
	public Board(int bno, String title, String uname, String context, String resdate, int visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.context = context;
		this.resdate = resdate;
		this.visited = visited;
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
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", uname=" + uname + ", context=" + context + ", resdate="
				+ resdate + ", visited=" + visited + "]";
	}
	
	
}
