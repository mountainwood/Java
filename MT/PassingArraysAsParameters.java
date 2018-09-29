package com.iii.cb101.mt;

public class PassingArraysAsParameters {

	static void method(int[] data) {
		for(int i = 0; i < data.length; i++) {
			data[i] = data[i] + data[i]*10;
		}
		
	}
	public static void main(String[] args) {
		int[] data = {2,6,1,4,3,5};
		method(data);
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			
		}
	

	}

}
