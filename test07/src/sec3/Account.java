package sec3;

public class Account {
	private String bank = "은행명";
	private String name = "이름";
	private int no = 00000;	//계좌번호
	private int money = 0;	//잔액
	
	//계좌번호 생성자함수
	public Account(int num) {
		this.no = num;
	}
	
	//Top-down
	public Account() {
		this("은행명");
	}
	public Account(String bank) {
		this(bank, "아무개");
	}
	public Account(String bank, String name) {
		this(bank, name, 00000);
	}
	public Account(String bank, String name, int no) {
		this(bank, name, no, 0);
	}
	public Account(String bank, String name, int no, int money) {
		this.bank = bank;
		this.name = name;
		this.no = no;
		this.money = money;
	}
	
	//toString
	@Override
	public String toString() {
		return "Account [bank=" + bank + ", name=" + name + ", no=" + no + ", money=" + money + "]";
	}
	//gettersetter
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	//입금 메소드
	public void take(int money) {
		this.money+=money;
	}
	//출금 메소드
	public void give(int money) {
		this.money-=money;
	}
	//은행의 현재 정보 출력
	public void show() {
		System.out.println("은행명 : "+this.bank+"예금주 : "+this.name+"계좌번호 : "+this.no+"잔액 : "+this.money);
	}
	
}