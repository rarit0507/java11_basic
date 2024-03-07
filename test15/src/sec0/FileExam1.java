package sec0;
//파일 첨부
import java.io.File;
import java.io.IOException;

public class FileExam1 {
	public static void main(String[] args) throws IOException {
		String file1 = "d:\\yrl\\java\\a.txt";	//로컬 경로(역슬래시)
		String file2 = "http://192.168.1.104/data/manual/java.txt";	//원격통로(웹. url. 슬래시)
		
		File f1 = new File(file1);	//파일 불러오기(생성) : 파일은 예외 처리가 필요하다 shifh ctrl o - java.io
		
		String fileName = f1.getName();	//이름출력(경로제외)
		System.out.println(fileName);
		int pos = fileName.lastIndexOf(".");	//확장자 떼기 위해 기준점인 마지막 .의 인덱스 찾기
		System.out.println("확장자와 파일명의 구분을 나타내는 점(pos)의 위치 : "+pos);
		System.out.println("확장자를 제외한 파일의 이름 : "+fileName.substring(0,pos));	//substring: 인덱스 0인 숫자부터 pos인 숫자까지 출력
		System.out.println("확장자 : "+fileName.substring(pos+1)); 	//뒤에 거 생략하면 끝까지
		
		System.out.println("경로를 포함한 파일의 이름(절대경로) : "+f1.getAbsolutePath());
		System.out.println("경로를 포함한 파일의 이름(상대경로) : "+f1.getPath());	//기재한 값을 그대로 출력
		System.out.println("파일이 속해 있는 상위(부모) 디렉토리 : "+f1.getParent());
		System.out.println("경로 구분자 : "+File.separator);	//상수. 인스턴스(f1) 말고 클래스(File) 이용해서 출력 (=File.pathSeparator)
		//시스템 변수 출력 => System.getProperty("시스템 변수명")
		System.out.println("현재 사용자 디렉토리(user.dir) : "+System.getProperty("user.dir"));	//D:\yrl\java\test15
		System.out.println("자바 디렉토리(sun.boot.class.path) : "+System.getProperty("sun.boot.class.path"));	//얜 지금 zulu라서 안 나옴...
		System.out.println("운영체제(OS) 환경변수 값 : "+System.getenv());	//기울임꼴: 메소드가 static임. 내용 안 쓰면 죄다 알려줌
		System.out.println("JAVA_HOME : "+System.getenv("JAVA_HOME"));	//JAVA_HOME이 어딘지 알려줌
	}

}
