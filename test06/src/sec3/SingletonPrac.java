package sec3;

public class SingletonPrac {
	private static SingletonPrac instance;
	private SingletonPrac() { }
	public static synchronized SingletonPrac getInstance() {
		if(instance==null) instance = new SingletonPrac();
		return instance;
	}
}
