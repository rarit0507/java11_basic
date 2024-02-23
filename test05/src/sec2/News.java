package sec2;
//Top-Down 생성자 함수 방식
//this. = 해당 클래스 내 변수 의미
//this() = 현재 생성자 함수
public class News {
	private int bno;
	private String title;
	private String uname;
	private String context;
	private String resdate;
	private int visited;
	
	//Top-Down 방식의 생성자함수 오버로딩(위에 있는 것 사용해 호출 -> 아래 식들의 기본값(초기값) 얻어 맨 마지막 생성자함수 출력
	public News() {
		this(1);
	}
	
	public News(int bno) {
		this(bno, "뉴스 제목");
	}
	
	public News(int bno, String title) {
		this(bno, title, "admin");
	}
	
	public News(int bno, String title, String uname) {
		this(bno, title, uname, "뉴스 내용");
	}
	
	public News(int bno, String title, String uname, String context) {
		this(bno, title, uname, context, "2024-02-23");
	}
	
	public News(int bno, String title, String uname, String context, String resdate) {
		this(bno, title, uname, context, resdate, 0);
	}
	
	//생성자함수
	public News(int bno, String title, String uname, String context, String resdate, int visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.context = context;
		this.resdate = resdate;
		this.visited = visited;
		
		
	//개별요소접근 가능하게(gettersetter, toString)
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

	@Override
	public String toString() {
		return "News [bno=" + bno + ", title=" + title + ", uname=" + uname + ", context=" + context + ", resdate="
				+ resdate + ", visited=" + visited + "]";
	}
	
	
	
	
}
