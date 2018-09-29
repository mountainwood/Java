package com.iii.cb101.mt;

public class methodDemo2 {
	static int sum(int x, int y){
		int z;
		z = x + y;
		return z;
	}
	public static void main(String[] args) {
		int a = 5, b = 6, c;
		c = sum(a, b);
		System.out.println(a + "+" + b + "=" +c);
		/*µ²ªG
		 * 5+6=11
		 * */
	}

}
