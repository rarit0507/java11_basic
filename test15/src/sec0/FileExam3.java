package sec0;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//파일과 디렉토리 제어
public class FileExam3 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("student");
		f1.mkdir();	//현재 디렉토리(test15)에 student 파일 만들기
		
		File f2 = new File("manage/teacher/kt");	//test15 안에 manage디렉토리 안에 teacher 안에 kt
		f2.mkdirs();
		
		//디렉토리 생성 날짜와 시간 변경하기
		f1.setLastModified(new Date().getTime()); 	//ctrl shift o - util / 현재 시간
		
		//디렉토리 읽기 전용으로 변환(파일 삽입 안 되게)
		f1.setReadOnly();	//파일 우클 - 속성에서 확인가능(지금은 시스템 명령이 아니라 자바 명령이라 안 됨)
	}
}

