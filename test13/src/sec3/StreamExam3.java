package sec3;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//reduce() 활용하기
//예시 : 여러 문자열(String)의 배열에서 가장 글자 수가 많은(2진수 값이 가장 큰) 문자열을 찾아 반환하는 프로그램 작성
//BinaryOperator : 문자/숫자 다 2진수 변환하여 비교하거나 처리하고자 할 때 활용되는 인터페이스이자 제네릭
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
	
}
public class StreamExam3 {
	public static void main(String[] args) {
		//람다식으로 처리
		String[] arr = {"김수한무","거북이와 두루미","삼천갑자동방삭","동해물과","Kim","Lee YeRin"};
		System.out.println(Arrays.stream(arr).reduce("", (s1, s2) -> {	//통로(매개변수) 2개 뿐. 2개씩 요소 짝지어 넣고 돌림. : reduce
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));
		//BinaryOperator 사용
		System.out.println("BinaryOperator를 활용한 reduce");
		String res = Arrays.stream(arr).reduce(new CompareString()).get();
		System.out.println(res);
	}

}
