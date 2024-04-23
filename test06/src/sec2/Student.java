package sec2;

public class Student {
	private String name;
	private int grade;
	private int money;
	
	//Top-Down생성자 함수 방식
	public Student() {
		this("아무개");
	}	
	public Student(String name) {
		this(name, 1);
	}	
	public Student(String name, int grade) {
		this(name, grade, 1000);
	}
	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	//gettersetter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	//학생이 버스 타는 행위에 대한 현상
	public void takeBus(Bus bus) {	//클래스 타입도 private 타입처럼 매개변수로 받을 수 있다.
		bus.take(1000);
		this.money -= 1000;		//학생(this) 돈 깎임
	}
	//학생이 지하철 타면 생기는 현상 메소드
	public void takeSubway(Subway subway) {	//클래스 타입도 private 타입처럼 매개변수로 받을 수 있다.
		subway.take(1500);
		this.money -= 1500;		//학생(this) 돈 깎임
	}

	public void print() {
		System.out.println("Student [name=" + name + ", grade=" + grade + ", money=" + money + "]");
	}
	
	

}
