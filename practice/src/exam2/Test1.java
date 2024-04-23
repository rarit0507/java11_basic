package exam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ipInfoList는 ArrayList(클래스)로 생성해야 하지만, null로 대입하였으므로 ipInfoList에 add.로 요소 추가 불가? 13~15 문장은 NullPointerException이 발생
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>();
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8", "가나다"));	//IPInfo 클래스에는 매개변수 하나만을 전달받는 생성자는 없으므로 객체 생성 불가능하다.
		//방법1) IPInfo 클래스에 매개변수 ip만 받는 생성자를 추가	//방법2) IPInfo 객체 생성시 ip와 user의 매개변수 값을 모두 넣는다.
		ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));
		
		System.out.println("ip 입력 : ");
		String ip = sc.next();
		
		for(int i=0; i<ipInfoList.size(); i++) {
			boolean b = false;
			if(ipInfoList.get(i).getIp().equals(ip)) {	//객체 대 ip(String) 비교 불가. ipInfoList.get(i)는 특정 번째의 IPInfo 클래스의 객체이고, ip는 String 변수이므로, 
			//.getIp()로 ip주소를 가져오고, String 비교를 위해 .equals() 메서드 사용
				System.out.println(ipInfoList.get(i).toString());	//안 써도 되나 toString()이 더 정확
				break;
		/*	} else {	//else문 추가	//일치하는 ip 사용자가 없는 경우의 메시지 출력이 없음
				System.out.println("일치하는 ip 사용자가 없습니다.");
			} */
			}
			if(b!=false) {
				System.out.println("일치하는 ip 사용자가 없습니다.");
			}
		}	
	}

	
}
