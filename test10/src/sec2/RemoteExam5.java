package sec2;
//형 변환
public class RemoteExam5 {

	public static void main(String[] args) {
		RemoteControl r;
		
		r = new RemoteControl() {
			int volume;
			public void turnOff() {System.out.println("기기 전원 Off"); }
			public void turnOn() {System.out.println("기기 전원 On"); }
			public void setVolume(int volume) {
				if(volume>MAX) this.volume = RemoteControl.MAX;
				else if(volume<MIN) this.volume = RemoteControl.MIN;
				else this.volume=volume;
				}
			};
		
		//형 변환
		r = new Screen() {
			int volume;
			int lightness;
			int zoom;
			public void turnOff() {System.out.println("기기 전원 Off"); }
			public void turnOn() {System.out.println("기기 전원 On"); }
			public void setVolume(int volume) {
				if(volume>MAX) this.volume = RemoteControl.MAX;
				else if(volume<MIN) this.volume = RemoteControl.MIN;
				else this.volume=volume;
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
			@Override
			public int zoomout() {
				if(zoom>=-500 && zoom>=500)
					zoom-=50;
				return zoom;
			}
			
		};
		
		r = new Television();
		
		r = new Audio();
	}
}
	
//Audio는 Screen을 상속받은 것이 아니기 때문에 형 변환 시 메소드 이용 X