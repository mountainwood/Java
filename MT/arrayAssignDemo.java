package com.iii.cb101.mt;

public class arrayAssignDemo {

	public static void main(String[] args) {
		//���� 1.
		int[] data = {1,2,3,4,5,6};
		int[] data1 = data;
		for(int i =0 ;i< data.length - 3; i++) {
			data[i] = data [i] * 10;
		}
		for(int i = 0; i < data1.length; i++) {
			System.out.printf("����1�G%d%n",data1[i]);
		}
		//����2.
		/*
		int[] data2 = {1,2,3,4,5,6};
		int[] data21 = new int [6];
		data21 = data2;
		for(int i =0 ;i< data.length - 3; i++) {
			data2[i] = data2 [i] * 10;
		}
		for(int i = 0; i < data1.length; i++) {
			System.out.printf("����1�G%d%n",data1[i]);
		������*/
		
		//����3.
		int[] data3 = {1,2,3,4,5,6};
		int[] data31 = new int [6];
		for(int i = 0; i < data31.length; i++) {
			data31[i] = data3[i] ;		//�Ndata3�������v�@���w��data31
		}
		for(int i =0 ;i< data3.length - 3; i++) {
			data3[i] = data3 [i] * 10;
		}
		for(int i = 0; i < data31.length; i++) {
			System.out.printf("����3�G%d%n",data31[i]);
		}
		

	}

}
		/*���G1.
		10
		20
		30
		4
		5
		6
		 */