package com.iii.cb101.mt;

public class Factor1 {

	static int factorial(int m) {		//改成long型態	
		int result = 1;				//改成long型態
		
		for (int i = m; i >=1 ; i--) {
			//result *= i ;					//寫錯寫成 m，變成做 4 的 4 次方
			result = result * i;
		}
		return result;
	}
	public static void main(String[] args) {
		
		int m = Integer.parseInt(args[0]);
		System.out.printf("%d! = %d%n", m ,factorial(m));		//m越大，會產生溢位問題，所以要用long減少一些狀況
																//若我沒在 main裡宣告 m，則無法使用 m 這個變數，method用完就會歸還記體
		System.out.println(factorial(5));		//溢位問題

			/*
			24

			*/
		
	}

}
