package org.kh.object1;

public class Studentex1 {

	public static void main(String[] args) {

		Student lee = new Student();
		lee.name = "이예린";
		lee.kor = 98;
		lee.eng = 70;
		lee.mat = 56;
		lee.resulting();
		
		Student who = new Student();
		who.resulting();
	}

}
