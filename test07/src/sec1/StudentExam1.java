package sec1;

import java.util.Scanner;
//5명의 국어, 영어, 수학 점수를 Scanner를 활용하여 키보드로 입력받아 총점, 평균, 학점을 계산하여
//아래와 같은 출력 형태로 출력하도록 하는 프로그램을 작성하시오.
/*
	번호	국어	영어	수학	총점	평균		학점
	1	90	90	90	270	90.0	A
	2	80	70	60	210	70.0	C
	3	90	80	70	240	80.0	B
	4	60	90	70	220	73.3	C
	5	70	90	90	250	93.3	B
 */
public class StudentExam1 {
	//5명의 학생(Student)print 배열 선언하기
	Student[] s = new Student[5];	//학생5명 //s[0].kor, s[0].eng s[0].mat ~ s[4].kor, s[4].eng s[4].mat
	
	public static void main(String[] args) {

	//학생 5명의 >>>배열<<< 객체 선언
	//int[] arr = {1,2,3,4,5,6,7}	//일반배열은 객체 생성할 필요X
	//참조형 배열이기 때문에 개별 객체 생성이 필요하다
	Student[] s = new Student[5];	//선언만 했지 실행은 불가
	Scanner scn = new Scanner(System.in);	//콘솔입력위해
	//반복문
	for(int i=0;i<5;i++) {
		s[i] = new Student();	//개별 객체 생성(학생 하나하나 생성)
		s[i].setNo(i+1);;	//번호 부여(private변수-gettersetter)
		System.out.print((i+1)+"번째 국어 : ");
		s[i].setKor(scn.nextInt());	//ㄴ국어값 입력
		System.out.print((i+1)+"번째 영어 : ");
		s[i].setEng(scn.nextInt()); 
		System.out.print((i+1)+"번째 수학 : ");
		s[i].setMat(scn.nextInt());
	}
	System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t");
	for(int i=0;i<5;i++) {
		s[i].print();
	}
	
	
}

}
