package org.kh.app2;
//중첩 for문을 활용한 별 찍기
public class StarPrint {

	public static void main(String[] args) {
		/*
		 
		 ******
		 ******
		 ******
		 ******
		 
		 */
		for(int i=0;i<4;i++) {
			for(int j=0;j<6;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 
		 */
		for(int i=0;i<=6;i++) {		//첫 0번째 줄은 0<0이므로 실행X
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 
		 ******
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */
		for(int i=6;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 
		 ******
		  *****
		   ****
		    ***
		     **
		      *
		 
		 */
		for(int i=0;i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=6;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		    *
		   ***
		  *****
		 *******
		
		 */
		for(int i=0;i<4;i++) {
			for(int j=3;j>0;j--) {
				System.out.printf(" ");
			}
			for(int j=0;j<7;j++) {
				if(j%2==0) {
					continue;
				} else {
					System.out.println("*");
				}
			}
		}
		
		
	}

}
