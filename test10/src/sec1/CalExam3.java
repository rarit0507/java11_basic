package sec1;

public interface CalExam3 {
	public static void main(String[] args) {
		
		Repeater rep1;
		int num1 = 96;
		int num2 = 67;
		
		//자식 클래스로 선언된 인스턴스는 부모 생성자로 생성 불가
		//rep1 = new Calculator();	//조상 클래스로 업그레이드 생성자 불가
		
		//Repeater는 추상클래스라 생성자로 생성 불가
		//rep1 = new Repeater();
		
		rep1 = new Arithmatic();	//자식 구현 클래스에는 생성 가능
		
		//rep1은 Repeater로 선언되어 있음. Repeater에는 print()가 선언되어 있지 않음.
		//rep1.print();		//print()는 자식 클래스인 Arithmatic에 있어서 사용 불가
		System.out.println("원주율 : "+rep1.PI);
		System.out.println("덧셈 : "+rep1.add(num1,num2));
		System.out.println("뺄셈 : "+rep1.subtract(num1,num2));
		System.out.println("곱셈 : "+rep1.multiply(num1,num2));
		System.out.println("나눗셈 : "+rep1.divide(num1,num2));
		System.out.println("거듭제곱 : "+rep1.power(num1,num2));	//power는 Repeater에 선언되어 있음. 내용은 자식클래스 Arithmatic에 선언된 내용으로 나옴.
	}
}
