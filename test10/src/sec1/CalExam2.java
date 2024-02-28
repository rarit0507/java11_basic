package sec1;

public class CalExam2 {
	public static void main(String[] args) {
		Calculator cal1;	//인터페이스로 객체 선언은 가능
		int num1 = 40;
		int num2 = 3;
		//추상체로는 객체 생성 불가(구현 내용이 기술되어 있지 않아서) => 그럼 구현 내용 기술하면 되지
		//Calculator cal1 = new Calculator();
		//cal1 = new Repeater();
		/*
		Calculator cal1 = new Calculator() {
			//소스-오버라이드 안 나오니 수동으로 칠 수 있음
		} */
		cal1 = new Arithmatic();	//Arithmatic 클래스 안에 구현 내용 작성됨 & 구현 내용 물려받음
		
		//cal1은 Calculator로 선언되어 있음.
		//Calculator에 print(), power() 없으므로 해당 메소드 사용 불가(조상 클래스로 선언하면 조상에 있는 메소드만 사용 가능)
		
		//cal1.print();
		System.out.println("원주율 : "+cal1.PI);
		System.out.println("덧셈 : "+cal1.add(num1,num2));
		System.out.println("뺄셈 : "+cal1.subtract(num1,num2));
		System.out.println("곱셈 : "+cal1.multiply(num1,num2));
		System.out.println("나눗셈 : "+cal1.divide(num1,num2));
		//System.out.println("거듭제곱 : "+cal1.power(num1,num2));
		
		//따라서 조상 인터페이스로 선언, 자식 클래스의 생성자로 생성된 인스턴스(객체)는
		//조상 인터페이스에 선언된 메소드만 활용 가능
		//실행되는 내용은 자식 클래스에서 구현된 메소드임.
		
		//인터페이스 => 클래스 상속 : implements(구체화 : 구현 내용 기술)
		//클래스 => 클래스, 인터페이스 => 인터페이스 : extends(확장)
	}
}
