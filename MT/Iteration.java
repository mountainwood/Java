package com.iii.cb101.mt;

public class Iteration {

	public static void main(String[] args) {
		//�N�Ʀr�q 1 �[�� 10
		//while
		int n = 1;
		int sum = 0;
		while(n <= 10) {
			sum += n;
			n++;
		}
		System.out.printf("while���d�ҡAsum���G%d�An = %d%n", sum, n);
		
		//do...while
		n = 1;
		sum = 0;
		do {
			sum += 0;
			n++;
		}while (n <= 10);
		System.out.printf("do...while���d�ҡAsum���G%d�An = %d%n", sum, n);
		
		//for
		int p = 1;
		sum = 0;
		for(p = 1; n<= 10; n++) {
			sum =+ sum + p;			
		}
		System.out.printf("for���d�ҡAsum���G%d�An = %d%n", sum, n);
		
		//while - 10 �[�� 1 
		n = 1;
		sum = 0;
		while(n <= 10) {
			sum += n;
			n++;
		}
		System.out.printf("while���d�ҡAsum���G%d�An = %d%n", sum, n);
		
		//while - 10 �[�� 1�A���Ƭۥ[ 
				n = 0;
				sum = 0;
				while(n <= 10) {
					sum += n;
					n = n + 2;
				}
				System.out.printf("while���d�ҡAsum���Ƭۥ[���G%d�An = %d%n", sum, n);
				
		//while - 10 �[�� 1�A���Ƭۥ[ 
		n = 1;
		sum = 0;
		while(n <= 10) {
			sum += n;
			n = n + 2;
		}
		System.out.printf("while���d�ҡAsum�_�Ƭۥ[���G%d�An = %d%n", sum, n);
		
	}

}
