package com.iii.cb101.mt;

public class arrayAssignDemo {

	public static void main(String[] args) {
		//測試 1.
		int[] data = {1,2,3,4,5,6};
		int[] data1 = data;
		for(int i =0 ;i< data.length - 3; i++) {
			data[i] = data [i] * 10;
		}
		for(int i = 0; i < data1.length; i++) {
			System.out.printf("驗證1：%d%n",data1[i]);
		}
		//測試2.
		/*
		int[] data2 = {1,2,3,4,5,6};
		int[] data21 = new int [6];
		data21 = data2;
		for(int i =0 ;i< data.length - 3; i++) {
			data2[i] = data2 [i] * 10;
		}
		for(int i = 0; i < data1.length; i++) {
			System.out.printf("驗證1：%d%n",data1[i]);
		未完成*/
		
		//測試3.
		int[] data3 = {1,2,3,4,5,6};
		int[] data31 = new int [6];
		for(int i = 0; i < data31.length; i++) {
			data31[i] = data3[i] ;		//將data3的元素逐一指定給data31
		}
		for(int i =0 ;i< data3.length - 3; i++) {
			data3[i] = data3 [i] * 10;
		}
		for(int i = 0; i < data31.length; i++) {
			System.out.printf("驗證3：%d%n",data31[i]);
		}
		

	}

}
		/*結果1.
		10
		20
		30
		4
		5
		6
		 */