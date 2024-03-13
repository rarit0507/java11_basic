package exam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//List<IPInfo> ipInfoList = null;
		List<IPInfo> ipInfoList = new ArrayList<>();	//.add는 ArrayList<>()의 기능이므로 ArrayList 선언 필요. null값이 대입되면 add 불가.
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8", "가나다"));	//매개변수 추가(매개변수 1개만 받는 생성자 부재)
		ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));
		
		System.out.println("ip 입력 : ");
		String ip = sc.next();
		
		boolean found = false;	//일치하는 IP를 찾았는지 여부를 확인하기 위한 변수
		
		for(IPInfo ipInfo : ipInfoList) {
			if (ipInfo.getIp().equals(ip)) {
				System.out.println(ipInfo.toString());
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("일치하는 ip 사용자가 없습니다.");
		}
		
	}
}
