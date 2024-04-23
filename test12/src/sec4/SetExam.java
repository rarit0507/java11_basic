package sec4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Set: 값만 저장, 중복 허용X(맵은 값 중복 허용), 순서 유지X
//Set 종류: HashSet, TreeSet
public class SetExam {

	public static void main(String[] args) {
		//Set의 선언 및 생성
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set1.add("키아누리브스");	//요소의 추가
		set1.add("앤드류가필드");
		set1.add("라이언레이놀즈");
		set1.add("톰크루즈");
		set1.add("도날드트럼프");
		set1.add("조바이든");
		set1.add("존윅");
		set1.add("마틴");
		set1.add("제레온");
		set1.add("키아누리브스");	//중복 발생 => 중복 허용X
		
		System.out.println("set1의 요소의 수 : " + set1.size());	//10개 넣었으나 9개로 나옴(중복)
		System.out.println(set1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		if(set1.contains(name)) {
			System.out.println("\n해당 이름이 존재합니다.");
		} else {
			set1.add(name);
			System.out.println("\n"+ name + "이 입력되었습니다.");
		}
		
		set1.remove("마틴");	//set1의 특정 요소 삭제
		//set1.clear();	//set1 비우기
		
		if(set2.isEmpty()) {	//set2가 비어있는지 확인
			System.out.println("set2가 비어 있습니다.");
		} else {
			System.out.println("set2의 요소의 수 : " + set2.size());
		}
		
		Set<Integer> set3 = new TreeSet<Integer>(Arrays.asList(9,3,4,6,8,7,6));
		System.out.println(set3);
		//개별 접근 하나만 하는 건 불가
		
		//Set의 순회1 : 향상된 for문
		System.out.println("\n향상된 for문에 의한 순회");
		for(Integer i : set3) {
			System.out.println(i+"\t");
		}
		
		//Set의 순회2 : Iterator에 의한 순회
		System.out.println("\nIterator에 의한 순회");
		Iterator it = set3.iterator();
		while(it.hasNext()) {
			System.out.printf(it.next()+"\t");
		}
		
		
	}

}
