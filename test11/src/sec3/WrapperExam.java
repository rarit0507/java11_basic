package sec3;

public class WrapperExam {

	public static void main(String[] args) {
		int a = 10;	//기본 타입 선언. 초기화 필요
		Integer b = a;	//참조형 타입 선언(참조형에 기본형 데이터 대입) : Wrapping, Boxing(자동 박싱)
		int c = b;	//기본형에 참조형 데이터 대입 : UnWrap, UnBoxing
		//UnBoxing <=> Boxing : 기본형은 멤버를 가질 수 없으므로 해당 타입의 메소드나 필드를 사용할 수 없기 때문에
		//참조형으로 변경하여야 여러 필요한 정보를 확인하고, 그 타입의 메소드를 사용할 수 있다.
		//해당 타입의 관련 메소드를 사용하기 위해서는 기본형을 참조형으로 바꾸어야 한다.
		//그러므로, 기본 타입에 관련된 Boxing(Wrapping)을 실시하여 참조형으로 변경할 수 있는 클래스를 Wrapper클래스라고 한다.
		//boolean <=> Boolean
		//byte <=> Byte
		//char <=> Character
		//short <=> Short
		//int <=> Integer
		//long <=> Long
		//float <=> Float
		//double <=> Double
		String d = "10";
		String e = "3.14";
		//double f = (double) e;	//String -> double 강제 형 변환 불가
		//기본형은 valueOf() 등의 메소드를 사용할 수 없음. 따라서 Boxing 필요
		System.out.println("문자열 10을 Byte(절대값) 타입의 10으로 변경  => "+Byte.valueOf(d));
		System.out.println("문자열 10을 Integer(정수) 타입의 10으로 변경  => "+Integer.valueOf(d));
		System.out.println("문자열 3.14를 Double(실수) 타입의 10으로 변경  => "+Double.valueOf(e));
	}

}
