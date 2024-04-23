package creational.singleton;
//Singleton Pattern : �ν��Ͻ��� �� ���� �����Ͽ� �޸𸮿� �����Ͽ� ��������ν� �ϳ��� �ν��Ͻ��� �����ϴ� ����
public class SingletonPattern {
	public static void main(String[] args) {
		Singleton ins1 = Singleton.getInstance(1);
		Singleton ins2 = Singleton.getInstance(2);
		Singleton ins3 = Singleton.getInstance(3);
		ins1.print();
		ins2.print();
		ins3.print();
		if(ins1 == ins2 && ins1 == ins3 && ins2 == ins3) {
			System.out.println("�ϳ��� ��ü �Դϴ�.");
		} else {
			System.out.println("���� �ٸ� ��ü �Դϴ�.");
		}
		System.out.println("ins1 : "+ins1);
		System.out.println("ins2 : "+ins2);
		System.out.println("ins3 : "+ins3);
	}
}