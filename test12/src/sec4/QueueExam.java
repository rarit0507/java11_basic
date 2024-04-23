package sec4;

import java.util.LinkedList;
import java.util.Queue;
//Queue(큐): First In First Out -> 선입선출 : 먼저 입력한 데이터가 먼저 출력되는 자료 구조
//자바에서는 Queue가 인터페이스이므로 같은 구조를 가진 LinkedList를 이용하여 생성
public class QueueExam {

	public static void main(String[] args) {
		//Queue<String> q = new Queue<>();	//오류(인터페이스생성X)
		Queue<String> q = new LinkedList<>();
		
		//큐(Queue)에 요소 추가
		q.offer("Keanu Reeves");
		q.offer("Andrew Garfield");
		q.offer("Ryan Renolds");
		q.offer("Rian Calix");
		q.offer("Alice");
		q.offer("Kain");
		q.offer("Abel");
		
		
		System.out.println(q.peek());	//선입선출 : Keanu Reeves. 맨 처음 데이터 검색 반환
		System.out.println(q.peek());
		System.out.println("\npeek 후의 q : "+q);
		System.out.println(q.poll());	//맨 처음 데이터 반환 후 제거됨
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println("poll 후의 q : "+q);
		
	}

}
