package exam2;
//collection framework는 가급적이면 요소를 분리하여 비교해야 함.
//객체 하나하나 비교하려면 주소끼리 비교해야 하는데 그러면 동일한 값이 나올 수 없음(문자열 비교해야 하는데)
import java.util.ArrayList;
import java.util.List;

public class testprac {

	public static void main(String[] args) {
		String names = "김기태 이순신 강감찬 고주몽 부여온조";	//문자열
		
		List<IPInfo> ipList = new ArrayList<>();	//List
		ipList.add(new IPInfo("192.168.0.191", "이성하"));
		ipList.add(new IPInfo("192.168.1.132", "이원석"));
		ipList.add(new IPInfo("192.168.3.24", "김기태"));
		ipList.add(new IPInfo("192.168.1.3", "강감찬"));
		
		
		String str = "강감찬";
		//
		System.out.println("String에서 찾기");
		if(names.contains(str)) {	//하나의 framework. 객체를 비교하게 됨. contains()를 쓸 수 없음(하나의 문장에서 특정 단어 포함여부 찾기. 객체끼리 비교할 때.) 여기는 문자열 비교
			System.out.println(str+"이 포함되어 있습니다.");
		} else {
			System.out.println(str+"이 포함되어 있지 않습니다.");
		}
		//
		System.out.println("\nArrayList에서 찾기");
		
		boolean sw = false;	//
		for(IPInfo i : ipList) {
			if(i.getUser().equals(str)) {
				sw=true;
			//	System.out.println(str+"이 포함되어 있습니다.");
			//} else {
			//	System.out.println(str+"이 포함되어 있지 않습니다.");
			}
		}
		if(sw) {
			System.out.println(str+"이 포함되어 있습니다.");
		} else {
			System.out.println(str+"이 포함되어 있지 않습니다.");
		}
	}

}
