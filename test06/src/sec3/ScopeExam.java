package sec3;
//Scope : 특정 변수가 영향을 미치는 범위
public class ScopeExam {
	int a = 10;		//전역 변수(global scope) : 클래스 전체에서 인지되는 변수이나, 특정 메소드(함수)내에서는 인지하지 못함
	static int b = 100;	//클래스 변수 : 클래스 전체에서 인지되며, 특정 메소드(함수) 내에서도 인지함. static
	public static void main(String[] args) {

		int a = 20;	//지역변수(local scope) : 특정 메소드(함수) 내에서 선언되어 활용되는 변수. 함수 블록 벗어나면 인지할 수 없음
		System.out.println("지역변수 a="+a);
		run();		
		run(30);
		
	}	//main
	
	//함수
	public static void run() {
		int c = 40;	//지역 변수
		//System.out.println("전역 변수 a="+a);	//전역변수 a는 함수 내 인식 불가
		System.out.println("클래스 변수 b="+b);
	}
	public static void run(int a) {	//매개변수(local scope) : 메소드(함수) 정의 시 괄호 안에 있는 변수. 호출 시 지정된 값을 저장함.
		System.out.println("a="+a);
	}
}
