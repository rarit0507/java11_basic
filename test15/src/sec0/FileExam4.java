package sec0;

import java.io.File;
import java.io.IOException;

//파일 생성
public class FileExam4 {
	public static void main(String[] args) throws IOException {
		File file1 = new File("a.txt");
		File file2 = new File("b.txt");
		
		if(file1.createNewFile()) {
			System.out.println("File1 Created Success");
		} else {
			System.out.println("File1 already exists");	//test15에 이미 있음
		}
		
		if(file2.createNewFile()) {
			System.out.println("File2 Created Success");	//test15에 없어서 새로 만듦
		} else {
			System.out.println("File2 already exists");
		}
	}

}
