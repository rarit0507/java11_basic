package creational.factorymethod;
//Factory Method ���� : ��ü�� ����� �κ��� ���� Ŭ����(Sub Class)�� �����ϴ� ����
//�θ� �߻� Ŭ����(Factory)�� �����ϰ�, ������ ���� Ŭ������ ������(IDCardFactory)�� ����
//�ź���(IDCard)�� ����� ����(IDcardFactory)�� Ȱ��
//�߻�ü�� Factory Ŭ����, Product Ŭ����
//�׷��Ƿ�, Factory Method Pattern�� � Ŭ������ �ν��Ͻ��� ������ ����Ŭ�������� �����ϵ��� å���� �����ϴ� �����̴�.
public class FactoryMethodPattern {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("���ι�");
		Product card2 = factory.create("������");
		card1.use();
		card2.use();
	}
}