package sec3;
//LeastJob : 작업량이 가장 적은 것부터 진행
//1. SRT(Short Remain time Job) : 남은 시간이 가장 작은 것부터 진행 => 선점형
//2. SCJ(Short time Job) : 요구 시간이 가장 작은 것부터 진행(스케줄링) => 비선점형
//아래와 같이 5개 프로세스가 CPU에서 처리되고자 한다면
//A		08:00	3시간
//B		09:00	2시간
//C		10:00	4시간
//D		14:00	3시간
//E		14:00	2시간
//총 시간 14시간
//SCJ : B -> E -> A -> D -> C (작업량이 작은 것부터. 중간에 작업자 변경 불가(비선점))
//SRT : 8~11	9,11~13	10,13,14	14~16	16~19	14,19~22 (시간 따라 선점형)
//		A->		B->		C->			E->		C->		D
public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("현재 상담이 모두 완료되었습니다. 다음 상담하실 분 들어오세요.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담시간이 가장 적게 걸리는 사람을 우선 배정합니다.");
	}

}
