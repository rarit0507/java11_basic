package org.kh.java;
//형 변환(1. Auto Casting, 2. Force Casting) = type conversion
public class Casting1 {

	public static void main(String[] args) {
		//Auto Casting(묵시적 형 변환) : 작은 크기의 저장소에 있는 데이터 값을 큰 크기의 저장소로 옮기면서 자동으로 형 변환
		byte b = 20;	//1byte.
		short s = b;	//2byte. byte 값 넣기 OK (byte => short)
		int i = s;		//4byte. short 값 넣기 OK (short => int)
		long l = i;		//8byte. int 값 넣기 OK (int => long)
		
		//Force Casting(명시적 형 변환) : 큰 크기의 저장소에 있는 데디터 값을 별도의 타입 연산자를 활용해 타입을 변환
		//강제 형변환 필요
		int i2 = (int) l;		//(long =/=> int)
		short s2 = (short) i;	//(int =/=> short)
		byte b2 = (byte) s;	//(short =/=> byte)
		
	}

}
