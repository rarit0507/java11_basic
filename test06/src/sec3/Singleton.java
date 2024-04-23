package sec3;

public class Singleton {
	private static Singleton instance;	//정적 개체 선언. static=객체 생성 하나만 가능
	private Singleton() { }	//외부에서 생성할 수 없도록 private. 생성자 함수
	//함수 작성
	public static synchronized Singleton getInstance() {	//getInstance() 호출 시 생성. Singleton=리턴 형식(void나 그런 거)
		if(instance == null) instance = new Singleton();
		return instance;
		//Singleton : 하나의 개체만 생성하는 것을 허용
	}
	
}
