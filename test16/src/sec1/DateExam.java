package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateExam {	//��¥ ��ȯ �߿�!!!

	public static void main(String[] args) {
		Date date1 = new Date();
		
		@SuppressWarnings("deprecation")	//��� �� ����(�����Ϸ��� �νĵ�)
		Date date2 = new Date(2001,04,07,13,10,42);	//Ư�� ��¥ ��ü(��,��,��,��,��,��)(��: 0~11(n-1))
		
		@SuppressWarnings("deprecation")	//��� �� ����(�����Ϸ��� �νĵ�
		Date date3 = new Date("Tue, 07 May 2001 13:10:42 +0900"); //+0900 : TFC 822 �԰� Ÿ����(
		
		//�ڡڡڡڡ�
		//���� �̸�(Global, Local) : KST, RFC 822m, +0+00
		//���� �ڵ� : KR, ��� �ڵ� : KO =>_KR
		System.out.println(date1);	//���� ��¥�� �ð� ����
		System.out.println(date2);	//���� �ٸ��� ����(������ �ٸ�...?)
		System.out.println(date3);
		
		System.out.println("*****LocalDate*****");
		
		LocalDate now1 = LocalDate.now();	//��¥ ����. static�̹Ƿ� newŰ���� ����X. now�ؾ�
		System.out.println(now1);
		//��¥ ������ => ���ڿ� ������
		String now2 = now1.toString();
		System.out.println(now2);
		//���ڿ� ������ => ��¥ ������
		LocalDate now3 = LocalDate.parse(now2);
		System.out.println(now3);
	}

}
