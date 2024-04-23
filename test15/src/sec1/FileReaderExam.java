package sec1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//BufferedReader, FileReader : ����(��) ������ �б�
public class FileReaderExam {
	public static void main(String[] args) throws IOException {
		File file = new File("d.txt");
		if(file.exists()) {
			BufferedReader fr = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = fr.readLine()) != null) {
				System.out.println(line);
			}
			fr.close();
		}
	}
}