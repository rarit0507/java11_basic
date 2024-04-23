package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//String 타입의 List Stream방식 활용
//stream.메소드();
public class StreamExam2 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("Keanu Reeves");
		lst.add("Andrew Garfield");
		lst.add("Ryan Renolds");
		lst.add("Rian Calix");
		lst.add("Alice");
		lst.add("Kain");
		
		//ArrayList(세로로 나열)의 Stream(가로로 연속)화
		Stream<String> stream = lst.stream();	//정적 메소드? ArrayList를 일렬로 만듦
		//순회
		System.out.println("정렬 전");
		stream.forEach(s -> System.out.println(s));
		/* = 
		 for(String t:lst) {
		 	System.out.println(t);
		}
		 */
		System.out.println("\n정렬 후");
		lst.stream().sorted().forEach(s -> System.out.println(s));	//순서대로 나옴
		
		//요소의 수 계산하여 출력
		int cnt = (int) lst.parallelStream().count();
		System.out.println("인원수 : "+cnt);
	}

}
