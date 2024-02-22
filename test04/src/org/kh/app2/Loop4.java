package org.kh.app2;

import java.util.Scanner;

//while
public class Loop4 {

	public static void main(String[] args) {
		/*
		 for와 마찬가지, 조건이 만족하는 동안만 반복수행
		 그러나 while의 괄호에 조건식만 들어감, 해당 블록 안에 증감식 기재
		 for(초기화식;조건식;증감식)
		 
		 초기화식;
		 while(조건식) {
		 	증감식;
		 	반복할문장;
		 }
		 */
		//누산
		int i = 0, tot = 0;
		while(i<5) {	//i=0~5
			i++;		//i=i+1		//1 2 3 4  5
 			tot+=i;		//tot=tot+i	//1 3 6 10 15
		}
		System.out.println("결과 : " + tot);
		
		//증감식 안 쓰면 결과 나오지 않음. => >>>무한루프<<<
		
		System.out.println("=============================");
		
		//해당 숫자 입력하면, 구구단 중 해당 숫자의 단을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력[2-9] : ");
		int n = sc.nextInt();
		/*
		int j=0;
		while(j<9) {
			j++;
			System.out.println(n+ " * " + j + " = " +(n*j));
		}
		*/
		
		for(int k=1;k<=9;k++) {		//k=0 하면 0단부터 시작
			System.out.println(n+" * "+k+" = " + (n*k));
		}
	}

}
