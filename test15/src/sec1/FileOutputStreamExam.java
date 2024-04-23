package sec1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream : ������ ������ ����Ʈ ������ ���� ���� Ŭ����
public class FileOutputStreamExam {
	public static void main(String[] args) throws IOException {
		File f1 = new File("b.txt");
		if(f1.createNewFile()) {
			System.out.println("���� ���� ����");
		} else {
			System.out.println("�̹� ������ �����մϴ�.");
		}
		
		String data = "Hello Java";	//�� �� �ٲٸ� �� p.562 Q3.
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(data.getBytes());	//getByte�� String�� Byte ������ �迭�� ����
		fos.close();	//���� ����ϸ� �ݾ����
	}

}
