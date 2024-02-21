package org.kh.java;

public class Variable2 {

	public static void main(String[] args) {
		byte b =10;
		short s = 20;	//선언O 초기화O
		int i; 			//선언O 초기화X ('나 이렇게 쓸거야' / 값은 지금 안 알려줌(주소없음))
		long l;			//초기화 필수! (= 가장 처음에 값 저장하기)
		
		i = 30;	//초기화
		l = 40L; //Long 타입으로 쓰겠다 선언해야 long 자료형으로 쓸 수 있음
		
		System.out.println("b=" + b);
		System.out.println("s=" + s);
		System.out.println("i=" + i);
		System.out.println("l=" + l);	//초기화 없이 에러 발생(by 값이 없음 == null => >>>Null Pointer 오류<<<)
		
		//b = 130;	//Overflow 오류
		//b = -130;	//Underflow 오류 (byte = -2^7 ~2^7-1)
	}

}
