package sec4;

public class MarcketExam {

	public static void main(String[] args) {
		Buy buy;
		buy = new Marcket();	//선언은 Buy, Sell(인터페이스), Marcket 중 Marcket(클래스)만 가능
		buy.buy();				//buy만 됨
		
		Sell sell;
		sell = new Marcket();
		sell.sell();			//sell만 됨
	}

}
