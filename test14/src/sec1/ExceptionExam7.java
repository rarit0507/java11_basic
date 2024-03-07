package sec1;
//FileNotFoundException : 해당 경로에 파일이 존재하지 않는 경우 발생하는 예외
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//
public class ExceptionExam7 {
	public static void main(String[] args) {
		FileInputStream fis = null;		//파일입력(=가져오기, 내용읽기)
		FileOutputStream ois = null;	//파일 출력(내용저장)
		
		try {
			fis = new FileInputStream("indata.txt"); //이 파일이 있을지 없을지 모름
			ois = new FileOutputStream("outdata.txt");
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
