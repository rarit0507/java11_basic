package sec1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//p.225(책은 파일 객체 안 씀)
//FileInputStream : 바이트 스트림 단위로 파일의 내용을 읽으려고 할 경우 활용.
//바이트 단위이므로 char로 변환하여 읽어야 함.
//유니코드(한글, 전각문자) 등은 읽어낼 수 없다.
public class FileInputStreamExam {
	public static void main(String[] args) throws IOException {
		File f1 = new File("a.txt");
		
		//EOF(End Of File) => -1을 의미함
		FileInputStream fis = new FileInputStream(f1);
		int i;
		while((i = fis.read()) !=-1) {	//파일을 읽어서 파일의 끝이 아니면
			System.out.println((char) i);	//읽어서 출력. 형 변환 안 하면 아스키 코드 나옴. 유니코드(한글, 특수문자) 인식 불가
		}
		
		/*
		try {
			fis.close();//파일은 반드시 close() 해야
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
	}

}
