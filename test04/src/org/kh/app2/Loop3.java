package org.kh.app2;

public class Loop3 {

	public static void main(String[] args) {
		int[] nums = {80,95,75,60,100,65,70,90,85,95};
		
		//배운거
		System.out.println("점수\t판정");
		for(int i=0;i<nums.length;i++) {		//i<nums.length = i<10. 개수 늘어나면 수정 필요 X
			System.out.print(nums[i] + "\t");
			if(nums[i]>=80) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
		
		System.out.println("=============================");
		//가장 많이 쓰는 방법(배열, 클래스, 인스턴스 다 씀). 자바 1.6 이상의 개선된 for문
		for(int n : nums) {
			if(n>=80) System.out.println(n + " => 합격");
			else System.out.println(n + " => 불합격");
		}
	}
}
