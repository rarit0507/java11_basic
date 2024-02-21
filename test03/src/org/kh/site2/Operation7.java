package org.kh.site2;
//대입 연산자 : 연산 후 대입하는 연산자
//비트 연산자 : &(and), |(or), ~(complement), ^(xor), >> >>>(right shift), <<(left shift)
public class Operation7 {

	public static void main(String[] args) {
		// +=, -=, *=, /=, %= 
		// &=, |= (2진수 연산 가능)
		// >>=, <<=, >>>= (쉬프트shift)
		// ^= (xor)
		
		int a = 20;
		int b = 15;
		int tmp;			//tmp(임시저장소)
		
		//c += a;		//계산X (C가 null)
		a += b;			//a=35, b=15
		b -= a;			//a=35, b=-20
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		//a와 b의 값 맞교환
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		//비트연산(2진수연산)
		int x = 0b01101;
		int y = 0b01011;
		System.out.println("x=" + x);	//10진수로 나옴
		System.out.println("y=" + y);
		System.out.println("x=" + Integer.toBinaryString(x));	//2진수로 변형
		System.out.println("y=" + Integer.toBinaryString(y));
		System.out.println("x & y :" + Integer.toBinaryString(x & y));		//비트연산자(&, |)(2진수연산)
		System.out.println("x | y :" + Integer.toBinaryString(x | y));		//x=1101 y=1011 한 자리씩 더해 1 0 따짐
		System.out.println("x ^ y :" + Integer.toBinaryString(x ^ y));		//xor(배타적임. 서로 입력 다를 때만 1 (11(0) 10, 01(1) 00(0))
		System.out.println("~x : " + Integer.toBinaryString(~x)); 			//complement(0->1, 1->0 바꿈)
		System.out.println("x >> 2 : " + Integer.toBinaryString(x >> 2));	//rightshift(=/2. 뒤로 밂. 1101(13) -> 11(3))
		System.out.println("x << 2 : " + Integer.toBinaryString(x << 2));	//leftshift(=*2. 앞으로 당김. 10100(20) -> 1010000(80)
		System.out.println("******대입연산자********");
		
		int i = 25;		// 1 1 0 0 1
		int j = 30;		// 1 1 1 1 0
		i &= j;		// i = i & j
		System.out.println("i &= j : " + i); 	// 1 1 0 0 0 => 24
		i = 25;
		i |= j;
		System.out.println("i |= j : " + i);	// 1 1 1 1 1 => 31
		i = 25;
		i ^= j;		//i = i ^ j
		System.out.println("i ^= j : " + i);	// 0 0 1 1 1 => 7
		
		j >>= 2;		// 1 1 1 1 0 => 1 1 1 => 7
		System.out.println("j >>= 2 : " + j);
		j = 30;
		j <<= 2;		// 1 1 1 1 0 => 1 1 1 1 0 0 0 => 120
		System.out.println("j <<= 2 : " + j);
		j = 30;
		j >>>= 2;		// >>나 >>>나 똑같음
		System.out.println("j <<= 2 : " + j);
	}

}
