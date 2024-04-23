package sec1;

public class CalExam5 {

	public static void main(String[] args) {
		int num1 = 83;
		int num2 = 23;
		
		Repeater rep2;
		rep2 = new Repeater() {	//+구현내용
			/*
			public int add(int num1, int num2) {
				return num1+num2;
			}
			public int subtract(int num1, int num2) {
				int su = 0;
				if(num1>num2) su = num1-num2;
				else su=num2-num1;
				return su;
			} */	//필수 아님 - 이미 Repeater에 기술되어 있으므로
			public int multiply(int num1, int num2) {
				return num1*num2;
			}
			public int divide(int num1, int num2) {
				int su = 0;
				if(num1>num2) su = num1 / num2;
				else su = num2 / num1;
				return su;
			}
			public int power(int num1, int num2) {
				int tmp = num1;
				for(int i=1;i<num2;i++) {
					num1 = num1*tmp;
				}
				return num1;
			}
			/*
			public void print() {
				System.out.println("계산기, 중계기, 연산기를 구현합니다.");
			} */
		};
		
		//rep2.print();	//얘는 Arithmatic(자식-구현클래스)에 선언된 애라서 사용 불가
		System.out.println("원주율 : "+rep2.PI);
		System.out.println("덧셈 : "+rep2.add(num1,num2));
		System.out.println("뺄셈 : "+rep2.subtract(num1,num2));
		System.out.println("곱셈 : "+rep2.multiply(num1,num2));
		System.out.println("나눗셈 : "+rep2.divide(num1,num2));
		System.out.println("거듭제곱 : "+rep2.power(num1,num2));	//Repeater에 구현된 메소드라 구현 내용 입력 시 이용 가능
	}

}
