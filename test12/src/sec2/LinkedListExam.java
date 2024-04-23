package sec2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		List<Student> sList = new LinkedList<Student>();
		//추가 방법 1
		Student s1 = new Student();
		s1.setNo(1);;
		s1.setName("키아누리브스");
		s1.setPoint(100);
		sList.add(s1);
		//추가 방법 2
		Student s2 = new Student(2, "앤드류가필드",90);
		sList.add(s2);
		//추가 방법 3(선언X)
		sList.add(new Student(3, "라이언레이놀즈", 80));
		
		
		sList.add(new Student());
		sList.set(3, new Student(4, "톰크루즈",95));	//인덱스 3이 없어서(0,1,2) 오류 뜸. 위에 줄처럼 새 인스턴스 생성 필요
		
		System.out.println("번호\t이름\t점수");
		for(Student s:sList) {
			System.out.println(s.getNo()+"\t"+s.getName()+"\t"+s.getPoint());
		}
	}

}
