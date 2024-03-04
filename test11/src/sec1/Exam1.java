package sec1;

public class Exam1 {

	public static void main(String[] args) {
		int a = 1004;
		int b = 1004;
		System.out.println("a==b : "+(a==b));	//단순 값 비교. true. 그러나 주소값은 다름(다른 인스턴스라)
		String s1 = "김기태";		//기본형X 참조형X.
		String s2 = "김기태";
		System.out.println("s1==s2 : "+(s1==s2));	//true	//문자열의 값 비교. 틀림.(프레임워크에서 String의 == 금지. equals 써야함)
		System.out.println("s1 equals s2 : "+(s1.equals(s2)));	//맞는 문자열의 값 비교=> String 클래스 연산을 해야
		
		Integer c = 1004; 	//= new Integer(1004);	//참조형
		Integer d = new Integer(1004);				//참조형
		
		System.out.println("a==c : "+(a==c));	//true(기본형)	//기본형과 참조형 비교 = 값 비교
		System.out.println("c==d : "+(c==d));	//false(참조형)	//참조형과 참조형 비교 = 주소 비교
		System.out.println("c equals d : "+(c.equals(d)));	//참조형의 비교는 equals로 해야함.
	}

}
