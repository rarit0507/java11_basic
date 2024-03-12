package exam2;

import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		
		List<Integer> list = null;
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add(1.23456);	//정수 아님
		
		for(int num : list) {
			char ch;
			
			if(num <=0) {
				ch = '-';
			} else if(num > 0) {
				ch = '+';
			} else {
				System.out.println("@@@@@@@@@@");
				continue;
			}
			
			//int Math.abs(정수) : 정수의 절대값을 반환
			for(int i=1 ;  i<Math.abs(num) ; i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
