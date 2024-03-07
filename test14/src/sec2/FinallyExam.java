package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyExam {

	public static void main(String[] args) {
		FileInputStream fis = null;	//입력 가능한 파일을 하나 열 수 있음(null=오류상태(없음))
		FileOutputStream ois = null;
		//finally: 예외사항이 try 되어 성공 수행하든, exception되어 실패 수행하든 반드시 처리해야 하는 문장
		
		try {
			fis = new FileInputStream("a.txt");	//파일명 기입
		} catch(FileNotFoundException e1) {	//파일없음 오류
			System.out.println(e1);
		} finally {
			if(fis!=null) {	//파일 없으면
				try {
					fis.close();	//닫아라(빨간줄-이중try-catch 필요)
				} catch (IOException e1) {	//입출력 오류
					e1.printStackTrace();
				}
			}
			System.out.println("성공이든 실패든 항상 수행");
		}
		
		}
		System.out.println("예외 처리의 다음 문장");
	
	}
}

