package sec1;

public class Arithmatic extends Repeater {	//클래스 상속받음(extends)
	
	public void print() {
		System.out.println("계산기, 중계기, 연산기를 구현합니다.");
	}

	@Override
	public int multiply(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		int su = 0;
		if(num1>num2) su = num1 / num2;
		else su = num2 / num1;
		return su;
	}
}
