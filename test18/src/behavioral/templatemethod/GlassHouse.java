package behavioral.templatemethod;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("�������� ����ϴ�.");
	}

	@Override
	public void buildPillars() {
		System.out.println("���� ����� ����ϴ�.");
	}

}
