package sec1;

public class StudentExam1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student su1 = new Student();
		Student su2 = new Student();
		su2 = su1;	//얕은 복제
		Student su3 = (Student) su1.clone();	//su1을 클론해라. 선언, (형변환)
		System.out.println(su1.getClass().toString());	//해당 인스턴스의 클래스 이름 출력
		System.out.println(su1 instanceof Student);	//su1 인스턴스가 Student 클래스로 생성된 것인지?(instanceof = 연산자)
		System.out.println(su1.toString());	//toString : 주소 가져옴
		System.out.println(su1.equals(su2));	//두 인스턴스가 같은지 비교
		System.out.println(su1.hashCode());	//주소 나옴. 해시코드(후에 계산에 이용,주소값 뒤의 16진수 부분)
		
		//Student 클래스에 equals를 모든 멤버필드(변수)에 대하여 비교하는 오버라이딩 해주면, 값 비교가 가능
		System.out.println(su3.equals(su1));	//su3과 su1의 주소가 서로 달라 false로 출력
		System.out.println(su3.equals(su1));	//su3(this)과 su1(obj)의 값 비교를 위해서는 equals() 사용해야
		
		//p.353
		//getClass(), wait(), notify() : override 불가
		//나머지 5개 메서드는 변형하면 다른 기능 추가(ex. equals는 주소비교 => 값 비교)	//로그인 때 많이 씀
		//override : 클래스 자체 이름, 주소 출력X. 멤버변수(필드) 알고 싶을 때 사용
	}

}
