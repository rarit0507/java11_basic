package sec2;

import java.io.IOException;

public class SystemInExam1 {

	public static void main(String[] args) throws IOException {
		System.out.println("영문 한 글자를 입력하고, [Enter]를 누르세요");
		int i;
		try {
			i = System.in.read();	//아스키코드 한 글자 입력 => 바이트 단위 입력(스캐너-문자열같은 거)
			System.out.println(i);
			System.out.println("입력된 문자 : "+(char) i);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
