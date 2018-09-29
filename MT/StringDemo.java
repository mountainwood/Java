package com.iii.cb101.mt;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Hello world, welcome to Java world.";
		System.out.printf("%s%n", str.charAt(6));			//透過索引值取得字串內某個字元
		//結果：w
		System.out.printf("%s%n", str.length());			//傳回字串長度
		//結果：35
		System.out.printf("%s%n", str.substring(13));		//
		//結果：welcome to Java world.
		System.out.printf("%s%n", str.substring(0, 11));	//
		//結果：Hello world
		System.out.printf("%s%n", str.indexOf("world"));	
		//結果：6
		System.out.printf("%s%n", str.indexOf("World"));
		//結果：-1
		System.out.printf("%s%n", str.indexOf("world", 7));
		//結果：29
		System.out.printf("%s%n", str.lastIndexOf("world"));
		//結果：29
		
		String[] tokens = str.split(" ");
		for(int i = 0; i < tokens.length; i++) {	//把每個遇到空白所切開的字串印出來
			System.out.printf("%s%n",tokens[i]);
		}
		/*
		Hello
		world,
		welcome
		to
		Java
		world.*/
		System.out.println(tokens.length);	//等於6，每遇到一個空白就切開
		
		String[] tokens2 = str.split(",");
		for(int i = 0; i< tokens2.length; i++) {	//把每個遇到逗號所切開的字串印出來
			System.out.printf("%s%n",tokens2[i]);
		}
		/*
		Hello world
 		welcome to Java world.*/
	}

}
