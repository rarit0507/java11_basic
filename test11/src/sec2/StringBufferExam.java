package sec2;
//String 그대로 두고 기능 추가 하고 싶을 때. 문자를 하나하나 받아서 가공.연산 하고 시플 때 사용. 
public class StringBufferExam {
	
	public static void main(String[] args) {
		String str = new String("Java Programmer");
		str += " Junier Level";
		str += " Develope";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer();	//스택(Stack) 구조로 형 변환
		byte[] b = str.getBytes();
		for(byte c:b) {	//문자배열을 문자열로 변경
			char k = (char) c;
			sb.append(k);	//한 문자씩 StringBuffer에 추가	//StringBuffer(!=문자열. stac
		}
		System.out.println(sb);
		
		CharStack cs = new CharStack();
		cs.push('V');
		cs.push('I');
		cs.push('C');
		cs.push('T');
		cs.push('O');
		cs.push('R');
		cs.push('Y');
		
		System.out.println(cs.list()+ ", 글자수 : "+cs.list().length);		//문자배열로 => 주소값이 나옴
		System.out.println(cs.toString()+", 글자수 : "+cs.toString().length());	//문자열로
		System.out.println((char) cs.pop());
		System.out.println((char) cs.pop());
		System.out.println((char) cs.pop());	//stack 사용(끝에서부터 사용)
		System.out.println("글자수 : "+cs.toString().length());	//3개 뺐으니 남은 건 4개
		
	}

}
