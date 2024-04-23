package sec1;

public class GenericExam {
	public static void main(String[] args) {
		//생성자에 대한 제네릭의 타입 생략 가능 - 자바 1.7 이상
		Generic1<Student> s = new Generic1<>();	//s: Student type
		Student a = new Student("장원영", 21);
		s.setField1(a);
		
		Generic1<Teacher> t = new Generic1<>();	//t: Teacher type
		Teacher b = new Teacher("김기태", 43);
		t.setField1(b);
		
		//Generic1<int> i = new Generic1<>();	//기본형 불가
		Generic1<Integer> i = new Generic1<>();	//i: Integer type
		i.setField1(1004);
		
		Generic1<String> str = new Generic1<>();//str: String type
		str.setField1("키아누리브스");
	}
}
