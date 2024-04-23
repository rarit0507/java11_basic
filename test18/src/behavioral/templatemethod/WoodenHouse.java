package behavioral.templatemethod;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("���� ��ü�� ����ϴ�.");
	}

	@Override
	public void buildPillars() {
		System.out.println("���� ����� ����ϴ�.");
	}

}
