package com.iii.cb101.mt;

public class ForEach {

	public static void main(String[] args) {
		//一維		
		int sum1 = 0;
		int[] oneDim = {2,6,1,4,3,5};
		for(int n:oneDim)
			sum1 = sum1 + n;
		System.out.printf("一維為 %d%n",sum1);
		
		//二維
		int sum2 = 0;
		int[][] twoDim = {{2,6,1},{4,3,5}};
		for(int[] m : twoDim)
			for(int n: m)
				sum2 = sum2 + n;
		System.out.printf("二維為 %d%n", sum2);
		
		//三維
		int sum3 = 0;
		int[][][] threeDim = {{{2,6,1},{4,3,5}},{{1,2,3},{2,3,4}},{{7,8,9},{4,5,6}}};
		for (int[][] s:threeDim) {
			for(int[] m: s) {
				for(int n: m) {
					sum3 = sum3 +n; 
				}
			}
		}
		System.out.printf("三維為 %d%n ",sum3);

	}

}
