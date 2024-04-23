package behavioral.templatemethod;
//House(��)�� ���� ���� �޼ҵ带 �����ϵ�, ��ᰡ �������� ���� �͵��� �߻�޼ҵ�� ����
public abstract class HouseTemplate {
	protected void buildHouse() {
		buildPillars();
		buildWalls();
		buildWindows();
		buildFoundation();
	}	//final �޼ҵ� : ��ӺҰ�. private�� Ŭ���� �ܺο��� �� �� ����
	
	private void buildWindows() {
		System.out.println("���� â�� �����");
	}
	
	public abstract void buildWalls();	//���� ���� ���� ������ ���� => �߻� �޼ҵ�
	public abstract void buildPillars();	//���
	private void buildFoundation() {
		System.out.println("��ü/��� ���� ��ῡ �´� �����縦 �����Ͽ����ϴ�.");
	}
}
