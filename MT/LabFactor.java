package com.iii.cb101.mt;

public class LabFactor {
	/*static int factorial(int m) {
		int result = 1;
		
		for (int i = 1; i <= m; i++) {
			result = result * m;
		}
		return result;
	}
	public static void main(String[] args) {
		
		System.out.print(factorial(4));
	}
	*/
	
	
	static int factorial(int m) {		//�令long���A	
		int result = 1;				//�令long���A
		
		for (int i = m; i >=1 ; i--) {
			//result *= i ;					//�g���g�� m�A�ܦ��� 4 �� 4 ����
			result = result * i;
		}
		return result;
	}
	public static void main(String[] args) {
		int m = 4;
		System.out.printf("%d! = %d%n",m ,factorial(m));		//m�V�j�A�|���ͷ�����D�A�ҥH�n��long��֤@�Ǫ��p
																//�Y�ڨS�b main�̫ŧi m�A�h�L�k�ϥ� m �o���ܼơAmethod�Χ��N�|�k�ٰO��
		System.out.println(factorial(5));		//������D
		System.out.println(factorial(6));		//������D
		System.out.println(factorial(7));		//������D
		System.out.println(factorial(8));		//������D
		System.out.println(factorial(10));		//������D
		System.out.println(factorial(50));		//������D
		System.out.println(factorial(51));		//������D
			/*
			24
			120
			720
			5040
			40320
			3628800
			0
			0
			*/
		
	}

}
