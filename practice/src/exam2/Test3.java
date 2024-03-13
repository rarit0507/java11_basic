package exam2;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		
		//List<Integer> list = null;
		List<Integer> list = new ArrayList<>();	//List는 인터페이스로 객체 생성이 불가, list 선언만 있으므로 객체 생성이 되어 있지 않아 NullPointerException이 발생한다.
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		//list.add(1.23456);	//정수 아님
		list.add(1);	//List 선언 시 요소의 데이터 타입이 Integer로 설정되어 있으므로 정수만 입력받을 수 있으므로 데이터 타입 오류 발생
		
		for(int num : list) {
			char ch;
			
			//if(num <= 0) {
			if(num < 0) {	//등호 빼야	//if문의 조건에서 0을 포함하여 음수라고 표현했으므로 0이어도 음수값이 발생하고, 0인 경우에 정상적으로 처리되어야 할 else문이 실행되지 않음.
				ch = '-';
			} else if(num > 0) {
				ch = '+';
			} else {
				System.out.println("################");	//0 값은 #이 입력되어야 ("@@@@@@@@@@")
				continue;
			}
			
			//int Math.abs(정수) : 정수의 절대값을 반환
			//for(int i=1 ;  i<Math.abs(num) ; i++) {	//배열 인덱스는 0부터 시작
			//for반복문의 실행 조건이 해당 숫자를 포함하는 것이 아닌 작을 때까지만 실행하게 되어, 해당 숫자의 횟수만큼 부호를 출력해야 하나 한 번씩 덜 출력됨.
			for(int i=1 ;  i<=Math.abs(num) ; i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
