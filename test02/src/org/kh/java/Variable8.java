package org.kh.java;

public class Variable8 {

	public static void main(String[] args) {
		//가변 할당(동적 할당) : 자료형과 무관하게 해당하는 리터럴(=값)에 의해 자료형이 자유롭게 변형되는 할당 방법
		var num1 = 29.456;	//float/double
		var num2 = 34;		//int
		var num3 = 'k';		//char
		var num4 = "Keanu";	//
		var num5 = true;	//boolean
		num1 = 67;
		
		System.out.println("num1 = " + num1);	//67로 바꿨는데 여전히 실수임(var에서 실수 자료형으로 이용해서)
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
		System.out.println("num5 = " + num5);
	}

}
