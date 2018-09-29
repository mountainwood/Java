package com.iii.cb101.mt;
import java.util.Scanner;		//不可以空白
public class scannerDEMO {		//import相關，檔名不能和import的函數一樣
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your name:");
		String name = scanner.next();
		System.out.println("Please input your age:");
		int age = scanner.nextInt();
		scanner.close();
		System.out.println("Your name is" + name);
		System.out.println(name + ",your age is " + age);
	}

}
