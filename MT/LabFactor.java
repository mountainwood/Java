package com.iii.cb101.mt;

public class LabFactor {
	/*static int factorial(int m) {
		int result = 1;
		
		for (int i = 1; i <= m; i++) {
			result = result * m;
		}
		return result;
	}
	public static void main(String[] args) {
		
		System.out.print(factorial(4));
	}
	*/
	
	
	static int factorial(int m) {		//改成long型態	
		int result = 1;				//改成long型態
		
		for (int i = m; i >=1 ; i--) {
			//result *= i ;					//寫錯寫成 m，變成做 4 的 4 次方
			result = result * i;
		}
		return result;
	}
	public static void main(String[] args) {
		int m = 4;
		System.out.printf("%d! = %d%n",m ,factorial(m));		//m越大，會產生溢位問題，所以要用long減少一些狀況
																//若我沒在 main裡宣告 m，則無法使用 m 這個變數，method用完就會歸還記體
		System.out.println(factorial(5));		//溢位問題
		System.out.println(factorial(6));		//溢位問題
		System.out.println(factorial(7));		//溢位問題
		System.out.println(factorial(8));		//溢位問題
		System.out.println(factorial(10));		//溢位問題
		System.out.println(factorial(50));		//溢位問題
		System.out.println(factorial(51));		//溢位問題
			/*
			24
			120
			720
			5040
			40320
			3628800
			0
			0
			*/
		
	}

}
