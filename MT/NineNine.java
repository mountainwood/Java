package com.iii.cb101.mt;

public class NineNine {

	public static void main(String[] args) {
		//9x9 乘法表  - 1
		for(int i = 1; i<= 9; i ++) {
			for(int j = 1; j<= 9; j++) {
				System.out.print(i + " x " + j + " = " + i * j + "\t") ;				
			}
			System.out.print("\n");
		}
		System.out.println("===================================================================================================================================================");
		//9x9 乘法表  - 2
		for(int i = 1; i<= 9; i ++) {
			for(int j = 1; j<= 9; j++) {
				System.out.print(j + " x " + i + " = " + j * i + "\t") ;				
			}
			System.out.print("\n");
		}
		
	}

}
