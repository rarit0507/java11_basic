package sec1;
//사용자가 함수에 직접 예외 정의(RunException이 곧 예외)
class RunException extends Exception {	//Exception : 모든 예외의 최상위클래스 - extends
	public RunException() {}
	public RunException(String msg) {
		System.out.println("msg : "+msg);
		System.out.println("사용자 정의 예외 발생");
	}
}

public class UserExceptionExam {
	public static void main(String[] args) {
		try {
			method1();
		} catch (RunException e) {
			e.printStackTrace();
		}
		
	}
	
	//함수
	public static void method1() throws RunException {
		throw new RunException("사용자 예외");
	}
}
