package sec5;
//Shelf(클래스) 확장, Queue(인터페이스) 상속
//public class 자식클래스 implements 인터페이스1, 인터페이스2 { }
//두 개의 인터페이스 상속 => 각 인터페이스에 선언된 메소드를 하나의 클래스로 합치기
//두 개의 클래스 상속 => 허용X. 하나의 부모클래스와 자식클래스 형태로 만들고, 후손 클래스에서 메소드나 필드를
/*
public class 자식클래스 extends 부모클래스 { }
public class 후손클래스 extends 자식클래스 { } => 결과적으로 쓰는 게 후손클래스
 */
//하나의 클래스, 하나의 인터페이스 상속 => 클래스 : 필드, 생성자 / 인터페이스 : 메소드를 하나의 클래스로
//public class 자식클래스 extends 부모클래스 implements 인터페이스 { }
public class BookShelf extends Shelf implements Queue {
	//Shelf는 클래스이므로 override 상관 X
	//But 오버라이딩 통해 Shelf의 필드, 생성자, 메소드 이용
	//인터페이스의 추상 메소드와 클래스의 필드/생성자/메소드 혼합 이용 가능
	
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();	//
	}

}
