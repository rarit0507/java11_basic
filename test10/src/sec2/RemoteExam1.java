package sec2;

public class RemoteExam1 {
	public static void main(String[] args) {
		RemoteControl r1;
		
		//RemoteControl(인터페이스)로 객체 생성하려면 구현 내용 기술해야
		r1 = new RemoteControl() {
			int volume;

			public void turnOff() {
				System.out.println("전원 OFF");
			}

			public void turnOn() {
				System.out.println("전원 ON");		
			}

			public void setVolume(int volume) {
				if (volume>MAX) {
					this.volume = RemoteControl.MAX;
				} else if(volume<MIN)
					this.volume = RemoteControl.MIN;
				 else 
					this.volume = volume;
			}
		};
		
		RemoteControl.changeBattery();
		r1.turnOn();
		r1.setVolume(5);
		r1.setMute(true);
		r1.setMute(false);
		r1.setVolume(8);
		r1.turnOff();
		
	}
}
