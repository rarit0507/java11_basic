package sec1;

import sec2.Animal;
import sec2.Mammal;
import sec2.Birds;	//다른 패키지에서 가져오기(변수가 private이 아니어야 함)

public class AnimalExam2 {

	public static void main(String[] args) {
		Animal a1;	//Animal 객체 선언(부모클래스)
		a1 = new Animal();
		a1.setName("개");
		a1.setSpine(true);
		System.out.println(a1.print());
		
		//형 변환 Mammal
		a1 = new Mammal();
		a1.setName("고질라");
		a1.setSpine(true);
		//a1.leg = 4;	//클래스가 Animal이므로 Mammal 메소드 불가
		System.out.println(a1.print());
		
		//형 변환 Birds
		a1 = new Birds();
		a1.setName("봉황");
		a1.setSpine(true);
		System.out.println(a1.print());
		
	}

}
