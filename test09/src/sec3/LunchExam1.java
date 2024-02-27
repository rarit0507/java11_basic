package sec3;

public class LunchExam1 {

	public static void main(String[] args) {
		Lunch l;
		
		System.out.println("\nKorean");
		l = new Korean();
		l.eating("비빔밥");
		
		System.out.println("\nChinese");
		l = new Chinese();
		l.eating("마라탕");
		
		System.out.println("\nJapanese");
		l = new Japanese();
		l.eating("사케동");
		
	}

}
