package org.kh.app2;

public class Loop1 {

	public static void main(String[] args) {

		int n = 0;
		int[] nums = {80,95,75,60,100,65,70,90,85,95};		//배열. 참조형 자료(<->기본형)
		String[] names = {"김","이","박","최","정","오","배","강","장","계"};
		int tot = 0;
		int max=0, min=nums[0];
		System.out.println("nums : " + nums);
		System.out.println("names : " + names);
		System.out.println("\n이름\t점수\t학점\t판정");
		
		for(int i=0;i<10;i++) {
			tot += nums[i];
			//이름&점수
			System.out.print(names[i]+"\t");
			System.out.print(nums[i]+"\t");
			//학점
			if(nums[i]>=90) {
				System.out.print("A\t");		//print: 옆으로 쭉 출력, \t(탭), \n(줄넘김)만 사용 가능
			} else if(nums[i]>=80) {			//printf: 옆으로 쭉 출력, %d(10진수), %s(문자열) 사용 가능
				System.out.print("B\t");		//println: 한 줄 출력하고 다음 줄 넘김. \t 사용하면 한 줄 더 건너 뜀.
			} else if(nums[i]>=70) {
				System.out.print("C\t");
			} else if(nums[i]>=60) {
				System.out.print("D\t");
			} else {
				System.out.print("F\t");
			}
			//판정
			if(nums[i]>=70) {
				System.out.print("합격\n");
			} else {
				System.out.print("탈락\n");
			}
			//최대최소
			if(nums[i]>max) {
				max=nums[i];
			}
			if(nums[i]<min) {
				min=nums[i];
			}
		}
		System.out.println("전체 총점 : " + tot);
		System.out.println("평균 : " + tot/10.0f);	//f : 계산하는 두 수 중 하나는 실수여야 계산이 됨
		System.out.println("최대 점수 : " + max);
		System.out.println("최소 점수 : " + min);
	}

}
