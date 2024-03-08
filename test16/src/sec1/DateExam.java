package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateExam {	//날짜 변환 중요!!!

	public static void main(String[] args) {
		Date date1 = new Date();
		
		@SuppressWarnings("deprecation")	//노란 줄 꺼짐(컴파일러가 인식됨)
		Date date2 = new Date(2001,04,07,13,10,42);	//특정 날짜 객체(년,월,일,시,분,초)(월: 0~11(n-1))
		
		@SuppressWarnings("deprecation")	//노란 줄 꺼짐(컴파일러가 인식됨
		Date date3 = new Date("Tue, 07 May 2001 13:10:42 +0900"); //+0900 : TFC 822 규격 타임존(
		
		//★★★★★
		//지역 이름(Global, Local) : KST, RFC 822m, +0+00
		//국가 코드 : KR, 언어 코드 : KO =>_KR
		System.out.println(date1);	//현재 날짜와 시간 나옴
		System.out.println(date2);	//달이 다르게 나옴(기준이 다름...?)
		System.out.println(date3);
		
		System.out.println("*****LocalDate*****");
		
		LocalDate now1 = LocalDate.now();	//날짜 추출. static이므로 new키워드 생성X. now해야
		System.out.println(now1);
		//날짜 데이터 => 문자열 데이터
		String now2 = now1.toString();
		System.out.println(now2);
		//문자열 데이터 => 날짜 데이터
		LocalDate now3 = LocalDate.parse(now2);
		System.out.println(now3);
	}

}
