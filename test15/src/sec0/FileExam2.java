package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {
	public static void main(String[] args) throws IOException {
		//파일의 상대 경로 지정
		File f1 = new File("a.txt");	//현재 디렉토리에 파일이 있든 없든 파일 객체 생성
		File f2 = new File("../sec1/a.txt"); //상대경로. 현재 패키지(디렉토리)는 sec0인데 상위 디렉토리로 이동한 후 sec1 디렉토리의 a.txt파일 객체를 찾음
		
		//파일의 절대 경로 지정
		File f3 = new File("d:"+File.separator+"yrl"+File.separator+"java"+File.separator+"a.txt");	//절대경로 d:\\yrl\\java\\a.txt. 더 정확
		String path = "d:\\yrl\\java\\";
		File f4 = new File(path, "a.txt");
		File f5 = new File("d:\\yrl\\java\\", "a.txt");
		
		
		if(f1==null) {
			System.out.println("현재 파일이 존재하지 않습니다.");
		} else {
			System.out.println("파일이 존재합니다.");
		}
	}

}
