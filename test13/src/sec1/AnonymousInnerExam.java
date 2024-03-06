package sec1;

class Outer3 {	//외부 클래스
	//익명의 내부 클래스를 선언 시에는 Runnable(인터페이스. 실행가능한)로 구현해야 함.
	//Runnable 구현 내용
	Runnable getRunnable(int i) {	//Runnable은 인터페이스이므로, 인스턴스 생성 시 기본 메소드인 run()의 내용을 기술해주어야 함.
		int num = 100;	//지역변수
		
		return new Runnable() {
			@Override
			public void run() {
				//int i		=> 매개변수로 이미 상단에 i가 있기 때문에 중복되어 오류 발생
				//int num	=> 지역변수로 이미 상단에 num가 있기 때문에 중복되어 오류 발생
				System.out.println(i); 	//i => 매개 변수
				System.out.println(num);	//num => 지역 변수
			}
			
		};
	}
	//결국 얘가 내부 클래스와 같음
	//익명의 실행 인스턴스(객체)를 Runnable 생성
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable로 구현된 익명의 내부 클래스");
		}
	};
	
}

public class AnonymousInnerExam {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.getRunnable(500);	//오류는 없으나 Runnable이 만들어지지 않아 구현 내용은 실행되지 않음
		out.runner.run();
		//Runnable만들고 하기 ↓
		Runnable runAble = out.getRunnable(500);	//외부 클래스의 내부 클래스 없이 생성된 인스턴스(runAble)는  사용 가능
		runAble.run();
		
		//외부, 내부 클래스 이름 사용하지 않음 => 익명의 내부 클래스
	}
}
