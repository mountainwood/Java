package com.iii.cb101.mt;

public class MainArgsDemo {

	public static void main(String[] args) {
		//�R�O�C�޼�
		String name = args[0];
		int age = Integer.parseInt(args[1]);	//�N�r���ন���
		System.out.println("Your name is " + name);
		System.out.println(name + ", your age is " + age);

	}	//end of main()

}	//end of class MianArgsDemo

		/*���~�T���GException in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
			at com.iii.cb101.mt.MainArgsDemo.main(MainArgsDemo.java:7)
			�Y�O��������{���A�t�η|�{�Ѩ�ҵ������ܼƤ����A�ҥH�n�HRun Configurations��
			program arguments �� variables��select variable �� string_prompt �Ӱ���
			*/