package prac3;

import java.util.ArrayList;
import java.util.List;

public class BoardExam {

	public static void main(String[] args) {
		//리스트 작성 명령어(Scanner같은 거임 외워)
		List<Board> boardList = new ArrayList<Board>();	//ctrl shift o
		
		for(int i=1;i<=6;i++) {
			Board board = new Board(i, "글제목"+i, "작성자"+i, "글내용"+i, "2024-02-28"+i, 0);	//Board 생성. Board에서 모든 내용 생성자 생성했던 것 이용
			boardList.add(board);	//한 줄 생성하고, 리스트에 담고 작업 반복
		}
		
		System.out.println("번호\t제목\t작성자\t작성일");	//이렇게 출력하자
		for(Board board : boardList) {	//리스트에 담긴 데이터 한 줄 한 줄 꺼내 오기
			System.out.println(board.getBno()+"\t"+board.getTitle()+"\t"+board.getUname()+"\t"+board.getResdate());
		}
	}

}
