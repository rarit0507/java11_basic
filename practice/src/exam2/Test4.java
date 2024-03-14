package exam2;

import com.kh.test4.model.Person;

public class Test4 {
	public static void main(String[] args) {
		
		Person[] pArr = new Person[3];	//선언만 됨
		pArr[0] = new Person("김기태", 43);
		pArr[1] = new Person("집갈래", 50);
		pArr[2] = new Person("배고파", 41);	//비어있거나 초기화 되어 있지 않은 pArr 배열에 Person 객체를 생성하여 각 요소(0~2)에 생성된 객체을 대입
		
		for(int i=0; i< pArr.length; i++) {	//실제 선언한 배열의 개수보다 더 많은 수의 반복실행이 된다.(요청한 횟수가 배열 수보다 많음) => ArrayIndexOutOfBounds Exception 발생
			System.out.println(pArr[i].getName());	//Person의 배열요소인 pArr 객체가 초기화(값 대입)되어 있지 않아 => NullPointerException 발생
		}
	}
}
