package sec1;
//example파일에 class 추가 가능 but public class Animal 불가
class Animal {
	private String type = "포유류";
	private String name;
	private int leg = 4;	//선언할 때 =nn으로 디폴트 설정 가능
	private int wing = 0;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {	//매개변수 필요하므로 nnn.setType();만 쓰면 오류남
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	//toString()
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", leg=" + leg + ", wing=" + wing + "]";
	}
	//toString출력
	public void print() {
		System.out.println(this.toString());
	}
	
}


//public이 들어가는 게 클래스 주인공
public class AnimalExam {

	public static void main(String[] args) {

		Animal ani1 = new Animal();
		//ani1.type => 오류남.(위에 변수가 private이라)
		//gettersetter 설정 후
		ani1.setType("포유류");
		ani1.setName("호랑이");
		ani1.setLeg(4);
		ani1.setWing(0);
		ani1.print();
		
		Animal ani2 = new Animal();
		ani2.setType("조류");
		ani2.setName("독수리");
		ani2.setLeg(2);
		ani2.setWing(2);
		ani2.print();
		
		Animal ani3 = new Animal();
		ani3.setType("파충류");
		ani3.setName("아나콘다");
		ani3.setLeg(0);
		ani3.setWing(0);
		ani3.print();

		Animal snake = new Animal();
		//줄 자체를 없애야 디폴드 값이 나옴
		snake.setName("아나콘다");
		snake.setLeg(0);
		snake.setWing(0);
		snake.print();
		
	}

}
