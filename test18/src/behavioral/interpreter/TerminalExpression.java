package behavioral.interpreter;
//Terminal Expression :표현식의 문자열 검증
public class TerminalExpression implements Expression {

	private String data;	//문자열이 있나 없나만 확인하면 됨
	
	
	public TerminalExpression(String data) {
		this.data = data;
	}


	@Override
	public boolean interpreter(String context) {
		if(context.contains(data)) {
			return true;
		}
		return false;
	}

}
