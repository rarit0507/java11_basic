package sec1;

public abstract class User {	//추상 클래스: 단 하나의 메소드라도 추상화 메소드가 있음.
	protected String ip;
	protected int port;
	
	//gettersetter
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	//메소드 추가
	//추상화는 대부분 메소드에 함
	public abstract void connect();	//추상 메소드 : 메소드의 기능 구현 내용 기술X. 선언만★★★(class 앞에 abstract 넣어줘야)
	
	//toString() 
	@Override
	public String toString() {
		return "User [ip=" + ip + ", port=" + port + "]";
	}
}
