package sec2;

import java.util.ArrayList;
import java.util.List;

//컬렉션 프레임워크(Collection Framework) : 자바에서 기본적으로 제공하는 여러 데이터를 저장하고 관리하기 위해 미리 준비해둔 자료 구조 틀
//Map, Set, List => 기본은 모두 제네릭 형태이다.
public class CollectionExam1 {

	public static void main(String[] args) {
		//List 인터페이스 : ArrayList, Vector, LinkedList 클래스
		//set 인터페이스 : HashSet, TreeSet 클래스
		//Map 인터페이스 : HashMap, Hashtable, TreeMap, Properties	클래스 //항상 두 개의 값을 지님<T, V>
		//Stack, Queue, Deque 등도 자료구조에 해당하는 컬렉션 프레임워크의 일종이다.
		
		//자료구조인 컬렉션 프레임워크에서 자주 사용하는 메소드
		//add : 해당 컬렉션 프레임워크의 인스턴스 추가
		//clear :  해당 컬렉션 프레임워크의 모든 인스턴스 제거
		//remove :  해당 컬렉션 프레임워크의 특정 인스턴스 제거
		//size : 해당 컬렉션 프레임워크의 인스턴스 개수
		//iterator : 분리자(반복자) 의미
		
		
		//ArrayList<String> lst = new ArrayList<String>(); => ArrayList로밖에 못 씀
		List<String> lst = new ArrayList<String>();	//인터페이스로 인스턴스 생성 후 ArrayList로 변경(=Generic)
		lst.add("김동연");
		lst.add("강범준");
		lst.add("장인범");
		lst.add("이필규");
		for(String s : lst) { 
			System.out.println(s);
		}
		//List<Student>, Map<Board>, Set<Data> : <>로 인자가 규정되므로 제네릭의 일종이다.
		//<> 안에는 어떤 클래스가 들어가도 상관 없음(기본형은 안됨!)
	}

}
