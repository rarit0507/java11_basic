package sec1;
//NullPointerException : 출력할 문장의 값이 null일 경우
public class ExceptionExam2 {

	public static void main(String[] args) {
		String name = null;
		System.out.println("name : "+name);
		
		//실제 처리할 문장(try)이 예외가 발생하면, 예외처리 문장(catch) 실행★★★★★
		
		//다중 catch문
		try {
			//실제 처리할 문장
			System.out.println(name.toString());
			System.out.println("정상처리 문장 아래");
		} catch(NullPointerException e) {
			e.printStackTrace();
			name = "키아누리브스";
			System.out.println(name+"\n예외처리 문장 아래");
		} catch(Exception e) {
			System.out.println("정체를 알 수 없는 예외 발생");
		}	//습관적으로 맨 마지막에는 catch(Exception e) 해주는 게 좋음
	}

}
