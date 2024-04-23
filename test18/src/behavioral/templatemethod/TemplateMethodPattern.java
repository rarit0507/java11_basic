package behavioral.templatemethod;
//Template Method Pattern : ���� �޼ҵ带 ���� Ŭ�������� ����, ���� ������ ���� Ŭ�������� �����ϴ� ����
public class TemplateMethodPattern {

	public static void main(String[] args) {
		HouseTemplate house1 = new WoodenHouse();
		house1.buildHouse();
		System.out.println();
		
		house1 = new GlassHouse();
		house1.buildHouse();
		System.out.println();
	}

}
