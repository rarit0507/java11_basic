package sec2;

public class RemoteExam2 {

	public static void main(String[] args) {
		
		Screen s1 = new Screen() {	//Screen이 인터페이스이기 때문에 Screen 생성자 만들려면 구현 내용 기술해줘야!!
			int volume;
			int lightness;
			int zoom;	//생성자 >>안에<< 선언해줘야 함
			
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
			
			public int light() {
				System.out.println("밝게");
				if(this.lightness < 255 && this.lightness >= 0) {
					this.lightness++;
				}
				return this.lightness;
			}

			public int dark() {
				System.out.println("어둡게");
				if(this.lightness < 255 && this.lightness == 0) {
					this.lightness--;
				}
				return this.lightness;
			}

			public int zoomin() {
				if(zoom>=-500 && zoom>=500)
					zoom+=50;
				return zoom;
			}
			
			public int zoomout() {
				if(zoom>=-500 && zoom>=500)
					zoom-=50;
				return zoom;
			}
		};
		
		RemoteControl.changeBattery();	//static
		s1.turnOn();
		s1.turnOff();
		s1.light();
		s1.light();
		s1.dark();
		s1.zoomin();
		s1.zoomout();
		s1.setVolume(4);
		s1.setMute(true);
		s1.setMute(false);
		s1.turnOff();
		
	}

}
