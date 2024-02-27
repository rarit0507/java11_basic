package sec1;

public class AbstractExam1 {

	public static void main(String[] args) {
		//User u1 = new User();	//User 클래스는 추상 클래스이므로 >>추상 메소드의 구현 내용이 없음<< - 객체생성불가
		User u1;	//선언 먼저 해 놓고 필요한 대로 사용
		u1 = new Member();
		u1.setIp("192.168.1.152");
		u1.setPort(80);	//사용가능 메소드 2개뿐
		u1.connect();
		
		u1 = new Staff();
		u1.connect();
		
		Member u2;
		u2 = new Member();
		u2.setIp("192.168.0.121");
		u2.setPort(80);
		u2.setId("rarit0507");
		u2.setPw("1234");
		u2.connect();
		
		Staff u3;
		u3 = new Staff();
		u3.setIp("192.168.0.164");
		u3.setPort(80);
		u3.setLevel(2);
		u3.setPart("기술부");
		u3.setName("이예린");
		u3.connect();
	}

}
