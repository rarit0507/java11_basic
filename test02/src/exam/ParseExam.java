package exam;

public class ParseExam {

	public static void main(String[] args) {
		String str = "123";
		//정수로 형 변환
		int i = Integer.parseInt(str);
		System.out.println("정수 : "+i);
		
		str = "123.456";
		//실수로 형 변환
		double d = Double.parseDouble(str);
		System.out.println("실수 : "+d);
		
		char[] ch = {'K', 'i','m'};
		
		//숫자를 문자열로 변환
		String j = String.valueOf(i);
		String k = String.valueOf(d);
		String r = i + "";	//따옴표로 바꿀 수는 있으나 개발자 규칙 상 어긋나는 행위로 간주(하지마)
		
		//문자배열을 문자열로 변환
	}

}
