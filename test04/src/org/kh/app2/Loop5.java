package org.kh.app2;
//do~while~
public class Loop5 {

	public static void main(String[] args) {
		int a = 0;
		while(a>10) {
			a++;
			System.out.println(a);	//a>10이므로 에러
		}
		
		/* do~while~ : 조건이 만족하지 않더라도 최소1회 실행을 보장하는 문장 */
		do {
			System.out.println("a=" + a);
		} while(a>10);
		//개수 정해져 있으면 for, 결과 출력 수 모르면 while, 
		
		
		//역for문(감소)
		for(int i=10;i>0;i--) {
			System.out.println("i="+i);
		}
		
		System.out.println("=============================");
		//for문 무한루프
		int b = 0;
		for(;;) {	//무한루프
			b++;
			System.out.println("b="+b);
			if(b>=10) break;	//멈추려면 break 필요
		}
		
		System.out.println("=============================");
		
		int tot=0;
		for(int j=0;j<=100;j++) {	//0~100 짝수의 합
			if(j%2==1) continue;	//j가 홀수일 때 건너뜀(continue)
			tot+=j;
		}
		System.out.println("tot="+tot);
		
		int hap = 0;
		for(int k=0;k<=100;k+=2) {	//짝수의 합 이렇게 표현할 수도 k+=2
			hap+=k;
		}
		System.out.println("hap=" + hap);
	}
}
