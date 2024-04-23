package exam;

public class Exam2 {
//Q2. 구구단 짝수단만 출력
	public static void main(String[] args) {
		//
		for(int i=2;i<=9;i++) {
			if(i%2==1)
				continue;
			for(int j=1;j<=9;j++) {
				System.out.printf("%dx%d=%d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		//
		
		for(int i=2;i<=9;i+=2) {	//>>>>i+=2<<<<, 단(i) 2,4,6,8
			System.out.println(i+"단");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		//탭(가로)
		for(int i=1;i<=9;i++) {	//줄
			for(int j=2;j<=9;j++) {	//단
				if(j%2==1)
					continue;
				System.out.printf("%dx%d=%d\t", j, i, j*i);
		}
		System.out.println();
	}
	}

}
