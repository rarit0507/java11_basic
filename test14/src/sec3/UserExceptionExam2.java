package sec3;

class PwFormatExeption extends Exception {
	public PwFormatExeption(String msg) {
		System.out.println("msg : "+msg);
		System.out.println("암호의 형식 불일치");
	}
}
class Member {
	private String id;
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) throws PwFormatExeption {	//패스워드를 설정하는 setter 메소드에 Exception 설정한 PwFormatExeption를 throws로 떠넘기기
		if(pw == null) {	//원래 문자열은 .equals() 비교해야. 근데 null은 .equals가 안됨
			throw new PwFormatExeption("암호가 비어 있습니다.");
		} else if(pw.length()<8 ||pw.length()>20) {
			throw new PwFormatExeption("비밀번호는 8~20글자 이내로 설정해 주십시오.");
		}
		this.pw = pw;
	}
}

public class UserExceptionExam2 {
	public static void main(String[] args) throws PwFormatExeption {
		Member mem1 = new Member();
		mem1.setId("admin");
		try {
			mem1.setPw("1234");
		} catch (PwFormatExeption e) {
			e.printStackTrace();
		}
		try {
			mem1.setPw(null);
		} catch (PwFormatExeption e) {
			e.printStackTrace();
		}
	}

}
