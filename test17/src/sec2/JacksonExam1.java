package sec2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class User {
	private String name;
	private int age;
	public User() {}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}

public class JacksonExam1 {	//객체의 타입 형 변한
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		//웹 출력 원리가 이렇다
		User user = new User("Keanu Reeves",50);
		try {
			//객체를 JSON 타입의 파일로 변환
			mapper.writeValue(new File("member.jason"), user);	//test17에 파일만들기 -> //원래 출력 : User:{"name":"Keanu Reeves", "age": 50}
			//객체를 JSON 타입의 String으로 변환
			String jsonUser = mapper.writeValueAsString(user);
			System.out.println(jsonUser);	//원래 출력 : "User:{'name':'Keanu Reeves', 'age': 50}"
			
		} catch(JsonGenerationException e) {
			System.out.println("JSON 변환 실패");
		}
	
	}

}
