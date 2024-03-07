package sec1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
//직렬화 : Serialization(Serialize)
//BufferedInputStream : 바이트 단위
public class BuffuredInputStreamExam {
	public static void main(String[] args) throws IOException {
		
		BufferedInputStream input = null;
		try {
			input = new	BufferedInputStream(new FileInputStream("a.txt"));	//메모리 읽어와야
			while(input.available()>0) {	//버퍼에 값 있냐(사용 가능하냐) : 양수O 음수X
				System.out.println((char) input.read());	//바이트 단위 출력: 숫자. char로 형 변환 필요
			}
		} catch(Exception e) {
			System.out.println("파일 읽기 실패");
		} finally {
			if(input != null) {
				try {
					input.close();	//AutoClosing(1.7이상) 안 되면 직접 닫아줘야
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
