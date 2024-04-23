package sec2;

public class Notice {
	private int bno;
	private String title;
	private String uname;
	private String context;
	private String resdate;
	private int visited;
	
	//getset 메소드 생성하지 않고 바로 생성자 함수(수정불가)
	public Notice(int bno, String title, String uname, String context, String resdate, int visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.context = context;
		this.resdate = resdate;
		this.visited = visited;
		
		
	}
	//toString
	@Override
	public String toString() {
		return "Notice [bno=" + bno + ", title=" + title + ", uname=" + uname + ", context=" + context + ", resdate="
				+ resdate + ", visited=" + visited + "]";
	}
	
	
}
