package org.kh.java;

public class Variable7 {

	public static void main(String[] args) {
		String name = "Keanu";
		
		//Wrapper: 원래는 기본 타입인데 Class처럼 보이기 위해 포장-> 오류 방지. Wrapper타입(클래스타입)은 Null일 수 있음
		int age = 50;		//=엽서(하위개념. 꼭 초기화 필요함)
		Integer age0 = age;	//포장 박스(상위개념. 값이 Null일 수 있음)
		String age2 = "50";	//Primitive와 Class타입의 중간 느낌
		int age3 = Integer.parseInt(age2);
		
		//float height = 185.6f;
		Float height = 185.6f;
		String height2 = "185.6";		
		float height3 = Float.parseFloat(height2);	//Wrapper type -> 기본형 변경
		
		//boolean pass = true;
		//double weight = 70.3;
		Double weight = 70.3;
		
		System.out.println("age = " + age3);
		System.out.println("name : " + name.getClass(). getName());
		System.out.println("age : " + age0.getClass(). getName());
		System.out.println("height : " + height.getClass(). getName());
		System.out.println("weight : " + weight.getClass(). getName());
		
		//primitive type =>  Wrapper type : boxing
		//Wrapper type => primitive type : unboxing
	}

}
