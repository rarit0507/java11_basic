package sec3;

import java.util.Hashtable;
import java.util.Set;

public class HashtableExam {

	public static void main(String[] args) {
		//Hashtable 객체 생성
		Hashtable<String, Integer> hash = new Hashtable();
		hash.put("서울", 1);
		hash.put("부산", 2);
		hash.put("인천", 3);
		hash.put("대구", 4);
		hash.put("대전", 5);
		hash.put("광주", 6);
		hash.put("울산", 7);
		
		//Hashtable의 요소의 수 출력★
		System.out.println("hash 엔트리 수 : " + hash.size());
		
		//Hashtable에 키가 "광주"인 요소가 존재하는지 비교 
		if(hash.contains("광주")) {
			System.out.println("현재 키가 광주인 요소가 존재합니다.");
		} else {
			System.out.println("현재 키가 광주인 요소가 없습니다.");
		}
		
		//Hashtable의 키만 Set으로 저장한 후 출력
		Set<String> keySet = hash.keySet();
		System.out.println("hash의 키 : " + keySet); 	//해쉬테이블은 배열처럼 대괄호 안에 나옴
		
		//Hashtable에서 키가 "대구"인 요소 제거
		hash.remove("대구");
		
		//Hashtable을 순회하여 모든 엔트리의 키와 값 출력
		for(String s : hash.keySet()) {
			System.out.println(s+" : "+ hash.get(s));
		}
		
		//Hashtable을 비우기
		hash.clear();
	}

}
