package sec2;

public interface RemoteControl {
	int MAX = 10;	//==상수(final static)
	int MIN = 0;	
	
	//추상 메소드(다 public)
	void turnOff();
	public void turnOn();
	public void setVolume(int volume);
	
	//디폴트 메소드(default method)
	//인터페이스의 메소드는 기본이 추상 메소드이므로 선언만 해야 함.
	// 그러나 구현 내용을 기술하고 싶으면 기본 접근제한자를 default로 표기(같은 패키지)
	//같은 패키지 내에 있는 클래스에서 default 메소드를 호출하여 실행 가능
	//오버라이딩 가능
	default void setMute(boolean mute) {
		if(mute) System.out.println("무음 처리");
		else System.out.println("무음 해제");
	}
	//구현 내용 기술이 필요한 경우 static으로 지시자 선언하면 됨
	//객체 생성 없이 public 접근 제한으로 메소드를 호출하여 실행 가능
	//오버라이딩 불가능
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}
