package org.kh.object1;

public class Memberex1 {

	public static void main(String[] args) {
		
		Member yrl = new Member();
		yrl.setId("rarit0507");					//yrl.id = "rarit0507";
		yrl.setPw("0123456789");				//yrl.pw = "0123456789";
		yrl.setBirth(20010507);					//yrl.birth = 20010507;
		yrl.setEmail("rarit0507@naver.com");	//yrl.email = "rarit0507@naver.com";
		yrl.setTel("010-4928-0875");			//yrl.tel = "010-4928-0875";
		
		System.out.println("id : "+yrl.getId());
		System.out.println("pw : "+yrl.getPw());
		System.out.println(yrl.toString());		//yrl.toString() 자체는 문자열. sysout으로 표시해줘야
		
	}

}
