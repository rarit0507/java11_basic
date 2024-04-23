package sec1;
//정적 내부 클래스인 Inner클래스는 외부든 내부든 정적 요소만 허용. (클래스명. 붙여야)
class Outer2 {	//디폴트 : 패키지 내 공유. 클래스명 중복 불가
	private int num = 10;
	private static int sNum = 20;
	/*
	public Inner inner;
	public Outer2() {
		inner = new Inner();
	}
	*/	//이게 있어야 아래 3번째 출력 가능
	
	static class Inner { 	//Outer의 Inner와 Outer2의 Inner는 다르기 때문에 중복되어도 됨
		int inNum = 1000;
		static int sInNum = 2000;
		
		void inMethod() {
			System.out.println("내부 클래스의 인스턴스 변수 : inNum = "+inNum);
			System.out.println("내부 클래스의 정적 멤버 변수 : sInNum = "+sInNum);
			//System.out.println("외부 클래스의 인스턴스 변수 : num = "+num);	//인스턴스 변수는 내외부 공유되지 않아 불가
			System.out.println("외부 클래스의 정적 멤버 변수 : sNum = "+sNum);	//static변수는 공유되기 때문에 가능.
		}
	}
	
	static void outMethod() {	//외부 클래스의 정적 메소드
		//System.out.println("내부 클래스의 인스턴스 변수 : inNum = "+inNum);	//inNum은 인스턴스 변수임. 인스턴스 생성 안 하면 외부 정의 불가 
		System.out.println("내부 클래스의 정적 멤버 변수 : sInNum = "+Inner.sInNum);	//static은 객체 생성 없이도 공유됨. 클래스명. 쓰면 됨
		//System.out.println("외부 클래스의 인스턴스 변수 : num = "+num);
		System.out.println("외부 클래스의 정적 멤버 변수 : sNum = "+sNum);
	}
}
public class StaticInnerClassExam {

	public static void main(String[] args) {
		Outer2 out = new Outer2();	//외부 클래스의 인스턴스
		//out.outMethod();		//되긴 됨 근데
		Outer2.outMethod(); 	//outMethod는 static(정적메소드)이므로 객체를 생성하지 않고 실행(클래스명.메소드())
		//Outer2.Inner.inMethod();	//inMethod()는 인스턴스 메소드(static아님. 객체 생성해야.(클래스명.메소드() 안됨)
		//out.Inner.inMethod();	//Inner가 정적 클래스이므로 out(인스턴스)를 생서아지 않고, Outer2를 활용
		
		Outer2.Inner inner = new Outer2.Inner();	//정적 내부 클래스의 인스턴스(static이라 굳이 만들 필요는 없음 근데 만들거면 이렇게 해야)
		inner.inMethod(); 	//얜 됨
		//out.Inner inner2;	//out은 인스턴스이므로 이렇게 생성 불가
		
		//외부 클래스: 외부 메소드는 모두 실행 가능, 내부 메소드 불가
		//정적 내부 클래스로 생성된 인스턴스는 내부 메소드 및 멤버변수의 접근 및 실행 가능(inner.~())
	}

}
