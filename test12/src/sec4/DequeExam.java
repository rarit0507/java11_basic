package sec4;

import java.util.Deque;
import java.util.LinkedList;

//Deque : LIFO와 FIFO가 모두 가능한 구조
//-> 스택과 큐의 혼합 구조, 양쪽에서 입력/출력이 모두 가능
public class DequeExam {
	//생성 시 LinkedList 사용
	public static void main(String[] args) {
		Deque<String> d = new LinkedList<>();
		
		//추가
		d.addFirst("나는 전설이다");
		d.addFirst("미스트");
		d.addLast("헝거게임");
		d.addFirst("더 배트맨");
		d.addLast("조커");
		d.addLast("미드소마");
		
		System.out.println(d);
		System.out.println(d.peek()); 	//Queue처럼 동작
		System.out.println(d.peekLast());	//Stack처럼 동작
		System.out.println(d.peekFirst());	//Queue처럼 동작
		
		System.out.println(d.poll()); 	//큐처럼 동작하여 맨 처음 요소 반환 후 제거
		System.out.println(d.pollLast());	//스택처럼 동작하여 맨 마지막 요소 반환 후 제거	//제어점이 맨 마지막
		System.out.println(d.pollFirst());	//제어점이 맨 처음
		System.out.println(d);
		System.out.println();
		System.out.println(d.pop());	//스택처럼 맨 마지막 요소 반환 후 제거
		System.out.println(d);
		
	}

}
