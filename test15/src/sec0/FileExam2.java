package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {
	public static void main(String[] args) throws IOException {
		//������ ��� ��� ����
		File f1 = new File("a.txt");	//���� ���丮�� ������ �ֵ� ���� ���� ��ü ����
		File f2 = new File("../sec1/a.txt"); //�����. ���� ��Ű��(���丮)�� sec0�ε� ���� ���丮�� �̵��� �� sec1 ���丮�� a.txt���� ��ü�� ã��
		
		//������ ���� ��� ����
		File f3 = new File("d:"+File.separator+"yrl"+File.separator+"java"+File.separator+"a.txt");	//������ d:\\yrl\\java\\a.txt. �� ��Ȯ
		String path = "d:\\yrl\\java\\";
		File f4 = new File(path, "a.txt");
		File f5 = new File("d:\\yrl\\java\\", "a.txt");
		
		
		if(f1==null) {
			System.out.println("���� ������ �������� �ʽ��ϴ�.");
		} else {
			System.out.println("������ �����մϴ�.");
		}
	}

}
