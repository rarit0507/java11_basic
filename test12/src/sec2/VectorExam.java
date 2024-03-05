package sec2;

import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		List<Notice> nVector = new Vector<>();
		
		//글쓰기
		nVector.add(new Notice("제목1", "내용1", "키아누리브스"));
		nVector.add(new Notice("제목2", "내용2", "집보내줘"));
		nVector.add(new Notice("제목3", "내용3", "앤드류가필드"));
		nVector.add(new Notice("제목4", "내용4", "라이언레이놀즈"));
		nVector.add(new Notice("제목5", "내용5", "루이스"));
		nVector.add(new Notice("제목6", "내용6", "트리비아"));
		
		//글 목록
		System.out.println("제목\t내용\t작성자");
		for(Notice n : nVector) {
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		
		nVector.remove(2);	//인덱스 2인 인스턴스 제거 -> 글 제거
		Notice no = new Notice("제목", "내용", "유정환");
		nVector.set(3, no);	//인스턴스를 인덱스가 3인 위치에 삽입
		System.out.println("\n편집 후 \n");
		System.out.println("제목\t내용\t작성자");
		for(int i=0;i<nVector.size();i++) {
			Notice n = nVector.get(i);
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		//ArrayList는 내용이 없는 인스턴스의 메모리가 그대로 차지되고 있으나 Vector는 내용이 없으면 메모리에서 자동 제거됨(몰라도됨)
	}

}
