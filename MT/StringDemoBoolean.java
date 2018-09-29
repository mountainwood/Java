package com.iii.cb101.mt;

public class StringDemoBoolean {

	public static void main(String[] args) {
		String str = "Hello world, welcome to Java world.";
		System.out.println(str.startsWith("hello"));	//false

		String str1 = "HelloWorld";
		System.out.println(str1.endsWith(".java"));		//false
		
		String str2 = "2015-02-10";
		System.out.println(str2.replace('-', '/'));		//2015/02/10
		
		String str3 = "2015-02-10";
		System.out.println(str3.replaceAll("-", "/"));	//2015/02/10
		
		/*
		 * boolean equals(String str)�G�����r��O�_�۵�
		 * int compareT0(String str)�G�ѥ��ܥk�A�@�Ӥ@�Ӧr���̷�ascii�Ȥ���j�p
		*/
		String str4 = "Hello world";
		String str5 = "hello world";
		System.out.println(str4.compareTo(str5));		//-32
		System.out.println(str5.compareTo(str4));		//32
		
		String str6 = "apple";
		String str7 = "apples";
		System.out.println(str6.compareTo(str7));		//-1
		System.out.println(str7.compareTo(str6));		// 1
		
		System.out.println(str4.compareToIgnoreCase(str5));		//0 - �����j�p�g�᪺���
		System.out.println(str4.toLowerCase());		//hello world - ���p�g��
		System.out.println(str5.toUpperCase());		//HELLO WORLD - ���j�g�� 
		
		String str8 = "   apple     ";
		System.out.println(str8.trim());			//apple - �h���Y�����ťլq

	}

}
