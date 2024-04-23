package sec1;

public class Desktop implements Computer{	//implements:인터페이스 상속, Computer: 부모클래스(인터페이스)
	//기본이 public 메소드로 형성됨
	//반환 타입, 매개변수 형태 똑같이
	@Override
	public void display() {
		System.out.println("데스크탑의 모니터 기본 해상도 : 1920 x 1080");
	}

	@Override
	public void typing() {
		System.out.println("데스크탑은 별도의 마련된 키보드를 타이핑합니다.");
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println("데스크탑의 전원을 켭니다.");
		else System.out.println("데스크탑의 전원을 끕니다.");
	}
	
	//오버로딩
	public void power(String name, boolean sw) {}	//override가 오류 나면 overload해라

}
