package org.kh.object1;
//실행클래스임
public class Personex1 {

	public static void main(String[] args) {
		
		Person yrl = new Person();	//생성자함수(인스턴스생성)
		yrl.name = "이예린";
		yrl.year = 2001;
		yrl.gender = "Fe";
		yrl.job = "백수";
		yrl.sleeping();
		
		/*
		Person lee = new Person();
		lee.sleeping();		//null이 잠을 잡니다(name 설정 X)
							//오류는 나지 않지만 null로 뜸.(class가 참조형이라 그럼)
		
		//System.out.println(name+"이 잠을 잡니다");	(얜 참조형 아니라서 오류 뜸)
		*/
		
		Person lee = new Person();
		lee.name = "집보내줘";
		lee.sleeping();
		
	}

}
