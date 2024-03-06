package sec1;
//예외(Exception)처리 :프로그래밍 로직상 에러가 발생하면, 그 이후의 처리문장도 처리되지 못함.
//이러한 경우를 예외(Excption)라고 함. 그렇다면, 다음 문장까지 실행될 수 있도록
//계속 다음 문장도 처리될 수 있도록 하는 것
public class ExceptionExam1 {

	public static void main(String[] args) {
		String name = null;
		System.out.println("name : "+name);
		
		//실제 처리할 문장(try)이 예외가 발생하면, 예외처리 문장(catch) 실행★★★★★
		try {
			System.out.println(name.toString());	//실제 처리할 문장
		} catch(Exception e) {
			System.out.println("알 수 없는 오류가 발생하였습니다.");	//실제 처리 문장에서 오류(예외) 발생 시 처리할 문장
		}
	}

}
