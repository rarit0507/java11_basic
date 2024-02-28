package sec4;
//extends : 다중 상속 안 됨
//Pay 클래스에서 public class Pay extends Inventory { } 하면 여기서 둘 다 상속 가능 (Inventory(클래스) -> Pay(클래스) -> Store(클래스))
public class Store extends Pay {

	@Override
	public void pay() {
		System.out.println("상점");
		super.pay();	//부모, 조상 클래스 = super class
	}

	@Override
	public void inventory() {
		System.out.println("상점");
		super.inventory();
	}

}
