package org.kh.object1;
//메서드(Method) : 정의 -> 호출
//일반 클래스에 명시해둔 것 = 메소드
//메인 함수main 바깥에 명시해두고 main 내에서 굴리는 것 = 함수
public class Compute01 {
	//메소드
	//방법1: 매개변수X 반환X(return)
	void fn1 () {	
		System.out.println("짱졸림");
	}
	//방법2: 매개변수O 반환X
	void fn2(String a) {
		System.out.println(a+" 먹고싶다");
	}
	//방법3: 매개변수X 반환O
	int fn3() {			//반환형이 정수이므로 int로
		return 1234;
	}
	//방법4: 매개변수O 반환O
	String fn4(int point) {
		if(point>=80) return "합격";
		else return "불합격";
	}

}
