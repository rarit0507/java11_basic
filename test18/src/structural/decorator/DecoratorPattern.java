package structural.decorator;
//Decorator Pattern : ��ü�� �߰����� ����� �����ϰ� Ȯ���ϴ� ����
public class DecoratorPattern {
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}
}