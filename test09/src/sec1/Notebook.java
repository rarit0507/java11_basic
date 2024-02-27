package sec1;

public class Notebook implements Computer{

	@Override
	public void display() {
		System.out.println("노트북의 모니터 기본 해상도 : 1680 x 1050");		
	}

	@Override
	public void typing() {
		System.out.println("노트북은 일체형 키보드를 타이핑합니다.");
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println("노트북의 전원을 켭니다.");
		else System.out.println("노트북의 전원을 끕니다.");		
	}

}
