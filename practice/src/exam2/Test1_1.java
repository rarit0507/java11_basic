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
		
		for(int i=0; i<ipInfoList.size(); i++) {
			//if(ipInfoList.get(i) == ip)
			if(ipInfoList.get(i).getIp().equals(ip)) { 	//ip끼리 비교해야 하므로 ipInfoList.get(i)에 대해 .getIp() 사용. 문자열 비교는 .equals()
				System.out.println(ipInfoList.get(i).toString());
				break;
			} else {	//else문 추가, 아래 있던 sysout을 여기에 써야 함
				System.out.println("일치하는 ip 사용자가 없습니다.");
			}
		}
	}
}
