package sec2;

public class StringExam1 {

	public static void main(String[] args) {
		String name1 = "키아누리브스";
		String name2 = new String("키아누리브스");
		Integer su1 = 1004;
		String su2 = "1004";
		//String su3 = new String(su1)	//이렇게는 못함. 아래처럼.
		String su3 = String.valueOf(su1);	//valueOf(int i) 사용
		//System.out.println(su1.equals(su2));	//숫자열과 문자열 비교 불가
		System.out.println("su1 equals su2 : "+(su1.equals(su2)));
		System.out.println("su2 equals su3 : "+(su2.equals(su3)));

		String str = "강범준/박동빈/이성하/조대신/배곤희/권민지";
		String[] names = new String[6];
		names = str.split("/");	//이거 기준으로 str 나눠라. 분리(들어오는 문자열 덩어리 정보 분리할 때)
		for(String s : names) {
			System.out.println(s);
		}
		String str2 = String.join("/", names);	//문자열 합치기
		System.out.println(str2);
		
		
		String data = "  ivE\'s beaUty grOup\nnewJeans is girlGroup Top  ";
		
		char ten = data.charAt(9);	//10번째 문자(인덱스 = 9)
		System.out.println("10번째 문자(인덱스가 9인 문자) : "+ten);
		
		String trimData = data.trim();	//앞뒤 공백 제거하여 trimData에 저장
		System.out.println("앞뒤 공백 제거 : "+trimData.length()+"글자, "+trimData);
		
		int size = data.trim().length();	//글자수를 size에 저장
		System.out.println("앞뒤 공백 제거한 글자 수 : "+size);
		
		int n = data.trim().indexOf('n');	//n의 글자 위치(인덱스)를 n에 저장(\\앞에서부터)
		System.out.println("n의 글자 위치(인덱스)를 n에 저장 : "+n);
		
		int n2 = data.lastIndexOf('n');	//끝에서부터 찾은 마지막 n의 위치
		System.out.println("n의 글자 위치(인덱스)를 n에 저장 : "+n);
		
		String up = data.toUpperCase();	//모두 대문자로 변환하여 up에 저장
		System.out.println("모두 대문자로 변환 : "+up);
		
		String down = data.toLowerCase();	//모두 소문자로 변환하여 down에 저장
		System.out.println("모두 소문자로 변환 : "+down);
		
		String sub1 = data.substring(20, 30);	//공백을 제거하고, 모두 대문자로 변경하여 20~27번째 글자만 추출
		System.out.println("공백을 제거하고, 모두 대문자로 변경하여 20~29번째 글자만 추출"+sub1);
		
		String sub2 = data.replace("newJeans","Kepler");	//newJeans의 단어를 Kepler로 변경하여 sub2에 저장
		System.out.println("newJeans의 단어를 Kepler로 변경 : "+sub2);
		
		byte[] girl = data.getBytes();	//문자열을 girl 문자(byte)문자배열로 변환하여 저장
		System.out.println("글자 수 : "+girl.length);
		for(byte b:girl) {
			char k = (char) b;
			System.out.println(k);
		}
		
		String girlgroup = data.substring(data.lastIndexOf('g'),data.lastIndexOf('g')+9);	//girl의 g의 마지막+9
		girlgroup = girlgroup +" " +sub1;
		System.out.println("girlGroup");
		//문자(byte) 배열을 문자열(String)으로 변환 출력
		String str4 = new String(girl);
		System.out.println(str4);
		
	}

}
