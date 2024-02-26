package sec1;

public class Birthday {
	private String name;
	private int year;
	private int month;
	private int day;
	
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	//추가 메소드 작성(매개변수 있을 시에는 변수에 this. 붙이기(구분위해))
	public void birth() {
		System.out.println(year+"-"+month+"-"+day);
	}
	public void birthAddr() {	//주소
		System.out.println(this);
	}

}
