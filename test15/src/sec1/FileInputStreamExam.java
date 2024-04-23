package sec1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//p.225(å�� ���� ��ü �� ��)
//FileInputStream : ����Ʈ ��Ʈ�� ������ ������ ������ �������� �� ��� Ȱ��.
//����Ʈ �����̹Ƿ� char�� ��ȯ�Ͽ� �о�� ��.
//�����ڵ�(�ѱ�, ��������) ���� �о �� ����.
public class FileInputStreamExam {
	public static void main(String[] args) throws IOException {
		File f1 = new File("a.txt");
		
		//EOF(End Of File) => -1�� �ǹ���
		FileInputStream fis = new FileInputStream(f1);
		int i;
		while((i = fis.read()) !=-1) {	//������ �о ������ ���� �ƴϸ�
			System.out.println((char) i);	//�о ���. �� ��ȯ �� �ϸ� �ƽ�Ű �ڵ� ����. �����ڵ�(�ѱ�, Ư������) �ν� �Ұ�
		}
		
		/*
		try {
			fis.close();//������ �ݵ�� close() �ؾ�
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
	}

}
