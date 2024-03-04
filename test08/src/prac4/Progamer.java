package prac4;

public class Progamer implements Gamer {
	
	@Override
	public void run(int speed) {
		System.out.println("현재 속도는 "+speed+"입니다.");
	}

	@Override
	public void jump(int height) {
		System.out.println("현재 속도는 "+height+"입니다.");
	}

	@Override
	public void turn(int angle) {
		System.out.println("프로게이머가 "+angle+"로 회전합니다.");
	}

	@Override
	public void show(String name) {
		System.out.println("프로게이머 "+name+" 님이 게임중입니다.");
	}
	
}

