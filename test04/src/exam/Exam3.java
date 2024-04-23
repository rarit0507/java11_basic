package exam;
//Q3. 구구단을 단보다 곱하는수가 작거나 같은 경우만 출력
public class Exam3 {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1;j<=i;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
			for(int i=2;i<=9;i++) {
				System.out.println(i+"단");
				for(int j=1;j<=9;j++) {
					if(j>i) continue;
					System.out.println(i+"*"+j+"="+i*j);
				}
				System.out.println();
			}
	}

}
