package sec2;

public class RemoteExam3 {

	public static void main(String[] args) {
		Television tel = new Television();	//일반 클래스니 그냥 생성해도 됨
		//Television 자체가 구현되어 있는 클래스이기 때문에 명령어만 사용하면 됨
		
		RemoteControl.changeBattery();
		tel.turnOn();
		tel.setVolume(20);
		tel.setMute(true);
		tel.setMute(false);
		tel.zoomin();
		tel.light();
		tel.dark();
		tel.zoomin();
		tel.zoomout();
		tel.turnOff();
	}

}
