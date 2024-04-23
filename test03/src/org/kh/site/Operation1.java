package org.kh.site;
//명령(연산) => Operation(Opcode + Operhand) : 0주소 방식 ~ 3주소 방식
//입력 항에 따라 : 단항(Unary), 이항(Binary), 삼항(ThreeFlow)
public class Operation1 {
	public static void main(String[] args) {
		
		//단항 연산
		boolean b1 = true;
		boolean b2 = !b1;
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		//이항 연산
		int i1 = 20, i2 = 40;
		int i3 = i1 + i2;
		System.out.println("i3 = " + i3);
		
		//삼항 연산(이거 하나만 있음)
		int max = (i1 > i2) ? i1 : i2;	//만약 ~, 맞으면 i1, 아니면 i2
		System.out.println("max = " + max);
	}

}
