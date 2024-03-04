package sec2;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String names = "키아누리브스,앤드류가필드,라이언레이놀즈,최민식,김민아,이연정";	//구분기호(delim) = 토큰
		String anis = "개의새끼 \f 소의새끼 \n 말의새끼 \t 꿩의새끼 \r 쥐의새끼";
		System.out.println(anis);
		StringTokenizer st = new StringTokenizer(anis);	//Java lang에 있는 게 아님. util에 있음(StringTokenizer)
		
		//출력 제어 문자와 같은 것은 토큰을 기재하지 않아도 자동으로 토큰으로 간주
		while(st.hasMoreElements()) {	//토큰 또 있냐(true/false)
			System.out.println(st.nextToken().trim());
		}
		
		//특정 문자가 토큰인 경우
		StringTokenizer sk = new StringTokenizer(names, ",");
		while(sk.hasMoreElements()) {	//토큰 또 있냐(true/false)
			System.out.println(sk.nextToken().trim());
		}
		
	}

}
