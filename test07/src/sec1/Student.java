package sec1;
//필드 : 번호, 국어, 영어, 수학
//메소드 : getter/setter 및 총점, 평균, 학점, 모든 학생 정보 출력
public class Student {
	private int no;
	private int kor;
	private int eng;
	private int mat;
	public Student() { }	//디폴트생성자(생성자 입력 없을 시 자동생성)
	public Student(int no, int kor, int eng, int mat) {
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//학생정보출력 toString
	@Override
	public String toString() {
		return "Student [no=" + no + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	//gettersetter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	//총점
	public int tot() {
		return(this.kor + this.mat + this.eng);
	}
	//평균
	public double avg() {
		return(this.tot()/3.0f);
	}
	//학점
	public String hak() {
		String k = "F";
		if(this.avg()>=90) k="A";
		else if(this.avg()>=80) k="B";
		else if(this.avg()>=70) k="C";
		else if(this.avg()>=60) k="D";
		else k = "F";
		return k;
	}
	
	//모든 정보 출력
	public void print() {
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n", this.no, this.kor, this.eng, this.mat, this.tot(), this.avg(), this.hak());
	}
}
