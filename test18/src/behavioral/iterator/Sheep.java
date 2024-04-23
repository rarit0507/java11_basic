package behavioral.iterator;

public class Sheep implements Animal {

	@Override
	public void eat() {
		System.out.println("�ַ� ������ Ǯ�� ��� �Խ��ϴ�.");
	}

	@Override
	public void sleep() {
		System.out.println("�ɾƼ� ���� ��ϴ�.");
	}

	@Override
	public void sound() {
		System.out.println("Mehhhhh");
	}

}
