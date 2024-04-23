package sec5;
//Queue : FIFO(First in First Out)구조 => 태스크(작업) 순서의 스케줄링. 순서대로 넣고 순서대로 나옴
//Stack: LIFO(Last In Forst A\Out)구조 => 최근 작업 목록
public class BookShelfExam {

	public static void main(String[] args) {
		Queue que = new BookShelf();	//선언은 왜 부모로 하지? => 메소드를 쓰고 싶어서(저장소를 쓰고 싶었으면 Shelf)로 해야
		que.enQueue("관악산 등산 경로");
		que.enQueue("경복궁 안내");
		que.enQueue("숭례문 명동 둘러보기");		
		
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());	//입력한 순서대로 내뱉음
		System.out.println(que.deQueue());	//error(Underflow)
	}

}
