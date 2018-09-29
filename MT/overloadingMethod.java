package com.iii.cb101.mt;

public class overloadingMethod {
	static void greeting() {
		System.out.println("Hello!");
	}
	static void greeting(String name) {
		System.out.println("Hello!" + name);
	}
	static void greeting(String name, int n) {
		System.out.println("Hello!" + name);
	}
	public static void main(String[] args) {
		greeting();
		greeting("John");
		greeting("Mary", 3);

	}					//Java對於method的辨認，是以方法名以及傳回參數的型態，方法同名，只要傳回參數的型態不同，仍可使用
	/*結果
	 *  Hello!
		Hello!John
		Hello!Mary
	*/
}
