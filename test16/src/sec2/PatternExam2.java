package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam2 {

	public static void main(String[] args) {
		String[] email = {"rarit0507","rarit0507@naver","yrl05070875@gmail.com","yrl0507@daum.net"};
		Pattern p1 = Pattern.compile("[a-z0-9]+@[a-z0-9]+\\.[a-z]+$*");	//이메일 패턴, \\:특수문자, +$:뒤에 조건 더 없음
		for(int i=0;i<email.length;i++) {
			Matcher m = p1.matcher(email[i]);
			if(m.matches()) {
				System.out.println("이메일 형식이 맞습니다.");
				System.out.println(email[i]);
			}
		}
		
		String[] phone = {"02-1234-1234","010-2548-1545","032-7979-2424","010-4448-6652","031-2395-0875","010-254-4564"};
		Pattern p2 = Pattern.compile("010-\\d{3,4}-\\d{4}");	//휴대폰 번호 패턴
		for(int i=0;i<phone.length;i++) {
			Matcher m = p2.matcher(phone[i]);
			if(m.matches()) {
				System.out.println("휴대폰 형식이 맞습니다.");
				System.out.println(phone[i]);
			}
		}
		
		String[] jm = {"941207-1234567","010203-6789456","381425-1234567","851019-234567","780528-4512454"};
		Pattern p3 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}");
		for(int i=0;i<jm.length;i++) {
			Matcher m = p3.matcher(jm[i]);
			if(m.matches()) {
				System.out.println("맞는 주민번호입니다.");
				System.out.println(jm[i]);
			}
		}
		//우편번호 패턴 : 100번대(1xx-yy)~700번대(7xx-yy)
		String[] post = {"123-123","212-34","816-24","5434-54","683-39"};
		Pattern p4 = Pattern.compile("[1-7]\\d{2}\\-\\d{2}");
		for(int i=0;i<post.length;i++) {
			Matcher m = p4.matcher(post[i]);
			if(m.matches()) {
				System.out.println("맞는 우편번호입니다.");
				System.out.println(post[i]);
			}
		}
		//비밀번호 패턴: 4~20글자로 영문 대/소문자와 특수문자(!@#$%^&*?_) 그리고 숫자를 모두 최소 1문자 포함
		//() : 반드시 포함
		//? : 한 문자(글자 수)
		//=. : 이상
		//* 뒤에 나오는 조건으로
		//(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$	★★★★★기억!!!!!
		String[] pw = {"abcd1234","A123a","1234","ABCD!123456","Abc!432","YRL#1004"};
		Pattern p5 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$");
		for(int i=0;i<pw.length;i++) {
			Matcher m = p5.matcher(pw[i]);
			if(m.matches()) {
				System.out.println("영문 대문자, 소문자, 특수문자, 숫자가 모두 포함된 맞는 비밀번호입니다.");
				System.out.println(pw[i]);
			}
		}
	}

}
