package org.kh.app;

import java.util.Scanner;

//조건문 다단계 if
public class Condition4 {

	public static void main(String[] args) {
		//학점구하기
		Scanner scan = new Scanner(System.in);	//java기본 제공 클래스 : 아래 출력 콘솔에 입력 가능케 함.
		System.out.print("점수 입력[0-100] : ");	//문자열 출력은 print 씀
		int point = scan.nextInt();
		String result;
		/*학점은 점수(result)가
		 * 97~100이면 'A+', 93~96이면 'A0', 90~92이면 'A-'
		 * 87~90이면 'B+', 83~86이면 'B0', 80~82이면 'B-'
		 * 77~80이면 'C+', 73~76이면 'C0', 70~72이면 'C-'
		 * 67~70이면 'D+', 63~66이면 'D0', 60~62이면 'D-'
		 * 60 미만이면 'F'
		 시상 내용은 학점이 A+이면 '학업우수상', 'A0'이면, '노력상', 'A-'이면, '아차상'으로 하고 나머지는 ''으로 하되, switch~case문 활용
		 */
		
		
		if(point>=90) {
			result = "A";
			if((point%10>=7 && point%10<=9) || point==100) {
				result = result + "+";
			} else if(point%10>=3 && point%10<=6) {
				result = result + "0";
			} else {
				result = result + "-";
			}
		} else if(point>=80) {
			result = "B";
			if((point%10>=7 && point%10<=9) || point==100) {
				result = result + "+";
			} else if(point%10>=3 && point%10<=6) {
				result = result + "0";
			} else {
				result = result + "-";
			}
		} else if(point>=70) {
			result = "C";
			if((point%10>=7 && point%10<=9) || point==100) {
				result = result + "+";
			} else if(point%10>=3 && point%10<=6) {
				result = result + "0";
			} else {
				result = result + "-";
			}
		} else if(point>=60) {
			result = "D";
			if((point%10>=7 && point%10<=9) || point==100) {
				result = result + "+";
			} else if(point%10>=3 && point%10<=6) {
				result = result + "0";
			} else {
				result = result + "-";
			}
		} else {
			result = "F";
		}
		
		///////////////////////////////////////
		/*묶어서 만들어보기(+0- 조건 앞으로 빼서)
		*/
		
		if((point%10>=7 && point%10<=9 && point>=60) || point==100) {
			result = "+";
			if(point>=90) {
				result = "A"+result;
			} else if(point>=80) {
				result = "B"+result;
			} else if(point>=70) {
				result = "C"+result;
			} else {
				result = "D"+result;
			}	
		} else if(point%10>=3 && point%10<=6 && point>=60) {
			result = "0";
			if(point>=90) {
				result = "A"+result;
			} else if(point>=80) {
				result = "B"+result;
			} else if(point>=70) {
				result = "C"+result;
			} else {
				result = "D"+result;
			}	
		} else if(point%10>=0 && point%10<=2 && point>=60) {
			result = "-";
			if(point>=90) {
				result = "A"+result;
			} else if(point>=80) {
				result = "B"+result;
			} else if(point>=70) {
				result = "C"+result;
			} else {
				result = "D"+result;
			}
		} else {
			result = "F";
		}
		
		//switch case
		String remark = "";
		switch(result) {
		case "A+":
			remark = "학업우수상";
			break;
		case "A0":
			remark = "노력상";
			break;
		case "A-":
			remark = "아차상";
			break;
		default:
			remark = "";
		}
		
		System.out.println("당신의 점수 : " + point);
		System.out.println("당신의 학점 : " + result);
		System.out.println("당신의 시상내역 : " + remark);
	}

}

