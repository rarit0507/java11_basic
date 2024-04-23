package org.kh.app2;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		/*
		 숫자 맞추기 게임 :
		 무작위로 퀴즈의 답이 되는 수(랜덤수)를 1~100 범위의 정수형태로 발생시키고,
		 답이 되는 숫자가 입력될 때까지 계속 입력 받되, 만약, 퀴즈의 답과 일치하는 숫자를
		 입력하면, "축하합니다. 맞추셨습니다."라고 출력한다.
		 */
		/*
		int quiz = (int) (Math.random()*100);	//0~100 실행 시마다 다른 숫자 출력됨.
		System.out.println(quiz);		
		Scanner s = new Scanner(System.in);
		
		while(true) {	//조건식이 항상 참 =무한루프
			System.out.print("숫자 입력 [0-100] : ");	//이게 밖에 있으면 첫 시행 1번밖에 입력 창이 안 뜸.
			int n = s.nextInt();
			if(quiz==n) {
				System.out.println("축하합니다. 맞추셨습니다.");
				break;
			}
		}
		*/

		
		
		int quiz1 = (int) (Math.random()*1000);	//0~1000 실행 시마다 다른 숫자 출력됨.
		System.out.println(quiz1);		
		Scanner s1 = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 [0-1000] : ");
			int j = s1.nextInt();
			if(quiz1==j);
			System.out.println("Congratulations!");
			break;
		}
		
		
		
		
		
		
	}

}
