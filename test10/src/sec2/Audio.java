package sec2;

public class Audio implements RemoteControl {	//소리만 있으니 RemoteControl에서 받아도 됨
	
	int volume;
	
	@Override
	public void turnOff() {
		System.out.println("기기 전원 OFF");
	}

	@Override
	public void turnOn() {
		System.out.println("기기 전원 ON");		
	}

	@Override
	public void setVolume(int volume) {
		if (volume>MAX) {
			this.volume = RemoteControl.MAX;
		} else if(volume<MIN) {
			this.volume = RemoteControl.MIN;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨 : "+volume);
	}

}
