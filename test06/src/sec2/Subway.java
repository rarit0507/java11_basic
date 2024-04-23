package sec2;

public class Subway {
	int no;
	String station;
	int cnt;
	int money;
	
	//지하철 노선번호를 매개변수로 받는 생성자 함수
	public Subway(int num) {
		this.no = num;
	}
	
	//지하철 승객이 탑승하면 생기는 필드값 변화
	public void take(int money) {
		this.money += money;	//돈
		cnt++;					//승객
	}
	
	//현재 지하철 정보 출력
	public void show() {
		System.out.println("지하철 " + this.no + "호선, " + "누적 요금 : " + this.money);
	}
}
