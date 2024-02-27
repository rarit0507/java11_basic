package sec1;

public class Staff extends User{
	private int level;	//접근권한레벨
	private String part;	//근무 부서
	private String name;
	
	//gettersetter
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Staff [level=" + level + ", part=" + part + "]";
	}
	
	//override 구체화
	@Override
	public void connect() {
		System.out.println(part+"의 "+name+"이(가) 출근하였습니다.");
	}
	//부모 클래스에서 추상적 메소드 작성 후 자식 클래스에서 다양하게 구체화하여 활용
	//★★★빼먹지 않고(꼭 써야)
	//다형성
	
	

}
