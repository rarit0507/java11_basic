package sec1;

interface Meterial {
	void doPrinting();
}

class Powder implements Material {
	@Override
	public void doPrinting() {
		System.out.println("파우더 재료로 출력합니다.");
	}
	public String toString() {
		return "Powder";
	}
	
class Plastic implements Meterial {
	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력합니다.");
	}
	public String toString() {
	return "Plastic";
	}
}

//T extends Material => 제네릭의 한정자(Meterial의 후손 클래스만 가능)★★★★★
class GenericPrint<T extends Material> {
	private material;
	
}
	
public class GenericExam3 {
	public static void main(String[] args) {
		Plastic p1 = new Plastic();
		GenericPrint<Plastic> g1 = 
	}
}
