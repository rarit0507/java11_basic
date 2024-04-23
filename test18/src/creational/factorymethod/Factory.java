package creational.factorymethod;
//Product �߻� Ŭ������ ��ü�� �����ϴ� Factory �߻� Ŭ���� 
//Factory Method ���� : Product�� ����� create()�� �����Ƿ� �̷��� ���� Factory Method �����̶�� ��.
public abstract class Factory {	//�߻�ü�μ� create() �޼ҵ带 Ȱ���Ͽ� Product�� ����
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product p);
}