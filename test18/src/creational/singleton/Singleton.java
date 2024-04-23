package creational.singleton;

public class Singleton {
	private static Singleton instance;	//static ��� �ʵ�(Singleton)�� ���� �޸�
	private int msg;
	private Singleton(int msg) {
		this.msg = msg;
	}
	//static �޼ҵ�� ��ü ���� ���� Singleton �ν��Ͻ��� = Singleton.getInstance(����)
	public static Singleton getInstance(int msg) {	
		if(instance == null) {
			instance = new Singleton(msg);
		}
		return instance;
	}	
	public void print() {
		System.out.println(msg);
	}
}