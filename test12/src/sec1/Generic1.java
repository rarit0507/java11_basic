package sec1;
//제네릭(Generic)이란? 데이터와 관계없이 아무거나 모두 받아서 처리하는 클래스
//자주 사용하는 타입 인자 : T(type), E(Element), K(Key), V(Value), N(Number), R(Result)
public class Generic1<T> {	//<T>:안에 뭘 쓰든 상관 없으나 관례임
	private T field1;
	//Constructor
	public Generic1() {}
	public Generic1(T field1) {
		super();
		this.field1 = field1;
	}
	//getset
	public T getField1() {
		return field1;
	}

	public void setField1(T field1) {
		this.field1 = field1;
	}
	

}
