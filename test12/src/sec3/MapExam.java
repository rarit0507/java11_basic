package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
//Map : HashMap, Hashtable, TreeMap, Properties
//=> 키와 값 분리 시에는 entry 또는 element 단위로 Iteration(entry 분리)이나 Enumeration(element 분=>Properties) 필요.
public class MapExam {

	public static void main(String[] args) {
		//Map은 List처럼 index가 존재하는 것이 아니라 key가 존재한다.
		//순서 유지가 되지 않는다.
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable<>();
		Map<Integer, String> map3 = new TreeMap<>();
		Properties map4 = new Properties();	//속성 저장 시 편함
		
		//HashMap====================================================================================================================================
		map1.put("kim", 90);	//=add. 추가
		map1.put("lee", 100);
		map1.put("park", 80);
		map1.put("kim", 100);
		map1.put("kwon", 90);
		System.out.println(map1);	//★★★JASON 출력방식★★★ : 최종 출력 방식 중요!
		System.out.println("park : "+map1.get("park")); 	//개별요소 접근시 인덱스가 아니라 키 입력
		
		//HashMap 맵 순회(하나만 알면 됨)
		//맵 순회1 : Iterator(분리자)에 의한 접근 (keyset에 따라 분리, 가장 전통적)
		System.out.println("Iterator에 의한 순회");
		Iterator<String> keys = map1.keySet().iterator();	//맵의 키모음(keyset)이 하나의
			//keyset : kimleeparkkangkwon -> iterator : kim,lee,park,kang,kwon
			//=>keys = {kim,lee,park,kang,kwon}
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + "=" + map1.get(key)); 	//= map1.get("kim"), map1.get("lee")...
		}
		System.out.println();
		
		
		//맵 순회2 : entrySet(키와 값의 쌍)에 의한 접근
		System.out.println("entrySet에 의한 순회");
		for(Map.Entry<String, Integer> entry : map1.entrySet()) {	//Map.Entry<String, Integer> en : <T, V> 한 쌍 나타냄. entrySet:  전체 쌍
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+ " : "+ value);
		}
		System.out.println();
		
		
		//맵 순회3 : keySet에 의한 접근
		System.out.println("keySet에 의한 순회");
		for(String key : map1.keySet()) {
			System.out.println(key + " : " +map1.get(key));
		}
		System.out.println();

		if(map1.containsKey("kang")) {
			System.out.println("kang : "+map1.get("kang"));
	} else {
		System.out.println("키가 kang인 요소는 존재하지 않습니다.");
	}
	
	if(map1.containsValue(100)) {
		System.out.println("100점 만점자가 존재합니다.");
	} else {
		System.out.println("100점 만점자가 없습니다.");
	}
	
	
	
	//Hashtable============================================================================================================================
	map2.put("김", "1코스");	//키key 는 중복될 수 없음
	map2.put("이", "2코스");
	map2.put("박", "3코스");
	map2.put("김", "4코스");
	map2.put("이", "5코스");
	map2.put("최", "6코스");
	System.out.println(map2);//출력: 중괄호, key, value 번갈아 출력됨.
	map2.remove("김");
	System.out.println("******* 편집 후 ********");
	System.out.println(map2);
	map2.clear();
	System.out.println("******* 비우기 후 ********");
	System.out.println(map2);
	System.out.println();
	
	//TreeMap==============================================================================================================================
	//배열의 값을 TreeMap에 대입
	String[] names = {"키아누리브스","앤드류가필드","라이언레이놀즈","톰크루즈","마고로비","김고은","최민식","유해진","김기태","김민아"};	//배열
	for(int i=0;i<=9;i++) {
		map3.put(i, names[i]);	//앞은 key, 뒤는 value
	}
	
	
	System.out.println("인원수 : "+map3.size());
	//순회
	for(Integer i : map3.keySet()) {
		int key = i;
		String value = map3.get(key);	//=get.(i);
		System.out.println(key + " : " +value);
	}
	System.out.println();
	
	//Properties============================================================================================================================
	//Properties의 키(필드이름)와 값은 모두 문자열로 취급된다. 숫자도 문자열로 저장해야
	//Properties는 요소의 추가를 setProperty, 반환을 getProperty로
	map4.setProperty("name", "키아누리브스");
	map4.setProperty("age", "50");
	map4.setProperty("height", "188");
	map4.setProperty("kor", "50");
	map4.setProperty("eng", "100");
	map4.setProperty("mat", "80");
	System.out.println("이름 : "+map4.getProperty("name"));
	System.out.println("나이 : "+map4.getProperty("age"));
	System.out.println("키 : "+map4.getProperty("height"));
	System.out.println("국어 : "+map4.getProperty("kor"));
	//얘도 순회 가능
	
	
	}

}
