package sec0;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//���ϰ� ���丮 ����
public class FileExam3 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("student");
		f1.mkdir();	//���� ���丮(test15)�� student ���� �����
		
		File f2 = new File("manage/teacher/kt");	//test15 �ȿ� manage���丮 �ȿ� teacher �ȿ� kt
		f2.mkdirs();
		
		//���丮 ���� ��¥�� �ð� �����ϱ�
		f1.setLastModified(new Date().getTime()); 	//ctrl shift o - util / ���� �ð�
		
		//���丮 �б� �������� ��ȯ(���� ���� �� �ǰ�)
		f1.setReadOnly();	//���� ��Ŭ - �Ӽ����� Ȯ�ΰ���(������ �ý��� ����� �ƴ϶� �ڹ� ����̶� �� ��)
	}
}

