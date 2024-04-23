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
			System.out.println("=== ȸ�� ���� ===");
			System.out.println("1. ȸ�� ����\n2. ȸ�� ���\n3. ȸ�� ����\n4. ���α׷� ����");
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
					System.out.println("���α׷��� ����Ǿ����ϴ�.");	//�޽����ȶ�===
					break;
				default:
					sw=false;
			}
		}
	}	
	public void signIn() {
		System.out.println("ȸ�� ������ �Է��ϼ���.");
		System.out.println("���̵� �Է� : ");
		String id = sc.next();
		System.out.println("�Ǹ� �Է� : ");
		String name = sc.next();
		System.out.println("����⵵ �Է� : ");
		int year = Integer.parseInt(sc.next());
		System.out.println("��й�ȣ �Է� : ");
		String pw = sc.next();
		System.out.println("ȸ�� ��� �Է� : ");
		int mcode = Integer.parseInt(sc.next());
		System.out.println("����ó �Է� : ");
		String tel = sc.next();
		memList.add(new Member(mcode, id, pw, name, year, tel));
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
	}
	public void info() {
		for(Member m : memList) {
			System.out.println(m.toString());
		}
	}
	public void remove() {
		System.out.println("������ ȸ������ �Է��ϼ���.");
		String name = sc.next();
		for(int i=0;i<memList.size();i++) {
			if(memList.get(i).getName().equals(name)) {
				memList.remove(i);
				System.out.println(name+"ȸ���� ������ �����Ǿ����ϴ�.");
			}
		}
	}
}
