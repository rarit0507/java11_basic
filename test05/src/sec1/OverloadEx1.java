package sec1;

public class OverloadEx1 {

	public static void main(String[] args) {
		
		Product pro1 = new Product();
		pro1.print();
		pro1.print("실바니안");
		pro1.print(300);
		pro1.print("카피바라", 1000);
		pro1.print(700, "오리너구리");
		
		Product pro2 = new Product();
		pro2.print("집보내줘");
	}

}
