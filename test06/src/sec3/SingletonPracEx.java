package sec3;

public class SingletonPracEx {

	public static void main(String[] args) {
		SingletonPrac ins1 = SingletonPrac.getInstance();
		SingletonPrac ins2 = SingletonPrac.getInstance();
		SingletonPrac ins3 = SingletonPrac.getInstance();
		
		System.out.println(ins1);
		System.out.println(ins2);
		System.out.println(ins3);
	}

}
