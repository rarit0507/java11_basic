package sec1;
//추상 메소드 : 선언만 하고, 구현 내용 기술X
public interface Computer {	//인터페이스(interface) : 모든 메소드가 추상 메소드임. 기본 abstract
	//구현 클래스에서 반드시 인터페이스에서 정의한 대로 매개변수와 반환타입대로 구현해야 함
	void display();
	void typing();
	void power(boolean sw);
	
}
