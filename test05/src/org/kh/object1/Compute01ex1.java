package org.kh.object1;

public class Compute01ex1 {

	public static void main(String[] args) {
		
		Compute01 comp1 = new Compute01();	//생성자
		
		comp1.fn1();	//메소드 호출
		
		comp1.fn2("서브웨이");
		comp1.fn2("치킨도");
		
		comp1.fn3();		//메모리는 있으나 반환 방법이 없기에 출력해줘야
		System.out.println(comp1.fn3());		//1.
		int a = comp1.fn3();					//2.
		System.out.println(a);
		
		String pass = comp1.fn4(75);
		System.out.println(pass);
		
		//===============================================
		
		fnc1();
		fnc2(200);
		System.out.println(fnc3());
		System.out.println("원의 넓이 : "+fnc4(25));
	}
	
	
	
	
	//함수(Function) : 정의 -> 호출
	//메인함수 바깥에 함수 작성, 메인함수 내에서 실행
	public static void fnc1() {
		System.out.println("반환(X), 매개변수(X)");
	}
	public static void fnc2(int a) {
		System.out.println("입력 수 : "+a);
	}
	public static int fnc3() { 
		return 500;
	}
	public static double fnc4(int radius) {
		return radius*radius*3.1415f;
	}

	
}
