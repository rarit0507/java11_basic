package org.kh.java;

public class Constant1 {

	public static void main(String[] args) {
		//상수(Constant)와 리터럴(Literal)
		final int MAX_POINT = 100;	//상수는 앞에 final 붙여줘야 함(더는 안 변함)
		final int MIN_POINT = 0;
		final double PI = 3.141592;
		final String MY_NAME = "Keanu";
		//MY_NAME = "Hey";	//불가능! 이전에 MY_NAME이 상수라고 지정되었기 때문에 바꿀 수 없음
		
		//위와 같이 final 지시자가 선언되고, 대문자로 표기된 것을 [상수]라고 함
		//항상 값이 같아 더 이상 변할 수 없음
		//변수나 상수에 대입되는 값을 [리터럴literal]이라고 함.
		//2진수, 10진수, 8진수, 16진수, 정수, 실수, 문자, 문자열 전부 리터럴
		
		System.out.println("최소 점수 : " + MIN_POINT);
		System.out.println("최대 점수 : " + MAX_POINT);
		System.out.println("나의 이름 : " + MY_NAME);
		System.out.println("반지름이 10인 원의 둘레 길이 : " + (10*2*PI));
	}

}
