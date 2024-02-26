package sec1;
//Animal(부모(super)클래스), Mammal(자식(sub)클래스) (Animal 재사용 가능)
public class Mammal extends Animal{	//Animal로부터 모든 멤버를 상속받은 Mammal 클래스
	private int leg;
	//gettersetter
	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	//@Override
	//public String print() {
		//return "Mammal [name=" + super.name + ", spine=" + super.spine + "leg=" + leg + "]";
		//자기 자신 = this. 조상(부모) = super(상속표시)
	}
	

