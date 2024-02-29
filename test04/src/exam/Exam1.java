package exam;
//교재 p.123
public class Exam1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result = 0;
		
		switch(operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			System.out.println("연산 오류");
		}
		System.out.println("결과 값 : " + result);
		
		
		if(operator=='+') {
			result=num1+num2;
		} else if (operator=='-') {
			result=num1-num2;
		} else if (operator=='*') {
			result=num1*num2;
		} else if (operator=='/') {
			result=num1/num2;
		} else System.out.println("연산 오류");
		System.out.println("결과 값 : " + result);
	}
}
