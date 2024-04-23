package sec1;

public class Student {	//extends Object 생략됨. 모든 클래스 최고 조상(시조) 클래스 : Object.
	private int sno;
	String name;
	
	public Student() { }
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
		
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	
	//객체 복제 시에는 반드시 clone()을 오버라이드 해야
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student clone = new Student();	//Student(클래스)를 아예 생성을 해라. 해당 객체 생성
		clone.name = this.name;			//새로 생성된 객체에 모든 필드 값 넘기기
		clone.sno = this.sno;
		return clone();
	}
	//equals 오버라이딩(굳이,, 건들 필요 없음. 없어도 실행 파일에서 equals 사용 가능)
	//아래 부분처럼 equals() 오버라이딩 하면 값 비교가 가능하게 됨.
	//얘 없으면 값 비교가 아니라 주소 비교함.
	//Student 클래스에다가 값 비교 오버라이딩 추가한 것.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {	//얘가 Student 클래스인지 먼저 알아보고
			Student su1 = (Student) obj;
			if(su1.name == this.name && su1.sno == this.sno) {
				return true;
			} else {
				return false;
			}
		} else {
			return super.equals(obj);
		}
		
	}
	
	
	
}
