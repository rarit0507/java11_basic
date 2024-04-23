package org.kh.app;

import java.util.Scanner;

//조건문 if~elseif(~else~)
public class Condition3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	//java기본 제공 클래스 : 아래 출력 콘솔에 입력 가능케 함.
		System.out.print("점수 입력[0-100] : ");	//문자열 출력은 print 씀
		int point = scan.nextInt();
		char result;
		//학점은 점수(result)가 90~100이면 'A', 80~ 89이면 'B', 70~79이면 'C', 60~69이면 'D', 60 미만이면 'F'
		if(point>=90) {
			result = 'A';
		} else if(point>=80) {
			result = 'B';
		} else if(point>=70) {
			result = 'C';
		} else if(point>=60) {
			result = 'D';
		} else {
			result = 'F';
		}
		
		System.out.printf("\n당신의 점수는 %d점 입니다.", point);
		//System.out.println("\n당신의 점수는 " + point + "점 입니다.");	//똑같은거임 printf(더 깔끔) println
		
		System.out.printf("\n당신의 학점은 %s 입니다.", result);
		
	}

}
