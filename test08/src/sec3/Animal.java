package sec3;

public class Animal {
	protected String name;	//직접 접근을 위해서는 default, protected, public
	protected boolean spine;
	
	//gettersetter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
	public String print() {
		return "Animal [name=" + name + "], [spine=" + spine + "]";
	}
	
	
}
