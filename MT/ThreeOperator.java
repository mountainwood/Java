package com.iii.cb101.mt;

public class ThreeOperator {

	public static void main(String[] args) {
		/*
		 * if (x > y){
		 * 		a = x;
		 * }else{
		 * 		a = y;
		 * }
		 * */
		
		int coverage = 200, area = 300, count;
		count = area / coverage;
		count += (area % coverage == 0)? 0:1;
		String unit = (count == 1)?"can" : "cans";
		System.out.println("println type: Need " + count + " " + unit + " to paint");
		System.out.printf("printf type: Need %d %s to paint", count, unit);

	}

}
