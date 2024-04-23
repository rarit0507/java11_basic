package sec1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//���ڿ� �������� ��� Writer�� Reader ���� �� ����
public class FileWriterExam {

	public static void main(String[] args) throws IOException {
		File file = new File("e.txt");
		if(!file.exists()) {	//������ �������� ������
			file.createNewFile();
		}
		BufferedWriter fw = new BufferedWriter(new FileWriter(file, true)); 	//true : ����&�б� ���� ǥ���ؾ�
		fw.write("������ʹٰ��������ݾ�");
		fw.newLine();//�ٹٲ�
		fw.write("�������޶��~~~~~~~~~~~");
		fw.newLine();
		fw.write("������");	//������� ���� �޸𸮿��� �� ��.
		fw.flush(); 	//Buffer�� �ִ� ���� ���� ����
		fw.close();		//�� ���� ���� �ݾƾ�
	}

}
