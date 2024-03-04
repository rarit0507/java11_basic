package prac1;

import java.util.Scanner;

public class CalorieExam {

	public static void main(String[] args) {
		int calorie, protein, carbohydrate, fat;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단백질 : ");
		protein = sc.nextInt();
		System.out.print("탄수화물 : ");
		carbohydrate = sc.nextInt();
		System.out.print("지방 : ");
		fat = sc.nextInt();
		
		//칼로리 공식
		calorie = protein*4+carbohydrate*4+fat*9;
		
		System.out.println("\n칼로리 : "+calorie);
		
	}

}
