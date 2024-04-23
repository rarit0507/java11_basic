package sec5;

import java.util.ArrayList;
//일반(구현) 클래스
public class Shelf {
	//ArrayList<String> => "rarit", "kkt", "park", "kim"...
	protected ArrayList<String> shelf;
	public Shelf() {	//기본 생성자
		shelf = new ArrayList<String>();	//기본 생성자니까 생략해도 되긴 함
	}
	//gettersetter -getter만
	public ArrayList<String> getShelf() {
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
	
}
