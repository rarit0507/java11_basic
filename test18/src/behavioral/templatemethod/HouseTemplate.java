package behavioral.templatemethod;
//House(집)을 짓는 공통 메소드를 정의하되, 재료가 정해지지 않은 것들은 추상메소드로 정의
public abstract class HouseTemplate {
	protected void buildHouse() {
		buildPillars();
		buildWalls();
		buildWindows();
		buildFoundation();
	}	//final 메소드 : 상속불가. private은 클래스 외부에서 쓸 수 없음
	
	private void buildWindows() {
		System.out.println("유리 창문 만들기");
	}
	
	public abstract void buildWalls();	//벽을 뭐로 할지 정하지 못함 => 추상 메소드
	public abstract void buildPillars();	//기둥
	private void buildFoundation() {
		System.out.println("벽체/기둥 등의 재료에 맞는 마감재를 선택하였습니다.");
	}
}
