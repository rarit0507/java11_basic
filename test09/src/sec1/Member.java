package sec1;
//구현 클래스
public class Member extends User{	//추상 클래스 상속 받으면 반드시 구체화 해주어야
	private String id;
	private String pw;
	
	//gettersetter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}
	
	//★★★source - override -connect()★★★
	@Override
	public void connect() {
		System.out.println("회원으로 연결하였습니다.\n ID : "+id+", PW : *******");	//직접 작성해 구체화
	}
	
	

}
