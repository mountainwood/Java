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

	}					//Java���method����{�A�O�H��k�W�H�ζǦ^�Ѽƪ����A�A��k�P�W�A�u�n�Ǧ^�Ѽƪ����A���P�A���i�ϥ�
	/*���G
	 *  Hello!
		Hello!John
		Hello!Mary
	*/
}
