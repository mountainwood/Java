package com.iii.cb101.mt;

public class MainArgsDemo {

	public static void main(String[] args) {
		//命令列引數
		String name = args[0];
		int age = Integer.parseInt(args[1]);	//將字串轉成整數
		System.out.println("Your name is " + name);
		System.out.println(name + ", your age is " + age);

	}	//end of main()

}	//end of class MianArgsDemo

		/*錯誤訊息：Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
			at com.iii.cb101.mt.MainArgsDemo.main(MainArgsDemo.java:7)
			若是直接執行程式，系統會認識其所給予的變數不足，所以要以Run Configurations裡
			program arguments → variables→select variable → string_prompt 來執行
			*/