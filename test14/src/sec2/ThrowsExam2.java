package sec2;
//다른 함수를 정의하여 그 함수에 예외를 떠넘김. main함수 부담 줄이기(교재에 없음)
//행위에 맞는 메소드를 만들고 그에 해당하는 예외를 메소드(함수)에 떠넘기기
public class ThrowsExam2 {

	public static void main(String[] args) {	//main메소드에 throws로 예외를 떠넘기지 않는 경우(main부담X)
		String name = null;
		nullPassing(name);	//null
		
		int[] arr = {100,80,90};
		arrayPassing(arr);
		
		String data = "rarit0507";
	}
	//함수
	public static void nullPassing(String name) throws NullPointerException {	//함수에다 NullPointer예외 떠넘기기
		System.out.println(name);
	}	
	//배열 순회 출력
	public static void arrayPassing(int[] arr) throws ArrayIndexOutOfBoundsException {	//배열출력개수초과 예외 떠넘기기
		int tot = 0;
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
			tot=arr[i];
		}
		System.out.println("합계 : "+tot);
	}
}
