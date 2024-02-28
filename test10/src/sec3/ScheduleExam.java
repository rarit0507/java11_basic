package sec3;

import java.io.IOException;

public class ScheduleExam {

	public static void main(String[] args) throws IOException {
		//키보드로 알파벳[A-Z]를 입력받아 입력 값이 'R'이면, RoundRobin의 객체가,
		//'P'이면, PriorityAllocation의 객체가,
		//'L'이면, LeastJob의 객체가 생성되고,
		//그 밖의 문자가 입력되면, "지원하지 않는 스케줄링입니다." 출력
		//입력 문자는 대문자와 소문자 모두 입력 가능하도록 비교하여야 함.
		
		Scheduler s = null;	//3가지 모두 출력하기 위해서는 조상 인터페이스 사용해야
		System.out.print("전화 상담 방식 선택[A-Z] : ");
		int ch = System.in.read();	//한 글자만 입력받을 땐 이것만 써도 됨.(Scanner 대신)	//'예외처리' 필요(아직 안 배움)
		
		
		
		/*
		switch(ch) {
			case 'R':
			case 'r':
				s = new RoundRobin();
				break;
			case 'P':
			case 'p':
				s = new PriorityAllocation();
				break;	
			case 'L':
			case 'l':
				s = new LeastJob();
				break;	
			default:
			System.out.println("지원하지 않는 스케줄링입니다.");
		}
		*/
		
		if(ch=='R'||ch=='r') {
			s = new RoundRobin();
		} else if(ch=='P'||ch=='p') {
			s = new PriorityAllocation();
		} else if(ch=='L'||ch=='l') {
			s = new LeastJob();
		} else {
			System.out.println("지원하지 않는 스케줄링입니다.");
		}
		
		
		s.getNextCall();
		s.sendCallToAgent();	//메소드는 실행식 이후에 나와야 작동함...
		
		
		
	}

}
