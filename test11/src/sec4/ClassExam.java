package sec4;

public class ClassExam {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person p1 = new Person("키아누리브스",50);
		//p1의 소속 패키지 이름과 클래스명을 출력하라.
		System.out.println("클래스명 : "+p1.getClass().getName());
		
		Class<Person> p2 =Person.class;	//이렇게 할 수도(생성자)	//클래스의 정보를 불러오기 위해 Class라는 클래스 필요
		System.out.println("클래스명 : "+p2.getName());
		
		Class p3 = Class.forName("sec4.Person");	//오류에 마우스 올려 선언 필요★★★많이 씀
		System.out.println("클래스명 : "+p3.getName());
		
		Person p4 = (Person) p3.newInstance();
		p4.setName("존윅");
		p4.setAge(50);
		System.out.println("인스턴스 정보 : "+p4);
		
		//p.386 Q4
		//생성자 생성
		//
		//Class p = Class.forName("sec4.MyDog");	//★★★
		//MyDog dog = (MyDog) p.newInstance();
		//dog.setName("멍멍이");
		//dog.setType("진돗개");
	}

}
