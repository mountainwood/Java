package com.iii.cb101.mt;

public class Recursive {
	
	static void method(int n) {
		System.out.println("level" + n);
		if (n < 4) method(n+1);
		System.out.println("LEVEL"+ n);
	}	//end of method()
	public static void main(String[] args) {
	
		method(1);
	}//end of main()

}//end of class RecursiveDemo

//********每個 method 要確實結束，確實走到「}」，記憶體是分別索要的，非重疊****************
/* 結果
 level2
level3
level4
LEVEL4
LEVEL3
LEVEL2
LEVEL1*/
