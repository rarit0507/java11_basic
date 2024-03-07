package sec1;
//파일/키보드/데이터 입력 : FileInputStream, BufferedInputStream, FileReader, BeffuredReader
//파일/모니터/데이터 출력 : FileOutputStream, BufferedInputStream, FileWriter, BefferedWriter
//Stream으로 끝나는 클래스는 데이터 입출력을 >>>바이트<<< 단위로 : FileInputStream, BufferedInputStream, FileOutputStream, BufferedOutputStream
//Stream으로 끝나지 않는 클래스는 데이터 입출력을 >>>문자<<< 단위로 : FileReader, BeffuredReader, FileWriter, BefferedWriter
public class StreamExam {
	public static void main(String[] args) {
		String fileInputStream = "FileInputStream => 바이트 단위로 입력하기 위한 스트림";
		String bufferedInputStream = "BuffuredInputStream => 바이트 단위로 입력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		String fileReader = "FileReader => 문자 단위로 입력하기 위한 스트림";
		String bufferedReader = "BuffuredReader => 문자 단위로 입력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		String fileIOutputStream = "FileOutputStream => 바이트 단위로 출력하기 위한 스트림";
		String bufferedOutputStream = "BuffuredOutputStream => 바이트 단위로 출력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		String fileWriter = "FileWriter => 문자 단위로 출력하기 위한 스트림";
		String bufferedWriter = "BufferedWriter => 문자 단위로 출력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		
		System.out.println(fileInputStream);
		System.out.println(bufferedInputStream);
		System.out.println(fileReader);
		System.out.println(bufferedReader);
		System.out.println(fileIOutputStream);
		System.out.println(bufferedOutputStream);
		System.out.println(fileWriter);
		System.out.println(bufferedWriter);
	}

}
