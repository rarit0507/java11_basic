package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam2 {

	public static void main(String[] args) {
		String[] email = {"rarit0507","rarit0507@naver","yrl05070875@gmail.com","yrl0507@daum.net"};
		Pattern p1 = Pattern.compile("[a-z0-9]+@[a-z0-9]+\\.[a-z]+$*");	//�̸��� ����, \\:Ư������, +$:�ڿ� ���� �� ����
		for(int i=0;i<email.length;i++) {
			Matcher m = p1.matcher(email[i]);
			if(m.matches()) {
				System.out.println("�̸��� ������ �½��ϴ�.");
				System.out.println(email[i]);
			}
		}
		
		String[] phone = {"02-1234-1234","010-2548-1545","032-7979-2424","010-4448-6652","031-2395-0875","010-254-4564"};
		Pattern p2 = Pattern.compile("010-\\d{3,4}-\\d{4}");	//�޴��� ��ȣ ����
		for(int i=0;i<phone.length;i++) {
			Matcher m = p2.matcher(phone[i]);
			if(m.matches()) {
				System.out.println("�޴��� ������ �½��ϴ�.");
				System.out.println(phone[i]);
			}
		}
		
		String[] jm = {"941207-1234567","010203-6789456","381425-1234567","851019-234567","780528-4512454"};
		Pattern p3 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}");
		for(int i=0;i<jm.length;i++) {
			Matcher m = p3.matcher(jm[i]);
			if(m.matches()) {
				System.out.println("�´� �ֹι�ȣ�Դϴ�.");
				System.out.println(jm[i]);
			}
		}
		//�����ȣ ���� : 100����(1xx-yy)~700����(7xx-yy)
		String[] post = {"123-123","212-34","816-24","5434-54","683-39"};
		Pattern p4 = Pattern.compile("[1-7]\\d{2}\\-\\d{2}");
		for(int i=0;i<post.length;i++) {
			Matcher m = p4.matcher(post[i]);
			if(m.matches()) {
				System.out.println("�´� �����ȣ�Դϴ�.");
				System.out.println(post[i]);
			}
		}
		//��й�ȣ ����: 4~20���ڷ� ���� ��/�ҹ��ڿ� Ư������(!@#$%^&*?_) �׸��� ���ڸ� ��� �ּ� 1���� ����
		//() : �ݵ�� ����
		//? : �� ����(���� ��)
		//=. : �̻�
		//* �ڿ� ������ ��������
		//(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$	�ڡڡڡڡڱ��!!!!!
		String[] pw = {"abcd1234","A123a","1234","ABCD!123456","Abc!432","YRL#1004"};
		Pattern p5 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$");
		for(int i=0;i<pw.length;i++) {
			Matcher m = p5.matcher(pw[i]);
			if(m.matches()) {
				System.out.println("���� �빮��, �ҹ���, Ư������, ���ڰ� ��� ���Ե� �´� ��й�ȣ�Դϴ�.");
				System.out.println(pw[i]);
			}
		}
	}

}
