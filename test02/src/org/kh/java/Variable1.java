package org.kh.java;

public class Variable1 {

	public static void main(String[] args) {

		boolean a = true;	//논리형(true/false) : 1byte
		//byte b = 255;		//-128~127(256(2의 8승)) => 255는 해당 공간보다 큰 숫자. Overflow.
		//byte b = -129;	//해당 공간에 저장할 수 있는 숫자보다 작은 숫자. Underflow.
		byte b = 126;		//1byte = 8bit = 256가지(-128~127)
		short c = 32767;	//2byte = 16bit = 65536(-32768~32767)
		char d = 'k';		//2byte 한 글자만 저장 가능
		int e = 234567;		//4byte
		float f = 3.14f;	//4byte. f를 붙여 실수임을 알려줘야 함
		long g = 23456789;	//8byte
		double h = 3.14;	//8byte. d를 붙여 double임을 알려줄 수 있음
		System.out.println("byte : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);	//최소 최대값. Byte => Wrapper 
		System.out.println("short : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("char : " + Character.MIN_VALUE + " ~ " + Character.MAX_VALUE);
		System.out.println("int : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("float : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		System.out.println("long : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		System.out.println("double : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
	}

}
