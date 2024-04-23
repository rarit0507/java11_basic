package sec4;
//implements -> 인터페이스 다중상속 가능 (Buy, Sell(인터페이스) -> Marcket(클래스))
//서로 다른 인터페이스를 하나의 클래스로 다중상속 가능
public class Marcket implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

}
