package prac2;

public class GugudanExam {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"x"+i+"="+i*j+"\t");	//= printf("%dx%d=%d\t", j,i,j*i);
			}
			System.out.println();
		}
	}

}
