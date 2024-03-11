package structural.bridge;

public abstract class Shape {
	protected Color color;	//Composition //Color은 인터페이스. 이걸 멤버로 이용
	//이거 안 넣으면 빨간/초록 삼각형/육각형 다 멤버로 넣어야. 인터페이스를 멤버로 넣어 결합도↓ 응집도↑
	
	public Shape(Color c) {
		this.color = c;
	}
	
	abstract public void applyColor();
	
}
