package org.kh.app2;

public class Loop2 {

	public static void main(String[] args) {
	
		int[] ns = {9,12,3,7,6,8,10,11};
		int max = 0;
		int min = ns[0];	//첫번째 값 넣으면 됨(첫번째 값이 최솟값이면 그대로, 아니면 변해서 나올 것)
		
		System.out.print("최대값\t최소값\n");
		for(int i=0;i<8;i++) {
			if(ns[i]>max) {
				max = ns[i];
			}
			if(ns[i]<min) {
				min = ns[i];
			}
		}
		System.out.print(max+ "\t");
		System.out.print(min+ "\t\n");
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}

}
