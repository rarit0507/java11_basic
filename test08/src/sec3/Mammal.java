package sec3;
//Animal(부모(super)클래스), Mammal(자식(sub)클래스) (Animal 재사용 가능)
public class Mammal extends Animal{	//Animal로부터 모든 멤버를 상속받은 Mammal 클래스
	protected int leg;
	
	//gettersetter
	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	@Override
	public String print() {
		return "Mammal leg=[" + leg + "], name["+super.name+"]";	//Animal 클래스에 set/get 메소드 존재.
		//name 직접 출력 불가, getName() 써줘야
		//자기 자신 = this. 조상(부모) = super(상속표시)
	}
}

