package com.iii.cb101.mt;

public class EscapeSequence {

	public static void main(String[] args) {
		System.out.println("1.Hello world!!");
		System.out.print("2.Hello world!!\n");
		System.out.print("3.Hello");
		System.out.print(" World!!\n"); //換行只看\n，和打字的換行無關
		System.out.print("4.Hello\t");
		System.out.print("World!!");
		System.out.print("5.\\Hello\\");
		System.out.print("6.He's student.\n"); //顯示「'」字元，不一定需要 / 
		System.out.print("7.He\'s \"student.\\n"); //顯示字元
	}

}
