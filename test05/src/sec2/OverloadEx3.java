package sec2;

public class OverloadEx3 {

	public static void main(String[] args) {
		Board b1 = new Board();	//매개변수 없는 방식으로 b1객체 생성(1)
		b1.setBno(1);
		b1.setTitle("즐거운 자바 코딩");
		b1.setUname("acf");
		
		Board b2 = new Board(101);	//bno가 있는 생성자 방식으로 b2객체 생성(2)
		b2.setTitle("평가대비해라...");
		b2.setUname("wolf");		//추가하려면 이렇게 set 함수 사용해서 추가해야
		
		Board b3 = new Board(102, "오늘은 불금");
		b3.setUname("walkman");
		
		Board b4 = new Board(102, "주말에코딩해라", "rarit0507");	//(1)의 과정을 한 번에 처리할 수 있음
		
		Board b5 = new Board(103, "집보내줘", "rarit", "오늘진짜레전드졸림", "2024.02.22", 20240220);
		
		Notice n1 = new Notice(101, "주말 자바 코딩", "rarit0507", "주말에 공부하세요", "2024.02.23", 20240220);
		Notice n2 = new Notice(102, "집좀보내줘", "와난", "집이없어요", "2023.04.22", 20240215);
		
		News ne1 = new News();
		
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		System.out.println(b4.toString());
		System.out.println(b5.toString());
		System.out.println(ne1.toString());
		
	}

}
