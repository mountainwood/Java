package com.iii.cb101.mt;

public class MathDemo {

	public static void main(String[] args) {
		System.out.println(Math.rint(3.5));		//4
		System.out.println(Math.rint(-3.5));		//-4
		System.out.println(Math.rint(3.8));		//4
		System.out.println(Math.rint(-3.8));	//-4
		System.out.println(Math.floor(3.8));	//3
		System.out.println(Math.floor(-3.8));	//-4
		System.out.println(Math.ceil(3.8));		//4
		System.out.println(Math.ceil(-3.8));	//-3
		System.out.println(Math.round(3.8));	//	4
		System.out.println(Math.round(-3.8));	//	-3
		System.out.println(Math.sqrt(16));		//	4
		System.out.println(Math.sqrt(-16));		//NaN
		System.out.println(Math.pow(2,5));		//32
		

	}

}
