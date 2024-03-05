package sec4;

import java.util.Stack;

//Stack(스택) : 탑같이 입력할 때는 쌓아 올려지고, 출력 시에는 반대로 맨 마지막에 입력한 가장 위의 값부터 출력
//LIFO(Last In First Out) - 후입선출
//Queue(큐) : 선입선출
public class StackExam {
	public static void main(String[] args) {
		//Stack에 데이터 입력 push(), 출력 : pop(), 조회 : peek()(맨 위)
		Stack<String> stack = new Stack();
		
		//요소 추가
		stack.push("사과");
		stack.push("파인애플");
		stack.push("샤인머스캣");
		stack.push("수박");
		stack.push("멜론");
		stack.push("체리");
		stack.push("암라");
		stack.push("불수감");
		
		//한꺼번에 출력
		System.out.println(stack);
		
		System.out.println(stack.peek());	//맨 위에(마지막)거. 반환만
		System.out.println(stack.peek());
		System.out.println(stack.pop());	//하나씩 꺼내기. 반환 후 제거됨
		System.out.println(stack.pop());
		System.out.println(stack);

	}

}
