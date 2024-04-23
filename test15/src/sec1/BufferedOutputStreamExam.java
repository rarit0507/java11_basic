package sec1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//BufferedOutputStream : ����Ʈ ����
public class BufferedOutputStreamExam {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream output = null;
		String str = "Hello, Stream";
		
		try {
			output = new BufferedOutputStream(new FileOutputStream("c.txt"));
			output.write(str.getBytes()); 	//str �����͸� ����Ʈ ������ ������ �Է�
		} catch(Exception e) {
			System.out.println("����� ������ ���� ����");
		} finally {
			if(output != null) {
				try {
					output.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
