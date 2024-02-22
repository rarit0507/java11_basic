package org.kh.app2;

import java.util.Random;

public class Loop7 {

	public static void main(String[] args) {

		int max=45, min=1;
		Random r = new Random();	//랜덤숫자
		
		//for문
		for(int i=0;i<6;i++) {
			int val = r.nextInt(max + min) + min;
			System.out.print(val+"\t");
		}
		
		System.out.print("\n================================\n");
		
		//while문
		int j=0;
		while(j<6) {
			int val = r.nextInt(max + min) + min;
			System.out.print(val+"\t");
			j++;
		}
	}

}
