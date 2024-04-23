package creational.prototype;
import java.util.List;
//Prototype(����) Pattern : ������ �Ǵ� ��ü�� �����Ͽ� ���ο� ��ü�� �����ϴ� ���� 
public class PrototypePattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee();	//Employee�� ����(Prototype)
		emp1.loadData();
		
		Employee emp2 = (Employee) emp1.clone();	//Prototype�� �ӽ� ��ǰ
		List<String> list = emp2.getEmpList();	//Prototype���� ����� ����ǰ
		list.add("��ν�");
		for(String s:list) {
			System.out.println(s);
		}
	}
}