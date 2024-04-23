package good;

public class Student {
	private String name;	//�̸�
	private int no;	//�й�
	private Subject subject;	//�ʼ�����
	public Student() {}
	public Student(String name, int no, Subject subject) {
		super();
		this.name = name;
		this.no = no;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", subject=" + subject + "]";
	}
	
	
	
}
