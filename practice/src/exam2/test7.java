package exam2;

import java.util.Arrays;
import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] personArr = new String[5];
		//for(int i = 0; i<personArr.length(); i++) {	//1.뒤에서 "i번째 주민번호 입력" 출력하기 위해 i=1~<=Arr.length. /2.숫자 길이이므로 length메소드가 아니라 그냥 length 쓴다.
		for(int i = 0; i<personArr.length; i++) {
			System.out.print(i+1+"번째 주민번호 입력 : ");
			String personId = sc.nextLine();
			if((personId.length() == 14)) {
				//char gender = personId.charAt(8);	//3.성별 구분 위한 숫자는 8번째 글자(인덱스 7)이므로 chatAt(7)
				char gender = personId.charAt(7);
				//if(gender == 1 || gender == 2 || gender == 3 || gender == 4) {	//4.char 문자 비교이므로 '' 써줘야
				if(gender == '1' || gender == '2' || gender == '3' || gender == '4') {
					personArr[i] = personId.substring(0, 8) + "******";
				} else {
					System.out.println("잘못된 주민번호 형식입니다. 다시 입력하세요.");
				}
			} else {
				System.out.println("잘못된 주민번호 형식입니다. 다시 입력하세요.");
			}
		}
		System.out.println("--- 주민번호 정보 등록 완료 ---");
		System.out.println(Arrays.toString(personArr));
	
	}
}
