package com.iii.cb101.mt;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		float f = 3.8F; // 需要指定右邊為FLOAT，因為左邊的數值預設是double，所以要指定為float
		System.out.println(f);
		double d = 5.3;
		System.out.println(d);
		//double d = 5.3D; 左邊為指定變數的型態，右邊(D)為指定賦值的型態
		//System.out.println(d);
	}

}
