package org.kh.java;

public class Variable4 {

	public static void main(String[] args) {
		String name1 = "Keanu Reeves";
		String name2 = "\'Keanu Reeves\'";	//큰따옴표 = 문자열. 문자 배열=복수 데이터(3글자) => String은 기본형(primitive)이 아님(reference타입)
		short age = 50;
		float height = 185.4f;	//float 변수형 알리기
		double weight = 70.9;
		char init = 'k';		//문자열X. 문자 하나
				
		System.out.println("이름 : " + name1);
		System.out.println("이름 : " + name2);
		System.out.println("이름 : \'" + name1 + "\'");
		System.out.println("이름 : \'" + name2 + "\'");
		
		System.out.printf("%n이름 : \" %s \"", name1);
		System.out.printf("%n나이 : %d", age);
		System.out.printf("%n키 : %f", height);
		System.out.printf("%n체중 : %.3f", weight);	//%.3f : 소수점 3째자리까지 나타냄
		System.out.println("\n이니셜 : " + init);
		
		/* 기억!! 이스케이프 문자(println에서 씀)
		 \n : 줄바꿈
		 \t : 탭
		 \\ : \를 출력
		 \' : '를 출력
		 */
		
		/*
		 loc = "C:\\kim\\
		 */
	}

}
