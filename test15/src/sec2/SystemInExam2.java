package sec2;

import java.io.IOException;
//����Ʈ �ݺ��Ͽ� �ܾ� ���
public class SystemInExam2 {
	public static void main(String[] args) throws IOException {
		System.out.println("���� �ܾ� �Ǵ� ������ �Է��ϰ�, [Enter]�� ��������");
		int i;
		String data = "";
		
		try {
			while((i = System.in.read()) != '\n') {//�ƽ�Ű�ڵ� �� ���� �Է� => ����Ʈ ���� �Է�(��ĳ��-���ڿ����� ��)
			System.out.println((char) i);
			data += (char)i;
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("�Էµ� �ܾ� �Ǵ� ���� : "+data);
		
	}
}
