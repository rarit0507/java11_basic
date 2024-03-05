package sec3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		//TreeMap 선언 및 객체 생성
		//Map map0 = new Map();	//Map은 인터페이스. 생성하기 위해서는 구현해야
		Map map0 = new TreeMap<>();
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		TreeMap<Integer, String> map2 = new TreeMap<>();
		TreeMap<Integer, String> map3 = new TreeMap<>(map1);
		TreeMap<Integer, String> map4 = new TreeMap<>() {{
			put(1, "키아누리브스");
		}};
		
		map2.put(1, "키아누리브스");	//요소(Entry) 추가
		map2.put(2, "앤드류가필드");
		map2.put(3, "라이언레이놀즈");
		map2.put(4, "톰크루즈");
		map2.put(5, "조 바이든");
		
		map2.remove(4);	//키가 4인 요소를(특정 요소) 제거
		
		//map2.clear();	//TreeMap 비우기
		
		//TreeMap 순회하여 출력
		for(Integer i : map2.keySet()) {
			System.out.println(i+" : "+map2.get(i));
		}
		
		System.out.println("map2 : "+map2);
		System.out.println("map2에서 key가 5인 요소 : "+map2.get(5));
		System.out.println("map2에서 맨 처음 엔트리 : "+map2.firstEntry());
		System.out.println("map2에서 맨 마지막 엔트리 : "+map2.lastEntry());
		System.out.println("map2에서 맨 처음 key : "+map2.firstKey());
		System.out.println("map2에서 맨 마지막 key : "+map2.lastKey());
	}

}
