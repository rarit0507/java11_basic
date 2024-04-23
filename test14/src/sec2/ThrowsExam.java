package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExam {
//예외 떠넘기기(여러 개로 떠넘길 수 있음, 세부적인 예외부터 작성 //마우스 얹고 add~~ 메소드 옆에 생김)
	public static void main(String[] args) throws FileNotFoundException, IOException {	//예외가 발생하면 IOException의 예외로 떠넘기기
		FileInputStream fis = null;
		String absolutePath = "d:\\yrl\\java\\\\bin\\sec2\\a.txt";	//경로 다 지정 : 절대경로 / bin: 실행, 작동 위치
		String relativePath = "./a.txt";	//상대경로 -> 현재 디렉토리
		String relativePath2 = "../a.txt";	//상대경로 -> 상위디렉토리
		String relativePath3 = "../../a.txt";	//상대경로 -> 상위디렉토리 2번(txt의 윗윗 디렉토리(bin))
		fis = new FileInputStream(absolutePath);
		if(fis!=null) {
			fis.close();
		}
	}

}
