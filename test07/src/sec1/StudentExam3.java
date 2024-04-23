package sec1;
//★★★★★★★★★매우중요★★★★★★★★★★★
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//ArrayList(배열 리스트) ------> collection framework(후에 배움)
public class StudentExam3 {

	public static void main(String[] args) {
		List<Student> s = new ArrayList<Student>();	//ctrl+shift+o(import) //목록 만들기
		Scanner scn = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			Student st = new Student();	//학생 객체 만들기	//ㄴ돌아와서 st 다시 빈 채로 초기화됨ㄱ
			st.setNo(i+1);;	//번호 부여(private변수-gettersetter) //Ex1에서 사용한 것(배열 아니니 [i] 빼야)
			System.out.print((i+1)+"번째 국어 : ");
			st.setKor(scn.nextInt());	//ㄴ국어값 입력
			System.out.print((i+1)+"번째 영어 : ");
			st.setEng(scn.nextInt()); 
			System.out.print((i+1)+"번째 수학 : ");
			st.setMat(scn.nextInt());
			s.add(st);	//st:(1,90,90,90)(한 줄. 직접입력(Scanner)) / s: 목록(표) => 반복문 안에서 5번 돌아감
		}
		
		//가져오기(개선된 for문)
		for(Student t:s) {	//t:입력된 학생 데이터 하나) / s:목록
			
		}
	}

}
