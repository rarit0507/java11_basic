package sec2;

public class StringBuilderExam {

	public static void main(String[] args) {
		String str = new String("Java");
		str += 11;
		str += " Programmer";
		str += " Junier Level";
		str += " Develope";
		str = "KH " + str;	//얘도 처음에 끼워넣는 건 됨. 그러나 중간에 끼워넣을 수는 없음
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();	//문자열을 더할 수 있음
		sb.append("Java");
		sb.append(11);
		sb.append(" Programmer");
		sb.insert(6,  " Web");	//중간에 끼워넣기
		sb.insert(0, "KH ");
		System.out.println(sb);
		
	}

}
