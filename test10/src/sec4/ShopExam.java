package sec4;

public class ShopExam {

	public static void main(String[] args) {
		//Shop Delivery 둘 다 됨
		Shop s1;
		Delivery s2;
		
		s1 = new Shop();
		s2 = new Shop();	//생성을 Delivery로 하면 안에 Buy Sell Delivery 구현 내용 다 써 줘야 함
		
		s1.buy();
		s1.sell();
		s1.delivery();
		
		s2.buy();
		s2.sell();
		s2.delivery();
	}

}
