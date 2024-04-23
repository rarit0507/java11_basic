package sec1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
//����ȭ : Serialization(Serialize)
//BufferedInputStream : ����Ʈ ����
public class BuffuredInputStreamExam {
	public static void main(String[] args) throws IOException {
		
		BufferedInputStream input = null;
		try {
			input = new	BufferedInputStream(new FileInputStream("a.txt"));	//�޸� �о�;�
			while(input.available()>0) {	//���ۿ� �� �ֳ�(��� �����ϳ�) : ���O ����X
				System.out.println((char) input.read());	//����Ʈ ���� ���: ����. char�� �� ��ȯ �ʿ�
			}
		} catch(Exception e) {
			System.out.println("���� �б� ����");
		} finally {
			if(input != null) {
				try {
					input.close();	//AutoClosing(1.7�̻�) �� �Ǹ� ���� �ݾ����
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
