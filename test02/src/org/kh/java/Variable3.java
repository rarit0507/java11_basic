package org.kh.java;

public class Variable3 {

	public static void main(String[] args) {
		int bin = 0b10111;	//0b : 2진수 데이터 입력(해당 숫자 앞에 붙임)
		System.out.println("bin=" + bin);	//23
		
		int oct = 03647;	//0 : 8진수 데이터 입력(해당 숫자 앞에 붙임)
		System.out.println("oct=" + oct); 	//1959
		
		int dec = 3650;	//X : 10진수 데이터 입력(해당 숫자 앞에 붙임)
		System.out.println("dec=" + dec); 	//3650
		
		int hex = 0x2c8;	//0x : 12진수 데이터 입력(해당 숫자 앞에 붙임)
		System.out.println("hex=" + hex); 	//712
		
		System.out.println("각 진수로 출력");
		System.out.println("dec를 2진수 => " + Integer.toBinaryString(dec));	//Wrapper 데이터 사용(Integer. + ctrl+space
		System.out.println("dec를 8진수 => " + Integer.toOctalString(dec));
		System.out.println("dec를 12진수 => " + Integer.toHexString(dec));	
		
		/*
		 * 출력 형식 문자 코드 => printf로만 가능(전부 이어서 계속 출력(줄바꿈X)) || (println(X) - line print. 한 줄씩 출력)
		 %s : 문자열
		 %d : 10진 정수
		 %f : 실수
		 %o : 8진수
		 %x : 16진수
		 %e : 지수 표현형식
		 %n : 줄바꿈
		 */
		
		System.out.printf("%ndec 8진수 : %o", dec);
		System.out.printf("%ndec 16진수 : %x", dec);
		System.out.printf("%ndec 8진수 : %o, 16진수 : %x", dec, dec);
		//ㄴ 변수값이 2개니까 변수도 2번 적어줘야
	}

}
