package sec1;

class StudentMap<K, V>{
	private K key;
	private V value;	//앞에는 번호, 뒤에는 값. 한 번에 저장하고 싶다 => Map구조★★★
	
	public StudentMap() {}
	public StudentMap(K key, V value) {
		super();
		this.key = key;	//번호
		this.value = value;	//값
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}
public class GenericExam2 {

	public static void main(String[] args) {
		StudentMap<Integer, String> s1 = new StudentMap<>(1, "키아누리브스");	//K, V에 해당하는 값 지정(기본형X)
		StudentMap<Integer, String> s2 = new StudentMap<>(2, "앤드류가필드");
		StudentMap<Integer, String> s3 = new StudentMap<>(3, "라이언레이놀즈");
		StudentMap<Integer, String> s4 = new StudentMap<>(4, "톰크루즈");
		
		StudentMap<String, Integer> s5 = new StudentMap<>("키아누리브스", 50);
		StudentMap<String, Integer> s6 = new StudentMap<>("앤드류가필드", 40);
		
		Student st1 = new Student("김민식", 25);	//생성자 기반
		StudentMap<Student, Integer> s7 = new StudentMap<>(st1, 50);
	}

}
