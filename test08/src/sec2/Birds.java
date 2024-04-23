package sec2;

public class Birds extends Animal {
	int wings;		//default
	boolean fly;
	
	//gettersetter
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	
		
	}
	@Override
	public String toString() {
		return "Birds [wings=" + wings +"], name["+super.name+"]";
		//★★★변수가 private이 아니면 super.name 가능!!!!!!!
	}
}