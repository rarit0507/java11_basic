package sec1;

class Point<T, V> {	//좌표점 제네릭
	T x;	//x축에서의 가로 위치
	V y;	//y축에서의 세로 위치
	//public Point() {}
	public Point(T x, V y) {
		super();
		this.x = x;
		this.y = y;
	}
	//생성자 있으니까 setter, 디폴트생성자 굳이 필요X
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
	
}

public class GenericExam4 {
	
	//제네릭 메소드 : 해당 클래스의 메소드로 반환타입에 관계없이 활용할 수 있는 메소드(어떤 값이든 가능)
	//public [static] <인자1, 인자2> 반환타입 메소드명(매개변수타입 매개변수,...) {}
	//static은 메인 함수 있을 때 사용. 없으면 생략해도
	public static<T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number) p1.getX()).doubleValue();
		double right = ((Number) p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();
		
		double width = right - left;	//가로길이
		double height = bottom - top;	//세로길이
		
		return width*height;	//넓이
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<>(0,0.0);	//상단점(좌측상단)
		Point<Integer, Double> p2 = new Point<>(20,20.0);	//하단점(우측하단)
		
		double area = makeRectangle(p1, p2);	//위에 작성한 메소드 출력
		System.out.println("사각형의 면적 : "+area);
	}

}
