package org.kh.object1;
//public > protected > default > private
//모든(*)패키지나클래스 > 동일 패키지or상속or연관 > 동일패키지 > 현재클래스(★for 정보은닉, 캡슐화, 재사용성★)
public class Member {
	private String id;		//public 없으면 디폴트. 이 패키지 내 사용만 가능
	private String pw;		//넣으면 다른 패키지(object2)에서도 동일 명령 시행 가능
	private String email;
	private int birth;		//private일 경우 같은 멤버변수 내에서만 이용 가능.
	private String tel;
	
	//gettersetters
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getBirth() {
		return birth;
	}



	public void setBirth(int birth) {
		this.birth = birth;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	//마우스 우클 - source - generate toString - 나타낼 변수 선택 - generate
	//toStirng: 최고 조상 클래스: Object 클래스
	@Override	//조상 클래스로부터 상속받아서 내용을 바꿔 정의하는 것
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
	}
	//메소드는 절대 private 걸지 않는다!!
	//객체나 클래스를 private으로 걸어 보안 강화(정보은닉/캡슐화/재사용성)
	//메소드를 public으로 설정해
	//1.변수에 특정 값 넣어 저장하는 메소드(setter)
	//2.그걸 출력(getter)
	//by 우클-souce-gettersetter-변수체크-실행
	

}




