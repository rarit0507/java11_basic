package sec2;

public class LombokExam1 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("Keanu");
		mem1.setPw("1234");
		mem1.setPoint(30);
		System.out.println(mem1.toString());	//적용 안 돼서 오류 뜸
		
		Board b1 = new Board();
		b1.setBno(78);
		b1.setTitle("집갈래");
		b1.setContent("집간다고말했잖아");
		b1.setViewCnt(65);
		
		System.out.println(b1.toString());
	}

}
