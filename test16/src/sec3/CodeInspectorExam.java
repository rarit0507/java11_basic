package sec3;
//코드 인스펙션 => 성능 개선, 코드 작성 규칙 준수, 에러 발생 가능성 최소화 목적 작업.
//PMD : 코드 인스펙션 도구(소스 코드 검증)
//Code Inspection Level
//name		Symbol	Level		Comment
//Blocker	빨간색	High		필수, 에러 발생 가능성이 매우 높거나 메모리 누수 발생되는 코드
//Critical	시안		Medium High	권고 상, 에러 발생 가능성이 높거나 일반적
//Urgent	초록		Medium		(Major) 권고 중, 에러 발생이 있거나 수
//Important	마젠타	Medium Low	(Mino) 소스코드의 가독성, 유지 보수성
//Warning	파랑		Low			(Info) 정보성으로 제공되는 위반 사항으로
public class CodeInspectorExam {

	public static void main(String[] args) {
		Reader r1 = new Reader();
		Reader r2 = new Reader(2,"http://www.naver.com","네이버 사이트",1);
 		r1.def = "시작 페이지";
		//System.out.println(r2.toString());
		//System.out.println(r2.def);	//실제로 출력할 땐 sysout으로 출력X(해킹가능성)
	}

}
