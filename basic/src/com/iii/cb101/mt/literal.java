package com.iii.cb101.mt;

public class literal {

	public static void main(String[] args) {
		int x = 100;	//
		System.out.println(x);
		x = 0144;	//�u��assign �ԭz
		System.out.println(x);
		x = 0x64;
		System.out.println(x);
		double d = 3.14159;
		System.out.println(d);
		d = 5.23E12;
		System.out.println(d);
		char c = 'A';
		System.out.println(c);
		c = '\u0042';
		System.out.println(c);
		c = '�a';
		System.out.println(c);
		String e = "�a�x";
		System.out.println(e);//Invalid character constant
		
		final double PI = 3.14136;
		int r = 10;
		double circlA = r * r * PI;
		double circleB = 2 * r * PI;
		System.out.println(circlA);
		System.out.println(circleB);
	}

}
