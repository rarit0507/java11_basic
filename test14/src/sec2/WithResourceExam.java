package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class AutoResource implements AutoCloseable {	//AutoCloseable은 열려있는 객체를 전부 닫아주는 인터페이스
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 자동으로 Close 되었습니다.");		//자동 fis.close()대체
	}
}

public class WithResourceExam {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		fis = new FileInputStream("a.txt");	
		
		//try~with~resource : 열린 리소스(파일 포함)는 모두 닫힌다.
		//if(fis!=null ) {
		try(AutoResource obj = new AutoResource()) {
			throw new Exception(); 	//상단에 Exception 떠넘기기 추가(by add)
			//fis.close();
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("예외부분");
		}
	}
}


