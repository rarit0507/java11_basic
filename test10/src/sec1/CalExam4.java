package sec1;

public class CalExam4 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 3;
		
		Calculator cal1;
		
		//메소드의 구현 내용이 없어 인터페이스(Calculator) 생성자로 객체 생성 불가.
		//그러나 실행 클래스에 메소드의 구현 내용을 별도로 기술하면 객체 생성 가능. 
		//cal1 = new Calculator() { 구현 내용 };
		
		cal1 = new Calculator() {	//+구현내용
		
			public int add(int num1, int num2) {
				return num1+num2;
			}
			public int subtract(int num1, int num2) {
				int su = 0;
				if(num1>num2) su = num1-num2;
				else su=num2-num1;
				return su;
			}
			public int multiply(int num1, int num2) {
				return num1*num2;
			}
			public int divide(int num1, int num2) {
				int su = 0;
				if(num1>num2) su = num1 / num2;
				else su = num2 / num1;
				return su;
			}
			/*
			public int power(int num1, int num2) {
				int tmp = num1;
				for(int i=1;i<num2;i++) {
					num1 = num1*tmp;
				}
				return num1;
			}
			public void print() {
				System.out.println("계산기, 중계기, 연산기를 구현합니다.");
			} */
		};
		
		//cal1.print();	//얘는 Arithmatic(자식-구현클래스)에 선언된 애라서 사용 불가
		System.out.println("원주율 : "+cal1.PI);
		System.out.println("덧셈 : "+cal1.add(num1,num2));
		System.out.println("뺄셈 : "+cal1.subtract(num1,num2));
		System.out.println("곱셈 : "+cal1.multiply(num1,num2));
		System.out.println("나눗셈 : "+cal1.divide(num1,num2));
		//System.out.println("거듭제곱 : "+cal1.power(num1,num2));	//얘는 Repeater(자식-추상클래스)에 선언된 애라서 사용 불가
		
	}
}
