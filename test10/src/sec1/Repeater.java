package sec1;

public abstract class Repeater implements Calculator {
	//추상메소드(오버라이딩)
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		int su = 0;
		if(num1>num2) su = num1-num2;
		else su=num2-num1;
		return su;
	}
	//구현된 메소드(최종 실행 시 Repeater 선언된 인스턴스(by 생성자)로 이용 가능)
	public int power(int num1, int num2) {
		int tmp = num1;
		for(int i=1;i<num2;i++) {
			num1 = num1*tmp;
		}
		return num1;
	}
}
