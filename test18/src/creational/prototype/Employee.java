package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
	private List<String> empList;
	public Employee() {
		empList = new ArrayList<String>();
	}
	public Employee(List<String> empList) {
		this.empList = empList;
	}
	public void loadData() {
		empList.add("�����");
		empList.add("ȫ�浿");
		empList.add("������");
		empList.add("���ָ�");
	}
	public List<String> getEmpList() {
		return empList;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> tmp = new ArrayList<String>();
		for(String s:empList) {
			tmp.add(s);
		}
		return new Employee(tmp);
	}
	@Override
	public String toString() {
		return "Employee [empList=" + empList + "]";
	}
	
}