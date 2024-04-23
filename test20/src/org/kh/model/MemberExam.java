package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;

public class MemberExam {
	Scanner sc = new Scanner(System.in);
	List<Member> memList = new ArrayList<>();
	
	public static void main(String[] args) {
		MemberExam app = new MemberExam();
		app.mainCall();
		
	}
	
	public void mainCall() {
		boolean sw = true;
		while(sw) {
			System.out.println("=== 회원 관리 ===");
			System.out.println("1. 회원 가입\n2. 회원 목록\n3. 회원 삭제\n4. 프로그램 종료");
			switch(sc.nextInt()) {
				case 1:
					signIn();
					break;
				case 2:
					info();
					break;
				case 3:
					remove();
					break;
				case 4:
					sw=false;
					System.out.println("프로그램이 종료되었습니다.");	//메시지안뜸===
					break;
				default:
					sw=false;
			}
		}
	}	
	public void signIn() {
		System.out.println("회원 정보를 입력하세요.");
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("실명 입력 : ");
		String name = sc.next();
		System.out.println("출생년도 입력 : ");
		int year = Integer.parseInt(sc.next());
		System.out.println("비밀번호 입력 : ");
		String pw = sc.next();
		System.out.println("회원 등급 입력 : ");
		int mcode = Integer.parseInt(sc.next());
		System.out.println("연락처 입력 : ");
		String tel = sc.next();
		memList.add(new Member(mcode, id, pw, name, year, tel));
		System.out.println("회원가입이 완료되었습니다.");
	}
	public void info() {
		for(Member m : memList) {
			System.out.println(m.toString());
		}
	}
	public void remove() {
		System.out.println("삭제할 회원명을 입력하세요.");
		String name = sc.next();
		for(int i=0;i<memList.size();i++) {
			if(memList.get(i).getName().equals(name)) {
				memList.remove(i);
				System.out.println(name+"회원의 정보가 삭제되었습니다.");
			}
		}
	}
}
