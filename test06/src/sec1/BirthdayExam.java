package sec1;

public class BirthdayExam {

	public static void main(String[] args) {

		Birthday birth1 = new Birthday();
		birth1.setName("이예린");
		birth1.setYear(2001);
		birth1.setMonth(5);
		birth1.setDay(7);
		birth1.birth();
		birth1.birthAddr();
		
		Birthday birth2 = new Birthday();
		birth2.setName("아무개");
		birth2.setYear(1874);
		birth2.setMonth(9);
		birth2.setDay(5);
		birth2.birth();
		birth2.birthAddr();
		//같은 클래스로부터 유래된 인스턴스라도 주소가 서로 다르다
		
		
	}

}
