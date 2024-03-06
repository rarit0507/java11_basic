package sec2;
//함수(메소드) 정의와 사용 방법
//메소드 기술
class Met1 {	
	void method1() {	//매개변수X 반환X
		int x = 100, y = 200;
		System.out.println(x+y);
	}
}
class Met2 {
	void method2(int x, int y) {	//매개변수O 반환X
		System.out.println(x+y);
	}
}
class Met3 {
	int method3() {	//매개변수X 반환O
		int x = 100, y = 200;
		return x+y;
	}
}
class Met4 {
	int method4(int x, int y) {	//매개변수O 반환O
		return x+y;
	}
}

public class FunctionExam {
	public static void main(String[] args) {
		System.out.println("메소드(Method)");
		//메소드(Method) :특정 클래스에 멤버로 규정되어 있어 객체 생성을 하고, >>>해당객체.메소드명(값)<<<
		Met1 met1 = new Met1();	//클래스 인스턴스 생성
		met1.method1();
		
		Met2 met2 = new Met2();
		met2.method2(100, 200);
		
		Met3 met3 = new Met3();
		System.out.println(met3.method3());
		
		Met4 met4 = new Met4();
		System.out.println(met4.method4(100, 200));
		
		System.out.println("함수(Function)");
		//함수(Function) : 메인 메소드가 있는 클래스에 규정됨, 객체 생성 없이 호출. 다른 클래스에서 재활용 불가
		System.out.println();
		fnc1();
		fnc2(100,200);
		System.out.println(fnc3());
		System.out.println(fnc4(100,200));
	}
	
	//함수: 메인 메소드가 있는 클래스에 규정하는 것
	public static void fnc1() {	//매개변수X 반환X
		int x = 100;
		int y = 200;
		System.out.println(x+y);
	}
	
	public static void fnc2(int x, int y) {	//매개변수O 반환X
		System.out.println(x+y);
	}
	
	public static int fnc3() {	//매개변수X 반환X
		int x = 100;
		int y = 200;
		return x+y;
	}
	
	public static int fnc4(int x, int y) {	//매개변수X 반환X
		return x+y;
	}
	

}
