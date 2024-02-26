package sec3;

public class People {
	public static int selNum = 100;	//고유번호 - static(정적 필드=공유데이터(어느 한 값 바꾸면 다 바뀜)) : 객체와 관계없이 메모리 공유됨
	public String name;		//이름
	public int age;			//나이
	public String addr;		//주소
	
	//static 메소드
	public void print1() {		//일반 메소드
		System.out.println("selNum : " + this.selNum);
		System.out.println("name : " + this.name);
	}
	public static void print2() {	//정적(static) 메소드
		System.out.println("Name : 아무개");	//static 메소드 -> this.name 인식 못함
		System.out.println("Age : 28 ");
	}
}
