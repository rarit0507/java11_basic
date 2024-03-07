package sec2;

import java.io.Console;
import java.io.IOException;

public class ConsoleExam {

	public static void main(String[] args) throws IOException {
		Console con = System.console();
		
		System.out.println("이름 : ");
		String name = con.readLine();
		
		System.out.println("점수 : ");
		int point = Integer.parseInt(con.readLine());	//형변환 필요(readLine : 문자열)
		
		System.out.println("체중 : ");
		double weight = Double.parseDouble(con.readLine());
		
		System.out.println("비밀번호 : ");
		char[] pwc = con.readPassword();	//비번은 문자열이 아닌 문자배열이므로 String이 아닌 char[] 배열로 선언해야 한다.
		String pw = new String(pwc);	//문자배열=>문자열 형 변환
		
		Person p = new Person(name, point, weight);
		System.out.println(p.toString());
		System.out.println("비밀번호 : "+pw);
	}

}

//Console은 대기가 없어 값을 입력할 수 없으므로 Scanner를 더 많이 이용한다.
//표면적으로는 오류X. 그러나 이용불가
