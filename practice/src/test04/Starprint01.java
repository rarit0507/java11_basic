package test04;

public class Starprint01 {

	public static void main(String[] args) {

		/*1
		******
		******
		******
		******
		 */
		System.out.println(1);
		for(int i=0;i<4;i++) {
			for(int j=0;j<6;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		/*2
		*
		**
		***
		****
		*****
		******
		 */
		System.out.println(2);
		for(int i=1;i<=6;i++) {
			for(int j=0;j<i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		/*3
		******
		*****
		****
		***
		**
		*
		 */
		System.out.println(3);
		for(int i=0;i<6;i++) {
			for(int j=6;j>i;j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		/*4
		******
		 *****
		  ****
		   ***
		    **
		     *
		 */
		System.out.println(4);
		for(int i=0;i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.printf(" ");
			}
			for(int k=6;k>i;k--) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		/*5
		 	 *
		    **
		   ***
		  ****
		 *****
		******
		 */
		System.out.println(5);
		for(int i=1;i<=6;i++) {
			for(int j=6;j>i;j--) {
				System.out.printf(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		/*6
		*
		**
		***
		****
		*****
		******
		*****
		****
		***
		**
		*
		 */
		System.out.println(6);
		for(int i=1;i<=11;i++) {
			int k;
			if(i<=6) {
				k = i;
			} else {
				k = 12-i;
			}
			for(int j=0;j<k;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		/*7
		******
		*****
		****
		***
		**
		*
		**
		***
		****
		*****
 		******
		 */
		System.out.println(7);
		for(int i=0;i<11;i++) {
			int k;
			if(i<5) {
				k = 6-i;
			} else if(i==5) {
				k = 1;
			} else {
				k = i-4;
			}
			for(int j=0;j<k;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		/*8
			*
		   **
		  ***
		 ****
		*****
	   ******
		*****
		 ****
		  ***
		   **
		    *
		 */
		System.out.println(8);
		int i;	//row 변수
		int j;	//column 변수
		
		int k;	//space 변수
		int l;	//* 변수
		
		for(i=0;i<11;i++) {
			if(i<5) {
				k = 5-i;
				l = i+1;
			} else if(i==5) {
				k = 0;
				l = 6;
			} else {
				k = i-5;
				l = 11-i;
			}
			for(j=0;j<k;j++) {
				System.out.printf(" ");
			}
			for(j=0;j<l;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		/*9
		    *
		   ***
		  *****
		 *******
		*********
		 */
		System.out.println(9);
		//int i;	//row
		//int j;	//column
		
		/*for(i=0;i<5;i++) {
			for(j=4;j>0;j--) {
				System.out.printf(" ");
			}
			for(j=1;j<=9;j+=2) {
				System.out.printf("*");
			}
			System.out.println();*/
		
		
		/*10
		*********
		 *******
		  *****
		   ***
		    *
		 */
		//System.out.println(10);
		
		
		/*11
		    *
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    *
		 */
		//System.out.println(11);
		
		
		/*12
		***** *****
		****   ****
		***     ***
		**       **
		*         *
		**       **
		***     ***
		****   ****
		***** *****
		 */
		//System.out.println(12);
	}

}
