package sec2;

public class Television implements Screen {
//Screen 추상 메소드 구현화 => Screen인터페이스 선언 시 구현화 된 메소드 갖다 씀(자식클래스니까 가능)
	int volume;
	int lightness;
	int zoom;
	
	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
	}

	@Override
	public void turnOn() {
		System.out.println("전원 ON");		
	}

	@Override
	public void setVolume(int volume) {
		if (volume>MAX) {
			this.volume = RemoteControl.MAX;
		} else if(volume<MIN)
			this.volume = RemoteControl.MIN;
		 else 
			this.volume = volume;
		}
	
	@Override
	public int light() {
		System.out.println("밝게");
		if(this.lightness < 255 && this.lightness >= 0) {
			this.lightness++;
		}
		return this.lightness;
	}

	@Override
	public int dark() {
		System.out.println("어둡게");
		if(this.lightness < 255 && this.lightness == 0) {
			this.lightness--;
		}
		return this.lightness;
	}

	@Override
	public int zoomin() {
		if(zoom>=-500 && zoom>=500)
			zoom+=50;
		return zoom;
	}
	
	@Override
	public int zoomout() {
		if(zoom>=-500 && zoom>=500)
			zoom-=50;
		return zoom;
	}
	
}


