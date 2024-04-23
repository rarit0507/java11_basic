package org.kh.object1;

public class Student {
	
	String name = "아무개";
	int kor=100, eng=100, mat=100;	//클래스 설정 시 =100 등으로 초기화하여 기본값 만들 수 있음
	
	public int tot() {		//총점 = 행위 = 메소드
		return this.kor+this.eng+this.mat;
	}
	public double avg() {	//평균=반환타입 '실수' => double
		return (this.kor+this.eng+this.mat)/3.0f;
	}
	
	void resulting() {
		System.out.println("이름 : "+this.name+", 총점 : "+this.tot()+", 평균 : "+this.avg());
	}
		
	
		

}
