package org.kh.site;
//증감 연산
public class Operation4 {
	public static void main(String[] args) {

		// ++, -- => 전위 연산, 후위 연산이 각각 있음
		
		int a = 10;
		int b = 10;
		System.out.println("전위 증가 연산 : " + (++a));	//a를 먼저 1씩 증가시킨 후 출력
		System.out.println("후위 증가 연산 : " + (b++));	//b를 먼저 출력하고 나중에 1씩 증가
		System.out.println("전위 감소 연산 : " + (--a));
		System.out.println("후위 감소 연산 : " + (b--));
		System.out.println("a : " + a);	
		System.out.println("b : " + b);
	}

}
