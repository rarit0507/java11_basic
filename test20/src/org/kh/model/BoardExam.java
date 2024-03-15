package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Board;

public class BoardExam {

	public static void main(String[] args) {
		List<Board> bList = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			Board b = new Board(i+1, "제목"+i, "내용 : 집보내줘"+i, "작성자 : User"+i, "작성일 : 2024-03-"+(i+1),i);
			bList.add(b);
		}
		for(Board b : bList) {
			System.out.println(b.toString());
		}
	}
}
