package org.kh.java;

public class Variable5 {

	public static void main(String[] args) {
		char ch1 = 'H';
		char ch2 = 65;
		char ch3 = 82;	//ASCII코드 값 입력 -> 문자 출력
		char ch4 = '\u2665';	//유니코드(특수문자도 나옴)
		//char ch5 = -65;		//코드넘버는 순번이므로 음수값 가질 수 X
		char ch5 = 121;
		char ch6 = '\u26BD';	//이모지 - 이것도 문자로 인식됨
		//char ch7 = '😭'			//자바도 이모지 표현 가능하나 코드번호 필요('이모지 목록' 검색)
		
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		System.out.println("ch3 = " + ch3);
		System.out.println("ch4 = " + ch4);
		System.out.println("ch5 = " + ch5);
		System.out.println("ch6 = " + ch6);
		
		System.out.println("아스키 코드 넘버");
		System.out.println("ch1 = " + (int)ch1); 	//강제 형변환 : 문자->아스키코드 출력
		System.out.println("ch2 = " + (int)ch2);
		System.out.println("ch3 = " + (int)ch3);
		System.out.println("ch4 = " + (int)ch4);
	}

}
