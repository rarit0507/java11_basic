package sec0;
//���� ÷��
import java.io.File;
import java.io.IOException;

public class FileExam1 {
	public static void main(String[] args) throws IOException {
		String file1 = "d:\\yrl\\java\\a.txt";	//���� ���(��������)
		String file2 = "http://192.168.1.104/data/manual/java.txt";	//�������(��. url. ������)
		
		File f1 = new File(file1);	//���� �ҷ�����(����) : ������ ���� ó���� �ʿ��ϴ� shifh ctrl o - java.io
		
		String fileName = f1.getName();	//�̸����(�������)
		System.out.println(fileName);
		int pos = fileName.lastIndexOf(".");	//Ȯ���� ���� ���� �������� ������ .�� �ε��� ã��
		System.out.println("Ȯ���ڿ� ���ϸ��� ������ ��Ÿ���� ��(pos)�� ��ġ : "+pos);
		System.out.println("Ȯ���ڸ� ������ ������ �̸� : "+fileName.substring(0,pos));	//substring: �ε��� 0�� ���ں��� pos�� ���ڱ��� ���
		System.out.println("Ȯ���� : "+fileName.substring(pos+1)); 	//�ڿ� �� �����ϸ� ������
		
		System.out.println("��θ� ������ ������ �̸�(������) : "+f1.getAbsolutePath());
		System.out.println("��θ� ������ ������ �̸�(�����) : "+f1.getPath());	//������ ���� �״�� ���
		System.out.println("������ ���� �ִ� ����(�θ�) ���丮 : "+f1.getParent());
		System.out.println("��� ������ : "+File.separator);	//���. �ν��Ͻ�(f1) ���� Ŭ����(File) �̿��ؼ� ��� (=File.pathSeparator)
		//�ý��� ���� ��� => System.getProperty("�ý��� ������")
		System.out.println("���� ����� ���丮(user.dir) : "+System.getProperty("user.dir"));	//D:\yrl\java\test15
		System.out.println("�ڹ� ���丮(sun.boot.class.path) : "+System.getProperty("sun.boot.class.path"));	//�� ���� zulu�� �� ����...
		System.out.println("�ü��(OS) ȯ�溯�� �� : "+System.getenv());	//����Ӳ�: �޼ҵ尡 static��. ���� �� ���� �˴� �˷���
		System.out.println("JAVA_HOME : "+System.getenv("JAVA_HOME"));	//JAVA_HOME�� ����� �˷���
	}

}
