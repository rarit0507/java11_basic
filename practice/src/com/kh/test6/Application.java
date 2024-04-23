package com.kh.test6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	Scanner sc = new Scanner(System.in);
	List<Food> foodList = new ArrayList<>();
	
	public static void main(String[] args) {
		Application app = new Application();	//메서드에 static 안 쓸 거면 객체 생성해야
		app.mainMenu();
		
		

	}
	
	public void mainMenu() {
		boolean sw = true;	//switch -> while문 반복. false면 멈추기
		while(sw) {
			System.out.println("=== 음식 메뉴 리스트 ===");
			System.out.println("1. 음식 추가\n2. 음식 정보\n3. 음식 삭제\n4. 프로그램 종료");
			System.out.printf("번호 선택");	//옆에 들어가야 하니까 printf
			switch(sc.nextInt()) {
				case 1:
					add();
					break;
				case 2:
					info();
					break;
				case 3:
					remove();
					break;
				case 4:
					sw = false;	//switch 꺼버리기
					break;
				default:
					sw = false;
			}
		}
	}
	//함수(메서드)
	public void add() {
		System.out.print("추가할 음식 입력 : ");
		String name = sc.next(); //객체 이름 입력받기
		System.out.print("칼로리 입력 : ");
		int kcal = Integer.parseInt(sc.next());	//nextLine : 다음 줄로 넘기기. 이거 쓰려면 형 변환해야
		foodList.add(new Food(name, kcal));	//리스트에 추가
		System.out.println("음식 정보가 추가되었습니다.");	//작업 후 출력문
	}
	public void info() {
		for(Food f:foodList) {
			System.out.println(f.toString());
		}
	}
	public void remove() {
		System.out.print("삭제하고 싶은 음식 선택 : ");
		String name = sc.next();
		Food fd;
		for(int i=0;i<foodList.size();i++) {
			fd = foodList.get(i);
			if(fd.getName().equals(name)) {
				System.out.println(fd.toString()+"이(가) 삭제되었습니다.");
				foodList.remove(i);
			}
		}
	}
}
