package sec2;

import java.io.Console;
import java.io.IOException;

public class ConsoleExam {

	public static void main(String[] args) throws IOException {
		Console con = System.console();
		
		System.out.println("�̸� : ");
		String name = con.readLine();
		
		System.out.println("���� : ");
		int point = Integer.parseInt(con.readLine());	//����ȯ �ʿ�(readLine : ���ڿ�)
		
		System.out.println("ü�� : ");
		double weight = Double.parseDouble(con.readLine());
		
		System.out.println("��й�ȣ : ");
		char[] pwc = con.readPassword();	//����� ���ڿ��� �ƴ� ���ڹ迭�̹Ƿ� String�� �ƴ� char[] �迭�� �����ؾ� �Ѵ�.
		String pw = new String(pwc);	//���ڹ迭=>���ڿ� �� ��ȯ
		
		Person p = new Person(name, point, weight);
		System.out.println(p.toString());
		System.out.println("��й�ȣ : "+pw);
	}

}

//Console�� ��Ⱑ ���� ���� �Է��� �� �����Ƿ� Scanner�� �� ���� �̿��Ѵ�.
//ǥ�������δ� ����X. �׷��� �̿�Ұ�
