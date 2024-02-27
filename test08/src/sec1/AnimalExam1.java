package sec1;

public class AnimalExam1 {

	public static void main(String[] args) {
		//부모 클래스로부터 선언된 객체는 부모 또는 자식 생성자를 활용해 객체 생성 가능
		Animal a1 = new Animal();
		Animal a2 = new Mammal();	//이게외됌?
		Animal a3 = new Birds();	//(부모클래스 선언자 - 자식클래스 생성자) 가능
		
		//자식 클래스로부터 선언된 객체는 부모 또는 형제 생성자를 활용해 객체 생성 불가
		//Mammal m1 = new Animal();	//(자식클래스 선언자 - 부모클래스 생성자) 불가
		Mammal m2 = new Mammal();
		//Mammal m3 = new Birds();	//(자식클래스 선언자 - 형제클래스 생성자) 불가
		
		Animal a4;	//선언 
		a4 = new Animal();	//Animal 객체 생성
		a4.setName("카피바라");
		a4.setSpine(true);
		System.out.println(a4.print());
		
		a4 = new Mammal();	//Mammal 객체로 형 변환(중도변환 가능)
		//a4.setLegs(4);	//형 변환을 하더라도 선언이 Animal로 되었기 때문에 Animal 클래스 메소드만 사용 가능
		a4.setName("호랑이");
		System.out.println(a4.print());
		
		a4 = new Birds();	//Birds 객체로 형 변환
		//a4.setWings(0);
		a4.setName("갈매기");
		System.out.println(a4.print());
		
		//부모클래스로부터 객체 선언
		//부모 자신 / 자식 클래스 이용해 객체 생성
		//메소드 오버라이딩 이용 메소드 다양하게 구현(super.getName() etc.)
		
		//메소드 오버라이딩(Override) : 부모 클래스로부터 상속받은 메소드를 다르게 구현 => ★다형성★
		//그러므로, 부모 클래스로 선언된 객체는 부모 자신 또는 자식 생성자를 활용하여 다양하게 형 변환 가능 => ★다형성★
		//클래스 => 캡슐화, 정보은닉, 재사용성, 다형성, 추상화(for 범용성. 기능 구현 내용을 정해두지 않음)
	}

}
