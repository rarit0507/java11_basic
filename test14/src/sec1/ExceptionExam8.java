package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//중첩 예외 처리 : try~catch 문장 안에 try~catch가 이중으로 기재되는 경우
//주의사항 : 예외 처리 객체(인스턴스)명은 외부 try~catch와 내부 try~catch간 서로 달라야한다.
public class ExceptionExam8 {

	public static void main(String[] args) {
		FileInputStream fis = null;		//파일입력(내용읽기)
		FileOutputStream ois = null;	//파일 출력(내용저장)
		
		try {
			fis = new FileInputStream("indata.txt"); //이 파일이 있을지 없을지 모름
			try {
					ois = new FileOutputStream("outdata.txt");
			} catch(FileNotFoundException e1 ) {	//오류 이름 e로 같을 수 없음. 다르게 정의해줘야
				System.out.println("ois의 해당 파일을 찾을 수 없습니다.");
			}
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("원인불명");
			e.printStackTrace();
		} finally {
			System.out.println("파일 처리 종료");
		}
	}

}
