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

//********�C�� method �n�T�굲���A�T�ꨫ��u}�v�A�O����O���O���n���A�D���|****************
/* ���G
 level2
level3
level4
LEVEL4
LEVEL3
LEVEL2
LEVEL1*/
