package structural.adapter;
//POJO(Plain Old Java Object) 클래스 : 자바 원래의 기본 클래스(디자인패턴X 프레임워크X)
public class Volt {
	private int amount;

	public Volt(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
