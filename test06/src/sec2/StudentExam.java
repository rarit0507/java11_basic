package sec2;
//클래스간 엮어서 작동
public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student("이예린", 1, 100000);
		Student s2 = new Student("키아누", 3, 200000);
		Student s3 = new Student("리브스", 2, 300000);

		Bus bus1 = new Bus(101);
		s1.takeBus(bus1);	//버스타면
		s1.print(); 		//student 클래스에 만들어둠
		bus1.show();
		
		//키아누 학생이 버스(101번 버스)를 두 번 이용하고, 지하철 2호선을 세 번 이용하였을 경우
		//키아누 학생의 정보와 버스 101번 정보와 지하철 2호선 정보 출력하기
		
		Subway sub2 = new Subway(2);	//2호선
		s2.takeBus(bus1);
		s2.takeBus(bus1);
		s2.takeSubway(sub2);
		s2.takeSubway(sub2);
		s2.takeSubway(sub2);
		s2.print();		//학생 정보 출력
		bus1.show();	//버스 정보 출력
		sub2.show();	//지하철 정보 출력
	}

}
