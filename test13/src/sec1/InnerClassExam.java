package sec1;
//내부 클래스(Inner Class) : 클래스 안에 더 작은 클래스
//기본 내부 클래스 : 외부클래스 객체 생성해야 내부클래스 객체 생성 가능
//static 내부 클래스 : 외부 클래스 객체 생성할 필요도 없음
	

class Outer {	//외부 클래스
	private int num = 10;	//멤버필드
	private static int sNum = 20;	//정적 멤버필드 => 데이터 공유 목적
	
	public Inner inner;	//인스턴스 내부 클래스(내부 클래스만 인스턴스를 만들 수 있음★★★★★)
	public Outer() {	//Outer 생성자를 호출하게 되면, 자동적으로 내부 클래스에 인스턴스 생성
		inner = new Inner();
	}
	
	class Inner {	//내부 클래스
		int  inNum = 1000;
		
		void inMethod() {
			System.out.println("내부 클래스에서 외부 클래스의 멤버  변수 : num"+num);
			System.out.println("내부 클래스에서 외부 클래스의 정적 멤버  변수 : sNum"+sNum);
		}
	}
	
	public void outMethod() {	//외부 클래스에서 내부 클래스의 메소드 호출
		inner.inMethod(); 	//내부->외부 멤버변수 쓰기 : 그냥 쓰면 됨 / 외부->내부 멤버(inMethod) 사용 : 위에서 선언한 inner 사용해서 접근해야
	}
	
}

public class InnerClassExam {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.outMethod();	//타 클래스에서 객체 생성 후 외부 클래스의 멤버 메소드 호출
		out.inner.inMethod();	//타 클래스에서 객체 생성 후 내부 클래스의 멤버 메소드 호출(한 단계 더 들어감. out의 inner의 inMethod)
								//inner 선언이 public이 되어야
	}

}
