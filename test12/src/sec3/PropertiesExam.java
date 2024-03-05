package sec3;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) {
		//Properties 선언 및 생성
		Properties pro = new Properties();
		
		//값 입력
		pro.setProperty("job","actor");	//"job" element	(entry : T, V)
		pro.setProperty("name","Keanu Reeves");
		pro.setProperty("age","50");
		pro.setProperty("local","America");
		
		System.out.println(pro); 	//Jason 방식으로 출력됨{}
		
		System.out.println("엘리먼트 수 : "+pro.size());
		
		//개별접근
		System.out.println("pro의 name 엘리먼트 값 : "+pro.getProperty("name"));
		
		//Properties의 순회 => 열거형으로 해당 엘리먼트의 키(속성)를 가져와 처리해야 함.
		//for(String s:pro) {	//에러
		Enumeration e = pro.propertyNames();	//==keySet과 마찬가지
		while(e.hasMoreElements()) {
			String el = (String) e.nextElement();
			System.out.println(el+":"+pro.getProperty(el));
		}
		
	}

}
