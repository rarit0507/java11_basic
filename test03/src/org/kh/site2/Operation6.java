package org.kh.site2;
//논리 연산자(Lpgical)
public class Operation6 {

	public static void main(String[] args) {

		// &&(and), ||(or), !(not)
		
		int a = 26;
		int b = 28;
		int c = 27;
		
		//and 논리(논리곱) : 모든 입력이 true => true
		System.out.println("a > b && a > c : " + (a > b && a > c));		//false && false => false
		System.out.println("a > b && b > c : " + (a > b && b > c));		//false && true  => false
		System.out.println("a < b && b < c : " + (a < b && b < c));		//true && false  => false
		System.out.println("a < b && b > c : " + (a < b && b > c));		//true && true	 => true
		
		//or 논리(논리합) : 입력이 어느 하나라도 true => true
		System.out.println("a > b || a > c : " + (a > b || a > c));		//false && false => false
		System.out.println("a > b || b > c : " + (a > b || b > c));		//false && true  => true
		System.out.println("a < b || b < c : " + (a < b || b < c));		//true && false  => true
		System.out.println("a < b || b > c : " + (a < b || b > c));		//true && true	 => true
		
		//not 논리(논리부정) : true => false / false => true
		System.out.println("!(a > b_) : " + !(a > b)); 		//false => true
		System.out.println("!(a < b_) : " + !(a < b)); 		//true => false
	}

}
