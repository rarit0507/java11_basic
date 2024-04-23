package sec1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//문자열 데이터의 경우 Writer나 Reader 쓰는 게 좋음
public class FileWriterExam {

	public static void main(String[] args) throws IOException {
		File file = new File("e.txt");
		if(!file.exists()) {	//파일이 존재하지 않으면
			file.createNewFile();
		}
		BufferedWriter fw = new BufferedWriter(new FileWriter(file, true)); 	//true : 쓰기&읽기 가능 표기해야
		fw.write("집가고싶다고내가말했잖아");
		fw.newLine();//줄바꿈
		fw.write("집보내달라고~~~~~~~~~~~");
		fw.newLine();
		fw.write("집좀요");	//여기까지 버퍼 메모리에만 들어간 것.
		fw.flush(); 	//Buffer에 있는 내용 실제 적용
		fw.close();		//다 쓰고 파일 닫아야
	}

}
