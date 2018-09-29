package com.iii.cb101.mt;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Hello world, welcome to Java world.";
		System.out.printf("%s%n", str.charAt(6));			//�z�L���ޭȨ��o�r�ꤺ�Y�Ӧr��
		//���G�Gw
		System.out.printf("%s%n", str.length());			//�Ǧ^�r�����
		//���G�G35
		System.out.printf("%s%n", str.substring(13));		//
		//���G�Gwelcome to Java world.
		System.out.printf("%s%n", str.substring(0, 11));	//
		//���G�GHello world
		System.out.printf("%s%n", str.indexOf("world"));	
		//���G�G6
		System.out.printf("%s%n", str.indexOf("World"));
		//���G�G-1
		System.out.printf("%s%n", str.indexOf("world", 7));
		//���G�G29
		System.out.printf("%s%n", str.lastIndexOf("world"));
		//���G�G29
		
		String[] tokens = str.split(" ");
		for(int i = 0; i < tokens.length; i++) {	//��C�ӹJ��ťթҤ��}���r��L�X��
			System.out.printf("%s%n",tokens[i]);
		}
		/*
		Hello
		world,
		welcome
		to
		Java
		world.*/
		System.out.println(tokens.length);	//����6�A�C�J��@�ӪťմN���}
		
		String[] tokens2 = str.split(",");
		for(int i = 0; i< tokens2.length; i++) {	//��C�ӹJ��r���Ҥ��}���r��L�X��
			System.out.printf("%s%n",tokens2[i]);
		}
		/*
		Hello world
 		welcome to Java world.*/
	}

}
