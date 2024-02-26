package sec3;

public class PeopleExam {

	public static void main(String[] args) {
		People p1 = new People();
		People.selNum = 200;		//p1.selNum = 200과 동일 => 클래스 변수==정적 필드==공유데이터(객체 생성 필요x)
		p1.name = "이예린";			//인스턴스 변수==동적 필드(객체생성필요)
		p1.age = 22;
		p1.addr = "노원구";
		
		System.out.println(p1.selNum+","+p1.name);
		
		People p2 = new People();
		People.selNum = 300;		//p2.selNum = 300과 동일
		p2.name = "Keanu";
		p2.age = 50;
		p2.addr = "안암동";
		
		p1.selNum = 400;
		
		System.out.println(p1.selNum+","+p1.name);	//static int selNum -> 300 -> 400
		System.out.println(p2.selNum+","+p2.name);

		p1.print1();
		p2.print1();
		
		p1.print2();	//static 메소드: 호출 시 기울임꼴	//People.print2
		p2.print2();	//p1, p2 같은 결과 나옴			//People.print2
		
		//정적(static) 요소 : static으로 선언된 필드or메소드, 객체 생성 없이 활용가능
		//정적(static) 메소드 : 객체의 생성 없이 해당하는 클래스에서 바로 활용하는 메소드
		System.out.println("정적 메소드 == 클래스 메소드");
		People.print2();
		People.selNum = 500;
		p1.print1();
		p2.print1();
		
	}

}
