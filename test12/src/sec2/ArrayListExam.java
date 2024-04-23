package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<Member> memList = new ArrayList<Member>();
		List<Member> memList2 = new ArrayList<Member>();
		
		for(int i=1;i<=10;i++) {	//10명의 회원 생성(반복 자동 생성)
			Member mem = new Member(i, "kim"+i, "abcd"+i+i, "김"+i, 0);
			memList.add(mem);
		}
		//직접생성
		Member mem2 = new Member(11, "lee", "abcd1004", "이성하", 0);
		memList.add(mem2);
		
		for(Member m : memList) {	//List 순회1
			System.out.println(m.toString());
		}
		
		memList.remove(3);	//인덱스가 3인 Member 인스턴스 제거
		
		Member tmp1 = new Member(11, "lee", "abcd1004", "이성하", 0);
		System.out.println(tmp1.getId()+"의 존재 유무 : "+memList.contains(tmp1));	//contains() : 인스턴스가 있나 없나 알아보기
		
		for(int i=0; i<memList.size(); i++) {	//List 순회2
			Member m = memList.get(i);	//특정 정보 접근 by get으로
			System.out.println(m.toString());
		}
		
		if(memList.isEmpty()) {
			System.out.println("비어있는 리스트입니다.");
		} else {
			System.out.println("내용이 있는 리스트입니다.");
		}
		
		List<String> names = new ArrayList<>();
		names.add("이민규");
		names.add("이성하");
		names.add("이연정");
		names.add("이예린");
		names.add("이원석");
		names.add("이종우");
		names.add("이희훈");
		names.set(2, "박범수");
		if(names.contains("이연정")) {
			System.out.println("이연정 데이터가 존재합니다.");
		} else {
			System.out.println("이연정 데이터가 존재하지 않습니다.");
			names.add("이연정");
		}
		for(String s:names) {
			System.out.println(s);
		}
		
		names.clear();	//데이터 싹 비우기
		if(names.isEmpty()) {	//출력 시 null 체크는 필수!
			System.out.println("리스트가 비어 있습니다.");
		} else {
			for(String s:names) {
				System.out.println(s);
			}
		}
		//매우 자주 쓰는 메소드 : 
		//add, remove, contains, isEmpty, size, get(특정 인덱스 정보 가져오기)
	}
}
