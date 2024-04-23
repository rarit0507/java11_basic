package org.kh.java;

public class Variable6 {

	public static void main(String[] args) {
		float f1 = 3.14f;
		double f2 = 3.14;
		int kor = 90, eng = 80, mat = 90; 	//여러 개 변수의 자료형이 동일하면 나열하여 한 번에 초기화 가능
		float avg1 = (kor + eng + mat) / 3.0f;		//방법1: /3; 하면 실수/정수 한 것. 오류
		float avg2 = (float) (kor + eng + mat) / 3;	//방법2 : 강제 형 변환
		
		System.out.printf("\nf1=%.3f", f1);
		System.out.printf("\nf2=%.2f", f2);
		System.out.printf("\n평균 : %.2f", avg1);
		System.out.printf("\n평균 : %.2f", avg2);
	}

}
