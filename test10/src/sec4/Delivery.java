package sec4;

public interface Delivery extends Buy, Sell {
	void delivery();	//인터페이스 상속 받은 인터페이스(어차피 선언만 됨)
}
